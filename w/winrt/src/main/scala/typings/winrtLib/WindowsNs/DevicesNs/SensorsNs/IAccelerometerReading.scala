package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerReading extends js.Object {
  var accelerationX: scala.Double
  var accelerationY: scala.Double
  var accelerationZ: scala.Double
  var timestamp: stdLib.Date
}

object IAccelerometerReading {
  @scala.inline
  def apply(
    accelerationX: scala.Double,
    accelerationY: scala.Double,
    accelerationZ: scala.Double,
    timestamp: stdLib.Date
  ): IAccelerometerReading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accelerationX")(accelerationX)
    __obj.updateDynamic("accelerationY")(accelerationY)
    __obj.updateDynamic("accelerationZ")(accelerationZ)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[IAccelerometerReading]
  }
}

