package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MobileBroadbandPinLockState extends StObject
/** Describes the possible PIN lock states of a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockState")
@js.native
object MobileBroadbandPinLockState extends StObject {
  
  /** A PIN input is required. The MobileBroadbandPinType will contain more information on which PIN is needed. */
  @js.native
  sealed trait pinRequired
    extends StObject
       with MobileBroadbandPinLockState
  
  /** An invalid PIN has been entered too often and a PIN Unblock Key (PUK) is needed to proceed. */
  @js.native
  sealed trait pinUnblockKeyRequired
    extends StObject
       with MobileBroadbandPinLockState
  
  /** The PIN lock state is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with MobileBroadbandPinLockState
  
  /** The PIN lock state is unlocked. */
  @js.native
  sealed trait unlocked
    extends StObject
       with MobileBroadbandPinLockState
}
