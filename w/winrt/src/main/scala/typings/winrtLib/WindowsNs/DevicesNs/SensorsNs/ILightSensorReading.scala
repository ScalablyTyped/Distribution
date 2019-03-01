package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightSensorReading extends js.Object {
  var illuminanceInLux: scala.Double
  var timestamp: stdLib.Date
}

object ILightSensorReading {
  @scala.inline
  def apply(illuminanceInLux: scala.Double, timestamp: stdLib.Date): ILightSensorReading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("illuminanceInLux")(illuminanceInLux)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[ILightSensorReading]
  }
}

