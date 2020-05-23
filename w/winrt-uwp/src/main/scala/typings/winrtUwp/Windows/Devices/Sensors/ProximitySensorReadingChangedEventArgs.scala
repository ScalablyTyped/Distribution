package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the reading–changed event of the proximity sensor. */
trait ProximitySensorReadingChangedEventArgs extends js.Object {
  /** Gets or sets the most recent proximity sensor reading. */
  var reading: ProximitySensorReading
}

object ProximitySensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: ProximitySensorReading): ProximitySensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximitySensorReadingChangedEventArgs]
  }
}

