package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the reading of an activity sensor that provides readings for the sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensorReading")
@js.native
abstract class ActivitySensorReading () extends js.Object {
  /** Gets the activity type for the sensor. */
  var activity: ActivityType = js.native
  /** Gets the reading confidence for the sensor. */
  var confidence: ActivitySensorReadingConfidence = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
}

