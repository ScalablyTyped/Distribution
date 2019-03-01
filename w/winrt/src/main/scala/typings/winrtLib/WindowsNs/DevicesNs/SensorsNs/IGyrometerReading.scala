package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGyrometerReading extends js.Object {
  var angularVelocityX: scala.Double
  var angularVelocityY: scala.Double
  var angularVelocityZ: scala.Double
  var timestamp: stdLib.Date
}

object IGyrometerReading {
  @scala.inline
  def apply(
    angularVelocityX: scala.Double,
    angularVelocityY: scala.Double,
    angularVelocityZ: scala.Double,
    timestamp: stdLib.Date
  ): IGyrometerReading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angularVelocityX")(angularVelocityX)
    __obj.updateDynamic("angularVelocityY")(angularVelocityY)
    __obj.updateDynamic("angularVelocityZ")(angularVelocityZ)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[IGyrometerReading]
  }
}

