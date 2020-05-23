package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the accelerometer reading–changed event. */
trait AccelerometerReadingChangedEventArgs extends js.Object {
  /** Gets the most recent accelerometer reading. */
  var reading: AccelerometerReading
}

object AccelerometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: AccelerometerReading): AccelerometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerReadingChangedEventArgs]
  }
}

