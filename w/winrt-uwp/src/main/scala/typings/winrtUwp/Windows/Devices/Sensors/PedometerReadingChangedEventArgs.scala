package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the pedometer reading–changed event. */
trait PedometerReadingChangedEventArgs extends js.Object {
  /** Gets the most recent pedometer reading. */
  var reading: PedometerReading
}

object PedometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: PedometerReading): PedometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PedometerReadingChangedEventArgs]
  }
}

