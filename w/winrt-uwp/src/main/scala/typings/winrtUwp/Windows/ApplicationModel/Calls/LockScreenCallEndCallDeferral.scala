package typings.winrtUwp.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The LockScreenCallEndCallDeferral object signals when the app no longer needs to defer the removal of itself from the lock screen. */
trait LockScreenCallEndCallDeferral extends js.Object {
  /** Completes the deferral of the removal of the app from the lock screen, which causes the app to be removed from the lock screen if it hasn't already been removed by other means. */
  def complete(): Unit
}

object LockScreenCallEndCallDeferral {
  @scala.inline
  def apply(complete: () => Unit): LockScreenCallEndCallDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[LockScreenCallEndCallDeferral]
  }
}

