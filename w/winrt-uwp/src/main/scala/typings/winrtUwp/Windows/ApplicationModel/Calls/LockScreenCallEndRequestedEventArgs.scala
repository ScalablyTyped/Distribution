package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls the removal of an app from the lock screen. */
@js.native
trait LockScreenCallEndRequestedEventArgs extends js.Object {
  
  /** Gets the deadline by which the app must complete the deferral. */
  var deadline: Date = js.native
  
  /**
    * Requests to defer the default behavior of removing the app from the lock screen.
    * @return When this method completes, it returns a LockScreenCallEndCallDeferral object that signals when the app no longer needs to defer the removal of itself from the lock screen.
    */
  def getDeferral(): LockScreenCallEndCallDeferral = js.native
}
object LockScreenCallEndRequestedEventArgs {
  
  @scala.inline
  def apply(deadline: Date, getDeferral: () => LockScreenCallEndCallDeferral): LockScreenCallEndRequestedEventArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[LockScreenCallEndRequestedEventArgs]
  }
  
  @scala.inline
  implicit class LockScreenCallEndRequestedEventArgsOps[Self <: LockScreenCallEndRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGetDeferral(value: () => LockScreenCallEndCallDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
}
