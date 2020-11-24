package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.SwitchButtonTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.SwitchButtonTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.SwitchButtonTheme> */
@js.native
trait SwitchButton extends js.Object {
  
  var dark: SwitchButtonTheme = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var light: SwitchButtonTheme = js.native
  
  var margin: js.UndefOr[Double] = js.native
  
  var onThumbTintColor: js.UndefOr[String] = js.native
  
  var onTintColor: js.UndefOr[String] = js.native
  
  var thumbSize: js.UndefOr[Double] = js.native
  
  var thumbTintColor: js.UndefOr[String] = js.native
  
  var tintColor: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SwitchButton {
  
  @scala.inline
  def apply(dark: SwitchButtonTheme, light: SwitchButtonTheme): SwitchButton = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchButton]
  }
  
  @scala.inline
  implicit class SwitchButtonOps[Self <: SwitchButton] (val x: Self) extends AnyVal {
    
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
    def setDark(value: SwitchButtonTheme): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: SwitchButtonTheme): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOnThumbTintColor(value: String): Self = this.set("onThumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnThumbTintColor: Self = this.set("onThumbTintColor", js.undefined)
    
    @scala.inline
    def setOnTintColor(value: String): Self = this.set("onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTintColor: Self = this.set("onTintColor", js.undefined)
    
    @scala.inline
    def setThumbSize(value: Double): Self = this.set("thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbSize: Self = this.set("thumbSize", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
