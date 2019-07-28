package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for what sensor triggered the data threshold monitoring task. */
@JSGlobal("Windows.Devices.Sensors.SensorDataThresholdTriggerDetails")
@js.native
abstract class SensorDataThresholdTriggerDetails () extends js.Object {
  /** Gets the device identifier for the device that activated the threshold trigger. */
  var deviceId: String = js.native
  /** Gets the type of sensor associated with the threshold trigger. */
  var sensorType: SensorType = js.native
}

