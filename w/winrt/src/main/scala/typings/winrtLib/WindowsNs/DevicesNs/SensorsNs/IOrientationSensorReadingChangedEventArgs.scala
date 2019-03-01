package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrientationSensorReadingChangedEventArgs extends js.Object {
  var reading: OrientationSensorReading
}

object IOrientationSensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: OrientationSensorReading): IOrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reading")(reading)
    __obj.asInstanceOf[IOrientationSensorReadingChangedEventArgs]
  }
}

