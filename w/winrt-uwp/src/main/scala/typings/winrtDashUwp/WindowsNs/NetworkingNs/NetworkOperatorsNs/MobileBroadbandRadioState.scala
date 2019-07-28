package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandRadioState extends js.Object

/** Describes radio states for a Mobile Broadband device. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioState")
@js.native
object MobileBroadbandRadioState extends js.Object {
  /** The radio is off. This can be because it has been turned off using a physical switch on the device, or using a software mechanism such as Airplane Mode on the control panel. */
  @js.native
  sealed trait off extends MobileBroadbandRadioState
  
  /** The radio is on. */
  @js.native
  sealed trait on extends MobileBroadbandRadioState
  
  /* 0 */ val off: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandRadioState.off with Double = js.native
  /* 1 */ val on: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandRadioState.on with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandRadioState with Double] = js.native
}

