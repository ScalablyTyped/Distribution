package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInclinometerReading extends js.Object {
  var pitchDegrees: scala.Double
  var rollDegrees: scala.Double
  var timestamp: stdLib.Date
  var yawDegrees: scala.Double
}

object IInclinometerReading {
  @scala.inline
  def apply(
    pitchDegrees: scala.Double,
    rollDegrees: scala.Double,
    timestamp: stdLib.Date,
    yawDegrees: scala.Double
  ): IInclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees, rollDegrees = rollDegrees, timestamp = timestamp, yawDegrees = yawDegrees)
  
    __obj.asInstanceOf[IInclinometerReading]
  }
}

