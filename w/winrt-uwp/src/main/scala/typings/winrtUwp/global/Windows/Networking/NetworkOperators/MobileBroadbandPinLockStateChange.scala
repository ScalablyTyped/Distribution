package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details of a PIN lock state change notification. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChange")
@js.native
open class MobileBroadbandPinLockStateChange ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChange {
  
  /** Gets the device identifier associated with a PIN lock state change. */
  /* CompleteClass */
  var deviceId: String = js.native
  
  /** Gets a value representing the new PIN lock state after a PIN lock state change. */
  /* CompleteClass */
  var pinLockState: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState = js.native
  
  /** Gets a value representing the type of PIN involved in a PIN lock state change. */
  /* CompleteClass */
  var pinType: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType = js.native
}
