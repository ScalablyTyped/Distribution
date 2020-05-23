package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the gyrometer reading–changed event. */
trait GyrometerReadingChangedEventArgs extends js.Object {
  /** Gets the current gyrometer reading. */
  var reading: GyrometerReading
}

object GyrometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: GyrometerReading): GyrometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyrometerReadingChangedEventArgs]
  }
}

