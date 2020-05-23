package typings.winrtUwp.Windows.ApplicationModel.LockScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an unlock deferral. */
trait LockScreenUnlockingDeferral extends js.Object {
  /** Notifies the system that your deferral is complete. If your deferral takes too long to complete, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
  def complete(): Unit
}

object LockScreenUnlockingDeferral {
  @scala.inline
  def apply(complete: () => Unit): LockScreenUnlockingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[LockScreenUnlockingDeferral]
  }
}

