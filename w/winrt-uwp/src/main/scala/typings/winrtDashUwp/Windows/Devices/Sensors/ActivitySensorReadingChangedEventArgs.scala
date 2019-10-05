package typings.winrtDashUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data for the reading–changed event of the sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensorReadingChangedEventArgs")
@js.native
abstract class ActivitySensorReadingChangedEventArgs () extends js.Object {
  /** Gets the most recent sensor reading. */
  var reading: ActivitySensorReading = js.native
}

