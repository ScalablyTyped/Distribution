package typings.winrtUwp.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The LockScreenCallEndCallDeferral object signals when the app no longer needs to defer the removal of itself from the lock screen. */
@JSGlobal("Windows.ApplicationModel.Calls.LockScreenCallEndCallDeferral")
@js.native
abstract class LockScreenCallEndCallDeferral () extends js.Object {
  /** Completes the deferral of the removal of the app from the lock screen, which causes the app to be removed from the lock screen if it hasn't already been removed by other means. */
  def complete(): Unit = js.native
}

