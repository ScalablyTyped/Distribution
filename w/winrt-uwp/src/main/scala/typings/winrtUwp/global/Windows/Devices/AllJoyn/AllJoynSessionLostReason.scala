package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines values used by AllJoynSessionLostEventArgs to indicate the reason for a lost session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostReason")
@js.native
object AllJoynSessionLostReason extends js.Object {
  /* 4 */ val linkTimeout: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.linkTimeout with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.none with Double = js.native
  /* 5 */ val other: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.other with Double = js.native
  /* 2 */ val producerClosedAbruptly: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.producerClosedAbruptly with Double = js.native
  /* 1 */ val producerLeftSession: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.producerLeftSession with Double = js.native
  /* 3 */ val removedByProducer: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.removedByProducer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason with Double] = js.native
}

