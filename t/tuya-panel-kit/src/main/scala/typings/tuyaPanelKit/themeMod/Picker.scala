package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.PickerTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.PickerTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.PickerTheme> */
@js.native
trait Picker extends js.Object {
  
  var dark: PickerTheme = js.native
  
  var fontColor: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var light: PickerTheme = js.native
  
  var unitFontColor: js.UndefOr[String] = js.native
  
  var unitFontSize: js.UndefOr[Double] = js.native
}
object Picker {
  
  @scala.inline
  def apply(dark: PickerTheme, light: PickerTheme): Picker = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Picker]
  }
  
  @scala.inline
  implicit class PickerOps[Self <: Picker] (val x: Self) extends AnyVal {
    
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
    def setDark(value: PickerTheme): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: PickerTheme): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setUnitFontColor(value: String): Self = this.set("unitFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitFontColor: Self = this.set("unitFontColor", js.undefined)
    
    @scala.inline
    def setUnitFontSize(value: Double): Self = this.set("unitFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitFontSize: Self = this.set("unitFontSize", js.undefined)
  }
}
