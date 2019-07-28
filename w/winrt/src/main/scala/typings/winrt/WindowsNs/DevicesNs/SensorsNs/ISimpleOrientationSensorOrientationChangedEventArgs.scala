package typings.winrt.WindowsNs.DevicesNs.SensorsNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleOrientationSensorOrientationChangedEventArgs extends js.Object {
  var orientation: SimpleOrientation
  var timestamp: Date
}

object ISimpleOrientationSensorOrientationChangedEventArgs {
  @scala.inline
  def apply(orientation: SimpleOrientation, timestamp: Date): ISimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal(orientation = orientation, timestamp = timestamp)
  
    __obj.asInstanceOf[ISimpleOrientationSensorOrientationChangedEventArgs]
  }
}

