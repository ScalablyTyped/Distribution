package typings.winrtUwp.Windows.UI.WebUI

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages an app suspension operation. */
@js.native
trait SuspendingOperation extends js.Object {
  
  /** Gets the time remaining before a delayed app suspension operation continues. */
  var deadline: Date = js.native
  
  /**
    * Requests that the app suspension operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.SuspendingDeferral = js.native
}
object SuspendingOperation {
  
  @scala.inline
  def apply(deadline: Date, getDeferral: () => typings.winrtUwp.Windows.ApplicationModel.SuspendingDeferral): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SuspendingOperation]
  }
  
  @scala.inline
  implicit class SuspendingOperationOps[Self <: SuspendingOperation] (val x: Self) extends AnyVal {
    
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
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => typings.winrtUwp.Windows.ApplicationModel.SuspendingDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
}
