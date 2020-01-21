package typings.winrtUwp.Windows.Devices.SmartCards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a wait time for a requested smart card personal identification number (PIN) reset. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardPinResetDeferral")
@js.native
abstract class SmartCardPinResetDeferral () extends js.Object {
  /** Returns a wait time completion for a smart card personal identification number (PIN) reset. */
  def complete(): Unit = js.native
}

