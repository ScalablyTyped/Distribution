package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandPinLockState extends js.Object

/** Describes the possible PIN lock states of a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockState")
@js.native
object MobileBroadbandPinLockState extends js.Object {
  /** A PIN input is required. The MobileBroadbandPinType will contain more information on which PIN is needed. */
  @js.native
  sealed trait pinRequired
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinLockState
  
  /** An invalid PIN has been entered too often and a PIN Unblock Key (PUK) is needed to proceed. */
  @js.native
  sealed trait pinUnblockKeyRequired
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinLockState
  
  /** The PIN lock state is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinLockState
  
  /** The PIN lock state is unlocked. */
  @js.native
  sealed trait unlocked
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinLockState
  
  val pinRequired: pinRequired with java.lang.String = js.native
  val pinUnblockKeyRequired: pinUnblockKeyRequired with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val unlocked: unlocked with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinLockState with java.lang.String
  ] = js.native
}

