package typings.tuyaPanelKit.themeMod

import typings.tuyaPanelKit.tuyaPanelKitStrings.dark
import typings.tuyaPanelKit.tuyaPanelKitStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalTheme extends js.Object {
  
  var brickButton: BrickButton = js.native
  
  var button: Button = js.native
  
  var checkbox: Checkbox = js.native
  
  var dialog: Dialog = js.native
  
  var global: Global = js.native
  
  var list: List = js.native
  
  var picker: Picker = js.native
  
  var popup: Popup = js.native
  
  var slider: Slider = js.native
  
  var switchButton: SwitchButton = js.native
  
  var text: Text = js.native
  
  var tips: Tips = js.native
  
  var topbar: Topbar = js.native
  
  var `type`: light | dark | String = js.native
}
object GlobalTheme {
  
  @scala.inline
  def apply(
    brickButton: BrickButton,
    button: Button,
    checkbox: Checkbox,
    dialog: Dialog,
    global: Global,
    list: List,
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
  implicit class GlobalThemeOps[Self <: GlobalTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrickButton(value: BrickButton): Self = this.set("brickButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: Button): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckbox(value: Checkbox): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog(value: Dialog): Self = this.set("dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: Global): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: List): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicker(value: Picker): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup(value: Popup): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider(value: Slider): Self = this.set("slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchButton(value: SwitchButton): Self = this.set("switchButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Text): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTips(value: Tips): Self = this.set("tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopbar(value: Topbar): Self = this.set("topbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: light | dark | String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
