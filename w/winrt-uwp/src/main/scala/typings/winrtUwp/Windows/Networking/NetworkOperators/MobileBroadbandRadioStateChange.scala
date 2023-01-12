package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details of a radio state change notification. */
trait MobileBroadbandRadioStateChange extends StObject {
  
  /** Gets the device ID of the device whose radio state changed. */
  var deviceId: String
  
  /** Gets the new state of the radio. */
  var radioState: MobileBroadbandRadioState
}
object MobileBroadbandRadioStateChange {
  
  inline def apply(deviceId: String, radioState: MobileBroadbandRadioState): MobileBroadbandRadioStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], radioState = radioState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandRadioStateChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileBroadbandRadioStateChange] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setRadioState(value: MobileBroadbandRadioState): Self = StObject.set(x, "radioState", value.asInstanceOf[js.Any])
  }
}
