package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the reading of an activity sensor that provides readings for the sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensorReading")
@js.native
abstract class ActivitySensorReading ()
  extends typings.winrtUwp.Windows.Devices.Sensors.ActivitySensorReading {
  /** Gets the activity type for the sensor. */
  /* CompleteClass */
  override var activity: typings.winrtUwp.Windows.Devices.Sensors.ActivityType = js.native
  /** Gets the reading confidence for the sensor. */
  /* CompleteClass */
  override var confidence: typings.winrtUwp.Windows.Devices.Sensors.ActivitySensorReadingConfidence = js.native
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

