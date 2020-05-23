package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the reading of an activity sensor that provides readings for the sensor. */
trait ActivitySensorReading extends js.Object {
  /** Gets the activity type for the sensor. */
  var activity: ActivityType
  /** Gets the reading confidence for the sensor. */
  var confidence: ActivitySensorReadingConfidence
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date
}

object ActivitySensorReading {
  @scala.inline
  def apply(activity: ActivityType, confidence: ActivitySensorReadingConfidence, timestamp: Date): ActivitySensorReading = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorReading]
  }
}

