package typings.winrtUwp.Windows.Devices.Sensors.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data for the reading–changed event of the custom sensor. */
trait CustomSensorReadingChangedEventArgs extends js.Object {
  /** Gets the most recent sensor reading. */
  var reading: CustomSensorReading
}

object CustomSensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: CustomSensorReading): CustomSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSensorReadingChangedEventArgs]
  }
}

