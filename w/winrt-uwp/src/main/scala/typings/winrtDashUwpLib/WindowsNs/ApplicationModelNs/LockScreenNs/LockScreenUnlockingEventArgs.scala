package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.LockScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the lock screen unlocking events. */
@JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenUnlockingEventArgs")
@js.native
abstract class LockScreenUnlockingEventArgs () extends js.Object {
  /** Gets the deadline by which the lock screen app must unlock the device. If your unlocking deferral takes too long, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
  var deadline: stdLib.Date = js.native
  /**
                   * Gets a LockScreenUnlockingDeferral , which defers the unlocking of the device.
                   * @return An unlock deferral.
                   */
  def getDeferral(): LockScreenUnlockingDeferral = js.native
}

