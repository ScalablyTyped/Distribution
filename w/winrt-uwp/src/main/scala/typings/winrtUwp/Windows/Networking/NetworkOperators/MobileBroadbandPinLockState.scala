package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandPinLockState with Double] = js.native
  /* 2 */ @js.native
  object pinRequired extends TopLevel[pinRequired with Double]
  
  /* 3 */ @js.native
  object pinUnblockKeyRequired extends TopLevel[pinUnblockKeyRequired with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 1 */ @js.native
  object unlocked extends TopLevel[unlocked with Double]
  
}

