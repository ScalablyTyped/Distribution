package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the altimeter reading–changed event. */
trait AltimeterReadingChangedEventArgs extends js.Object {
  /** Gets the most recent barometer reading. */
  var reading: AltimeterReading
}

object AltimeterReadingChangedEventArgs {
  @scala.inline
  def apply(reading: AltimeterReading): AltimeterReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterReadingChangedEventArgs]
  }
}

