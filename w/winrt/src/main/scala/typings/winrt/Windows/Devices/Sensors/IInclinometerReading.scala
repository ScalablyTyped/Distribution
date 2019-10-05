package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInclinometerReading extends js.Object {
  var pitchDegrees: Double
  var rollDegrees: Double
  var timestamp: Date
  var yawDegrees: Double
}

object IInclinometerReading {
  @scala.inline
  def apply(pitchDegrees: Double, rollDegrees: Double, timestamp: Date, yawDegrees: Double): IInclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees, rollDegrees = rollDegrees, timestamp = timestamp, yawDegrees = yawDegrees)
  
    __obj.asInstanceOf[IInclinometerReading]
  }
}

