package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the compass reading–changed event. */
trait CompassReadingChangedEventArgs extends js.Object {
  /** Gets the current compass reading. */
  var reading: CompassReading
}

object CompassReadingChangedEventArgs {
  @scala.inline
  def apply(reading: CompassReading): CompassReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassReadingChangedEventArgs]
  }
}

