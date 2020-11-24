package typings.webgme.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarItem extends js.Object {
  
  def destroy(): Unit = js.native
  
  def enabled(value: Boolean): Unit = js.native
  
  def hide(): Unit = js.native
  
  def show(): Unit = js.native
}
object ToolbarItem {
  
  @scala.inline
  def apply(destroy: () => Unit, enabled: Boolean => Unit, hide: () => Unit, show: () => Unit): ToolbarItem = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = js.Any.fromFunction1(enabled), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ToolbarItem]
  }
  
  @scala.inline
  implicit class ToolbarItemOps[Self <: ToolbarItem] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean => Unit): Self = this.set("enabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
