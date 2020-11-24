package typings.winrtUwp.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides event data for the SystemNavigationManager.BackRequested event. */
@js.native
trait BackRequestedEventArgs extends js.Object {
  
  /** Gets or sets a value that indicates whether the app performed the requested back-navigation. */
  var handled: Boolean = js.native
}
object BackRequestedEventArgs {
  
  @scala.inline
  def apply(handled: Boolean): BackRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackRequestedEventArgs]
  }
  
  @scala.inline
  implicit class BackRequestedEventArgsOps[Self <: BackRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
  }
}
