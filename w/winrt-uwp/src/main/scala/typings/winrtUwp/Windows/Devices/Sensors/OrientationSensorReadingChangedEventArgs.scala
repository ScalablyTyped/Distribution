package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the orientation-sensor reading-changed event. */
trait OrientationSensorReadingChangedEventArgs extends js.Object {
  /** Gets the current reading which includes a Quaternion, a RotationMatrix, and a timestamp. */
  var reading: OrientationSensorReading
}

object OrientationSensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: OrientationSensorReading): OrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReadingChangedEventArgs]
  }
}

