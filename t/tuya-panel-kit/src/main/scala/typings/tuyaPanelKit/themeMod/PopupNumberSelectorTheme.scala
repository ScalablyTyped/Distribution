package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupNumberSelectorTheme extends js.Object {
  
  var cellPlusColor: String = js.native
  
  var maximumTrackTintColor: String = js.native
}
object PopupNumberSelectorTheme {
  
  @scala.inline
  def apply(cellPlusColor: String, maximumTrackTintColor: String): PopupNumberSelectorTheme = {
    val __obj = js.Dynamic.literal(cellPlusColor = cellPlusColor.asInstanceOf[js.Any], maximumTrackTintColor = maximumTrackTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupNumberSelectorTheme]
  }
  
  @scala.inline
  implicit class PopupNumberSelectorThemeOps[Self <: PopupNumberSelectorTheme] (val x: Self) extends AnyVal {
    
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
    def setCellPlusColor(value: String): Self = this.set("cellPlusColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
  }
}
