package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupListTheme extends js.Object {
  
  var cellFontColor: String = js.native
}
object PopupListTheme {
  
  @scala.inline
  def apply(cellFontColor: String): PopupListTheme = {
    val __obj = js.Dynamic.literal(cellFontColor = cellFontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupListTheme]
  }
  
  @scala.inline
  implicit class PopupListThemeOps[Self <: PopupListTheme] (val x: Self) extends AnyVal {
    
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
    def setCellFontColor(value: String): Self = this.set("cellFontColor", value.asInstanceOf[js.Any])
  }
}
