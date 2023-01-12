package typings.tuyaPanelKit.themeMod

import typings.tuyaPanelKit.tuyaPanelKitStrings.dark
import typings.tuyaPanelKit.tuyaPanelKitStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalTheme extends StObject {
  
  var brickButton: BrickButton
  
  var button: Button
  
  var checkbox: Checkbox
  
  var dialog: Dialog
  
  var global: Global
  
  var list: typings.tuyaPanelKit.themeMod.List
  
  var picker: Picker
  
  var popup: Popup
  
  var slider: Slider
  
  var switchButton: SwitchButton
  
  var text: Text
  
  var tips: Tips
  
  var topbar: Topbar
  
  var `type`: light | dark | String
}
object GlobalTheme {
  
  inline def apply(
    brickButton: BrickButton,
    button: Button,
    checkbox: Checkbox,
    dialog: Dialog,
    global: Global,
    list: typings.tuyaPanelKit.themeMod.List,
    picker: Picker,
    popup: Popup,
    slider: Slider,
    switchButton: SwitchButton,
    text: Text,
    tips: Tips,
    topbar: Topbar,
    `type`: light | dark | String
  ): GlobalTheme = {
    val __obj = js.Dynamic.literal(brickButton = brickButton.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], switchButton = switchButton.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any], topbar = topbar.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalTheme] (val x: Self) extends AnyVal {
    
    inline def setBrickButton(value: BrickButton): Self = StObject.set(x, "brickButton", value.asInstanceOf[js.Any])
    
    inline def setButton(value: Button): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setCheckbox(value: Checkbox): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: Global): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setList(value: typings.tuyaPanelKit.themeMod.List): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setPicker(value: Picker): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    inline def setPopup(value: Popup): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setSwitchButton(value: SwitchButton): Self = StObject.set(x, "switchButton", value.asInstanceOf[js.Any])
    
    inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTips(value: Tips): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    inline def setTopbar(value: Topbar): Self = StObject.set(x, "topbar", value.asInstanceOf[js.Any])
    
    inline def setType(value: light | dark | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
