package typings.uiGrid.mod

import typings.angular.mod.IAngularEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMenuItem extends js.Object {
  
  /** the method to call when the menu is clicked */
  var action: js.UndefOr[js.Function1[/* $event */ IAngularEvent, Unit]] = js.native
  
  /** a function to evaluate to determine whether or not the item is currently selected */
  var active: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** context to pass to the action function, available in this.context in your handler */
  var context: js.UndefOr[js.Any] = js.native
  
  /** the icon shown alongside that title */
  var icon: js.UndefOr[String] = js.native
  
  /** if set to true, the menu should stay open after the action, defaults to false */
  var leaveOpen: js.UndefOr[Boolean] = js.native
  
  /** a function to evaluate to determine whether or not to show the item */
  var shown: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** controls the title that is displayed in the menu */
  var title: js.UndefOr[String] = js.native
}
object IMenuItem {
  
  @scala.inline
  def apply(): IMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuItem]
  }
  
  @scala.inline
  implicit class IMenuItemOps[Self <: IMenuItem] (val x: Self) extends AnyVal {
    
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
    def setAction(value: /* $event */ IAngularEvent => Unit): Self = this.set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setActive(value: () => Boolean): Self = this.set("active", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLeaveOpen(value: Boolean): Self = this.set("leaveOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaveOpen: Self = this.set("leaveOpen", js.undefined)
    
    @scala.inline
    def setShown(value: () => Boolean): Self = this.set("shown", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShown: Self = this.set("shown", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
