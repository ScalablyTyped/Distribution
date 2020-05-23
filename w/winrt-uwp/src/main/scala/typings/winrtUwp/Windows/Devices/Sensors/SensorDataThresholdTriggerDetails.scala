package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for what sensor triggered the data threshold monitoring task. */
trait SensorDataThresholdTriggerDetails extends js.Object {
  /** Gets the device identifier for the device that activated the threshold trigger. */
  var deviceId: String
  /** Gets the type of sensor associated with the threshold trigger. */
  var sensorType: SensorType
}

object SensorDataThresholdTriggerDetails {
  @scala.inline
  def apply(deviceId: String, sensorType: SensorType): SensorDataThresholdTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], sensorType = sensorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorDataThresholdTriggerDetails]
  }
}

