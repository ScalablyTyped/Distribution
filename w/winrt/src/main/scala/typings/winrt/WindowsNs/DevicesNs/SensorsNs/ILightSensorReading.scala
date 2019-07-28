package typings.winrt.WindowsNs.DevicesNs.SensorsNs

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
    val __obj = js.Dynamic.literal(illuminanceInLux = illuminanceInLux, timestamp = timestamp)
  
    __obj.asInstanceOf[ILightSensorReading]
  }
}

