package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when the connection status of a device changes. */
@js.native
trait DeviceConnectionChangeTrigger extends StObject {
  
  /** Gets whether the system can maintain a connection to the specified device. */
  var canMaintainConnection: Boolean = js.native
  
  /** Gets the device Id associated with the device. */
  var deviceId: String = js.native
  
  /** Gets or sets whether the system should automatically attempt to keep the referenced device connected. */
  var maintainConnection: Boolean = js.native
}
object DeviceConnectionChangeTrigger {
  
  @scala.inline
  def apply(canMaintainConnection: Boolean, deviceId: String, maintainConnection: Boolean): DeviceConnectionChangeTrigger = {
    val __obj = js.Dynamic.literal(canMaintainConnection = canMaintainConnection.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], maintainConnection = maintainConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConnectionChangeTrigger]
  }
  
  @scala.inline
  implicit class DeviceConnectionChangeTriggerMutableBuilder[Self <: DeviceConnectionChangeTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanMaintainConnection(value: Boolean): Self = StObject.set(x, "canMaintainConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainConnection(value: Boolean): Self = StObject.set(x, "maintainConnection", value.asInstanceOf[js.Any])
  }
}
