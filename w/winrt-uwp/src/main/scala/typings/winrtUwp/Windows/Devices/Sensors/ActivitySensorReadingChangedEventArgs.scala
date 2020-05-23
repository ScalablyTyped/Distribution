package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data for the reading–changed event of the sensor. */
trait ActivitySensorReadingChangedEventArgs extends js.Object {
  /** Gets the most recent sensor reading. */
  var reading: ActivitySensorReading
}

object ActivitySensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: ActivitySensorReading): ActivitySensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorReadingChangedEventArgs]
  }
}

