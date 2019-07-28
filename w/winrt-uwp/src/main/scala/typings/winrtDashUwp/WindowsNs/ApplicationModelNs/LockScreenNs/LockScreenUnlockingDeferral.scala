package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.LockScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an unlock deferral. */
@JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenUnlockingDeferral")
@js.native
abstract class LockScreenUnlockingDeferral () extends js.Object {
  /** Notifies the system that your deferral is complete. If your deferral takes too long to complete, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
  def complete(): Unit = js.native
}

