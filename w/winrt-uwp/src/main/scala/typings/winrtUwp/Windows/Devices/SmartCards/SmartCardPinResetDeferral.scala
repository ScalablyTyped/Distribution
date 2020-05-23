package typings.winrtUwp.Windows.Devices.SmartCards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a wait time for a requested smart card personal identification number (PIN) reset. */
trait SmartCardPinResetDeferral extends js.Object {
  /** Returns a wait time completion for a smart card personal identification number (PIN) reset. */
  def complete(): Unit
}

object SmartCardPinResetDeferral {
  @scala.inline
  def apply(complete: () => Unit): SmartCardPinResetDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SmartCardPinResetDeferral]
  }
}

