package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls the removal of an app from the lock screen. */
trait LockScreenCallEndRequestedEventArgs extends js.Object {
  /** Gets the deadline by which the app must complete the deferral. */
  var deadline: Date
  /**
    * Requests to defer the default behavior of removing the app from the lock screen.
    * @return When this method completes, it returns a LockScreenCallEndCallDeferral object that signals when the app no longer needs to defer the removal of itself from the lock screen.
    */
  def getDeferral(): LockScreenCallEndCallDeferral
}

object LockScreenCallEndRequestedEventArgs {
  @scala.inline
  def apply(deadline: Date, getDeferral: () => LockScreenCallEndCallDeferral): LockScreenCallEndRequestedEventArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[LockScreenCallEndRequestedEventArgs]
  }
}

