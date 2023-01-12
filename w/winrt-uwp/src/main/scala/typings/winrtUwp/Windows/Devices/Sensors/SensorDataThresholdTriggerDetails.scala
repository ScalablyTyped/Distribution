package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for what sensor triggered the data threshold monitoring task. */
trait SensorDataThresholdTriggerDetails extends StObject {
  
  /** Gets the device identifier for the device that activated the threshold trigger. */
  var deviceId: String
  
  /** Gets the type of sensor associated with the threshold trigger. */
  var sensorType: SensorType
}
object SensorDataThresholdTriggerDetails {
  
  inline def apply(deviceId: String, sensorType: SensorType): SensorDataThresholdTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], sensorType = sensorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorDataThresholdTriggerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensorDataThresholdTriggerDetails] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setSensorType(value: SensorType): Self = StObject.set(x, "sensorType", value.asInstanceOf[js.Any])
  }
}
