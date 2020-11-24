package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerTheme extends js.Object {
  
  var fontColor: String = js.native
  
  var fontSize: Double = js.native
  
  var unitFontColor: String = js.native
  
  var unitFontSize: Double = js.native
}
object PickerTheme {
  
  @scala.inline
  def apply(fontColor: String, fontSize: Double, unitFontColor: String, unitFontSize: Double): PickerTheme = {
    val __obj = js.Dynamic.literal(fontColor = fontColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], unitFontColor = unitFontColor.asInstanceOf[js.Any], unitFontSize = unitFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerTheme]
  }
  
  @scala.inline
  implicit class PickerThemeOps[Self <: PickerTheme] (val x: Self) extends AnyVal {
    
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
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFontColor(value: String): Self = this.set("unitFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFontSize(value: Double): Self = this.set("unitFontSize", value.asInstanceOf[js.Any])
  }
}
