package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for what sensor triggered the data threshold monitoring task. */
@js.native
trait SensorDataThresholdTriggerDetails extends js.Object {
  
  /** Gets the device identifier for the device that activated the threshold trigger. */
  var deviceId: String = js.native
  
  /** Gets the type of sensor associated with the threshold trigger. */
  var sensorType: SensorType = js.native
}
object SensorDataThresholdTriggerDetails {
  
  @scala.inline
  def apply(deviceId: String, sensorType: SensorType): SensorDataThresholdTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], sensorType = sensorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorDataThresholdTriggerDetails]
  }
  
  @scala.inline
  implicit class SensorDataThresholdTriggerDetailsOps[Self <: SensorDataThresholdTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensorType(value: SensorType): Self = this.set("sensorType", value.asInstanceOf[js.Any])
  }
}
