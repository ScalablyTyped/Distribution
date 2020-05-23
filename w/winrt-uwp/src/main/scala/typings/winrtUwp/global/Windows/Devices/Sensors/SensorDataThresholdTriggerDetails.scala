package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for what sensor triggered the data threshold monitoring task. */
@JSGlobal("Windows.Devices.Sensors.SensorDataThresholdTriggerDetails")
@js.native
abstract class SensorDataThresholdTriggerDetails ()
  extends typings.winrtUwp.Windows.Devices.Sensors.SensorDataThresholdTriggerDetails {
  /** Gets the device identifier for the device that activated the threshold trigger. */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Gets the type of sensor associated with the threshold trigger. */
  /* CompleteClass */
  override var sensorType: typings.winrtUwp.Windows.Devices.Sensors.SensorType = js.native
}

