package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the inclinometer reading–changed event. */
trait InclinometerReadingChangedEventArgs extends js.Object {
  /** Gets the current inclinometer reading. */
  var reading: InclinometerReading
}

object InclinometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: InclinometerReading): InclinometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclinometerReadingChangedEventArgs]
  }
}

