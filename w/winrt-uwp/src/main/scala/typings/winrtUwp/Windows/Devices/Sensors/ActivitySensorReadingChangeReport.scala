package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data for the sensor trigger. */
trait ActivitySensorReadingChangeReport extends js.Object {
  /** Gets the reading of the sensor when it's triggered. */
  var reading: ActivitySensorReading
}

object ActivitySensorReadingChangeReport {
  @scala.inline
  def apply(reading: ActivitySensorReading): ActivitySensorReadingChangeReport = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorReadingChangeReport]
  }
}

