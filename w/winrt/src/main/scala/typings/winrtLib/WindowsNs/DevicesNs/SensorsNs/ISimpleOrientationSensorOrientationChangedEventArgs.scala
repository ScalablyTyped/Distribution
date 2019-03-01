package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleOrientationSensorOrientationChangedEventArgs extends js.Object {
  var orientation: SimpleOrientation
  var timestamp: stdLib.Date
}

object ISimpleOrientationSensorOrientationChangedEventArgs {
  @scala.inline
  def apply(orientation: SimpleOrientation, timestamp: stdLib.Date): ISimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("orientation")(orientation)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[ISimpleOrientationSensorOrientationChangedEventArgs]
  }
}

