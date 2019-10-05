package typings.winrtDashUwp.Windows.Networking.NetworkOperators

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
  sealed trait pinRequired extends MobileBroadbandPinLockState
  
  /** An invalid PIN has been entered too often and a PIN Unblock Key (PUK) is needed to proceed. */
  @js.native
  sealed trait pinUnblockKeyRequired extends MobileBroadbandPinLockState
  
  /** The PIN lock state is unknown. */
  @js.native
  sealed trait unknown extends MobileBroadbandPinLockState
  
  /** The PIN lock state is unlocked. */
  @js.native
  sealed trait unlocked extends MobileBroadbandPinLockState
  
  /* 2 */ val pinRequired: typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState.pinRequired with Double = js.native
  /* 3 */ val pinUnblockKeyRequired: typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState.pinUnblockKeyRequired with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState.unknown with Double = js.native
  /* 1 */ val unlocked: typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState.unlocked with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandPinLockState with Double] = js.native
}

