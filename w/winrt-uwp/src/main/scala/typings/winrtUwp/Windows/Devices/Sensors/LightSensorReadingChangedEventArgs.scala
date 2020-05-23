package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ambient-light sensor reading-changed event. */
trait LightSensorReadingChangedEventArgs extends js.Object {
  /** Gets the current ambient light-sensor reading. */
  var reading: LightSensorReading
}

object LightSensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: LightSensorReading): LightSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSensorReadingChangedEventArgs]
  }
}

