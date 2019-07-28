package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandRadioState extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioState")
@js.native
object MobileBroadbandRadioState extends js.Object {
  @js.native
  sealed trait off extends MobileBroadbandRadioState
  
  @js.native
  sealed trait on extends MobileBroadbandRadioState
  
  /* 0 */ val off: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandRadioState.off with Double = js.native
  /* 1 */ val on: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandRadioState.on with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandRadioState with Double] = js.native
}

