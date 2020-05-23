package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the barometer reading–changed event. */
trait BarometerReadingChangedEventArgs extends js.Object {
  /** Gets the most recent barometer reading. */
  var reading: BarometerReading
}

object BarometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: BarometerReading): BarometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarometerReadingChangedEventArgs]
  }
}

