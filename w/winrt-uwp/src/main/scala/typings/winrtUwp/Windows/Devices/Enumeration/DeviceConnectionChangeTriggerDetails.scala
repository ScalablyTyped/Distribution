package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the device that caused this trigger to fire. */
trait DeviceConnectionChangeTriggerDetails extends StObject {
  
  /** Gets the device Id of the device that caused this trigger to fire. */
  var deviceId: String
}
object DeviceConnectionChangeTriggerDetails {
  
  inline def apply(deviceId: String): DeviceConnectionChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConnectionChangeTriggerDetails]
  }
  
  extension [Self <: DeviceConnectionChangeTriggerDetails](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
  }
}
