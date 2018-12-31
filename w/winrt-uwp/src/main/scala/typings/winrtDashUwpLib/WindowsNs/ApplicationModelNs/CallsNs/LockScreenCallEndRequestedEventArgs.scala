package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls the removal of an app from the lock screen. */
@JSGlobal("Windows.ApplicationModel.Calls.LockScreenCallEndRequestedEventArgs")
@js.native
abstract class LockScreenCallEndRequestedEventArgs () extends js.Object {
  /** Gets the deadline by which the app must complete the deferral. */
  var deadline: stdLib.Date = js.native
  /**
    * Requests to defer the default behavior of removing the app from the lock screen.
    * @return When this method completes, it returns a LockScreenCallEndCallDeferral object that signals when the app no longer needs to defer the removal of itself from the lock screen.
    */
  def getDeferral(): LockScreenCallEndCallDeferral = js.native
}

