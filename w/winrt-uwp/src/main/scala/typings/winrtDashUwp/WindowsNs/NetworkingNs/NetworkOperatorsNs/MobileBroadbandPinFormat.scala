package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandPinFormat extends js.Object

/** Describes the possible formats for a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinFormat")
@js.native
object MobileBroadbandPinFormat extends js.Object {
  /** The PIN is alphanumeric. */
  @js.native
  sealed trait alphanumeric extends MobileBroadbandPinFormat
  
  /** The PIN is numeric. */
  @js.native
  sealed trait numeric extends MobileBroadbandPinFormat
  
  /** No PIN format has been defined. This is normally not used. */
  @js.native
  sealed trait unknown extends MobileBroadbandPinFormat
  
  /* 2 */ val alphanumeric: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinFormat.alphanumeric with Double = js.native
  /* 1 */ val numeric: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinFormat.numeric with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinFormat.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandPinFormat with Double] = js.native
}

