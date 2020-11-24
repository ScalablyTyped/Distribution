package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxTheme extends js.Object {
  
  var activeColor: String = js.native
  
  var disabledColor: String = js.native
  
  var fontColor: String = js.native
  
  var size: Double = js.native
}
object CheckboxTheme {
  
  @scala.inline
  def apply(activeColor: String, disabledColor: String, fontColor: String, size: Double): CheckboxTheme = {
    val __obj = js.Dynamic.literal(activeColor = activeColor.asInstanceOf[js.Any], disabledColor = disabledColor.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxTheme]
  }
  
  @scala.inline
  implicit class CheckboxThemeOps[Self <: CheckboxTheme] (val x: Self) extends AnyVal {
    
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
    def setActiveColor(value: String): Self = this.set("activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColor(value: String): Self = this.set("disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
