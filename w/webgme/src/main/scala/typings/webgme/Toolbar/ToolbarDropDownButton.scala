package typings.webgme.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarDropDownButton extends ToolbarItem {
  
  def addButton(params: ToolbarParams): ToolbarButton = js.native
}
object ToolbarDropDownButton {
  
  @scala.inline
  def apply(
    addButton: ToolbarParams => ToolbarButton,
    destroy: () => Unit,
    enabled: Boolean => Unit,
    hide: () => Unit,
    show: () => Unit
  ): ToolbarDropDownButton = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton), destroy = js.Any.fromFunction0(destroy), enabled = js.Any.fromFunction1(enabled), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ToolbarDropDownButton]
  }
  
  @scala.inline
  implicit class ToolbarDropDownButtonOps[Self <: ToolbarDropDownButton] (val x: Self) extends AnyVal {
    
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
    def setAddButton(value: ToolbarParams => ToolbarButton): Self = this.set("addButton", js.Any.fromFunction1(value))
  }
}
