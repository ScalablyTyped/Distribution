package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleOrientationSensorOrientationChangedEventArgs extends ISimpleOrientationSensorOrientationChangedEventArgs

object SimpleOrientationSensorOrientationChangedEventArgs {
  @scala.inline
  def apply(orientation: SimpleOrientation, timestamp: Date): SimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleOrientationSensorOrientationChangedEventArgs]
  }
}

