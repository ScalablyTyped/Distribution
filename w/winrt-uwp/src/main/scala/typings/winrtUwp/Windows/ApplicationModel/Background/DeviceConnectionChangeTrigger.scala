package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when the connection status of a device changes. */
trait DeviceConnectionChangeTrigger extends StObject {
  
  /** Gets whether the system can maintain a connection to the specified device. */
  var canMaintainConnection: Boolean
  
  /** Gets the device Id associated with the device. */
  var deviceId: String
  
  /** Gets or sets whether the system should automatically attempt to keep the referenced device connected. */
  var maintainConnection: Boolean
}
object DeviceConnectionChangeTrigger {
  
  inline def apply(canMaintainConnection: Boolean, deviceId: String, maintainConnection: Boolean): DeviceConnectionChangeTrigger = {
    val __obj = js.Dynamic.literal(canMaintainConnection = canMaintainConnection.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], maintainConnection = maintainConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConnectionChangeTrigger]
  }
  
  extension [Self <: DeviceConnectionChangeTrigger](x: Self) {
    
    inline def setCanMaintainConnection(value: Boolean): Self = StObject.set(x, "canMaintainConnection", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setMaintainConnection(value: Boolean): Self = StObject.set(x, "maintainConnection", value.asInstanceOf[js.Any])
  }
}
