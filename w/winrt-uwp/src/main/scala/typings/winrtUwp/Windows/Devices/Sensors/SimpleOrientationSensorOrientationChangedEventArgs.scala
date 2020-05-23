package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the sensor reading–changed event. */
trait SimpleOrientationSensorOrientationChangedEventArgs extends js.Object {
  /** Gets the current sensor orientation. */
  var orientation: SimpleOrientation
  /** Gets the time of the current sensor reading. */
  var timestamp: Date
}

object SimpleOrientationSensorOrientationChangedEventArgs {
  @scala.inline
  def apply(orientation: SimpleOrientation, timestamp: Date): SimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleOrientationSensorOrientationChangedEventArgs]
  }
}

