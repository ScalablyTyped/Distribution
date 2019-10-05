package typings.winrtDashUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data for the sensor trigger. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensorReadingChangeReport")
@js.native
abstract class ActivitySensorReadingChangeReport () extends js.Object {
  /** Gets the reading of the sensor when it's triggered. */
  var reading: ActivitySensorReading = js.native
}

