package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details of a PIN lock state change notification. */
trait MobileBroadbandPinLockStateChange extends StObject {
  
  /** Gets the device identifier associated with a PIN lock state change. */
  var deviceId: String
  
  /** Gets a value representing the new PIN lock state after a PIN lock state change. */
  var pinLockState: MobileBroadbandPinLockState
  
  /** Gets a value representing the type of PIN involved in a PIN lock state change. */
  var pinType: MobileBroadbandPinType
}
object MobileBroadbandPinLockStateChange {
  
  inline def apply(deviceId: String, pinLockState: MobileBroadbandPinLockState, pinType: MobileBroadbandPinType): MobileBroadbandPinLockStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], pinLockState = pinLockState.asInstanceOf[js.Any], pinType = pinType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinLockStateChange]
  }
  
  extension [Self <: MobileBroadbandPinLockStateChange](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setPinLockState(value: MobileBroadbandPinLockState): Self = StObject.set(x, "pinLockState", value.asInstanceOf[js.Any])
    
    inline def setPinType(value: MobileBroadbandPinType): Self = StObject.set(x, "pinType", value.asInstanceOf[js.Any])
  }
}
