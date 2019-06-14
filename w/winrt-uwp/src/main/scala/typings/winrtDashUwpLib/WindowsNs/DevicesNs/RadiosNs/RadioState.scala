package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RadioState extends js.Object

/** Enumeration that describes possible radio states. */
@JSGlobal("Windows.Devices.Radios.RadioState")
@js.native
object RadioState extends js.Object {
  /** The radio is powered off and disabled by the device firmware or a hardware switch on the device. */
  @js.native
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioState
  
  /** The radio is powered off. */
  @js.native
  sealed trait off
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioState
  
  /** The radio is powered on. */
  @js.native
  sealed trait on
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioState
  
  /** The radio state is unknown, or the radio is in a bad or uncontrollable state. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioState
  
  /* 3 */ val disabled: disabled with scala.Double = js.native
  /* 2 */ val off: off with scala.Double = js.native
  /* 1 */ val on: on with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioState with scala.Double] = js.native
}

