package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the magnetometer reading–changed event. */
trait MagnetometerReadingChangedEventArgs extends js.Object {
  /** Gets the current magnetometer reading. */
  var reading: MagnetometerReading
}

object MagnetometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: MagnetometerReading): MagnetometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnetometerReadingChangedEventArgs]
  }
}

