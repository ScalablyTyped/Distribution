package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightSensorReading extends js.Object {
  var illuminanceInLux: Double
  var timestamp: Date
}

object ILightSensorReading {
  @scala.inline
  def apply(illuminanceInLux: Double, timestamp: Date): ILightSensorReading = {
    val __obj = js.Dynamic.literal(illuminanceInLux = illuminanceInLux.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightSensorReading]
  }
}

