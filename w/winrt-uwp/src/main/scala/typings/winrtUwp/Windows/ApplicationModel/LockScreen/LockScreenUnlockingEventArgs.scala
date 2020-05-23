package typings.winrtUwp.Windows.ApplicationModel.LockScreen

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the lock screen unlocking events. */
trait LockScreenUnlockingEventArgs extends js.Object {
  /** Gets the deadline by which the lock screen app must unlock the device. If your unlocking deferral takes too long, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
  var deadline: Date
  /**
    * Gets a LockScreenUnlockingDeferral , which defers the unlocking of the device.
    * @return An unlock deferral.
    */
  def getDeferral(): LockScreenUnlockingDeferral
}

object LockScreenUnlockingEventArgs {
  @scala.inline
  def apply(deadline: Date, getDeferral: () => LockScreenUnlockingDeferral): LockScreenUnlockingEventArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[LockScreenUnlockingEventArgs]
  }
}

