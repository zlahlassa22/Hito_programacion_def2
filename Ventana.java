import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana() {
        //PANELESS
        JPanel panelbox = new JPanel();
        JPanel panelradio = new JPanel(new FlowLayout());
        JPanel botones = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel imagen = new JPanel();

        // CHECKBOX----
        JCheckBox katnis = new JCheckBox("Katniss");
        JCheckBox peta = new JCheckBox("Peeta");
        panelbox.add(katnis, null);
        panelbox.add(peta, null);

        // RADIOS----
        JRadioButton radio1 = new JRadioButton("OPT 1", true);
        JRadioButton radio2 = new JRadioButton("OPT 2");
        JRadioButton radio3 = new JRadioButton("OPT 3");
        JRadioButton [] radios= {radio1, radio2, radio3};
        ButtonGroup grupoRadios = new ButtonGroup();
        int y = 10;
        int height = 20;
        for (int i=0; i<radios.length;i++){
            radios[i].setBounds(10, y, 80, height);
            y += height + 10;
            grupoRadios.add(radios[i]);
            panelradio.add(radios[i]);

        }
        panelradio.setPreferredSize(new Dimension(100, y));


        // BOTONES
        JButton boton1 = new JButton("BUT 1");
        JButton boton2 = new JButton("BUT 2");
        botones.setLayout(new FlowLayout());
        botones.add(boton1);
        botones.add(boton2);
        botones.setLayout(new BoxLayout(botones,BoxLayout.X_AXIS));
        botones.setPreferredSize(new Dimension(0,50));


        // IMAGENES
        ImageIcon img = new ImageIcon("C:\\Users\\ik012982i9\\Pictures\\foto.jpg");
        JLabel image = new JLabel(img);
        JLabel image2 = new JLabel(img);
        JLabel image3 = new JLabel(img);
        JLabel image4 = new JLabel(img);
        imagen.setLayout(new GridLayout(2, 2));
        imagen.add(image);
        imagen.add(image2);
        imagen.add(image3);
        imagen.add(image4);

        // PANEL PRINCIPAL
        JPanel principal = new JPanel();
        principal.setLayout(new BorderLayout());
        principal.add(panelbox, BorderLayout.NORTH);
        principal.add(panelradio, BorderLayout.EAST);
        principal.add(botones, BorderLayout.SOUTH);
        principal.add(imagen, BorderLayout.CENTER);

        // FRAME
        JFrame frame = new JFrame("Try yourself");
        frame.setSize(700, 450);
        frame.add(principal);
        frame.setVisible(true);
    }
}

