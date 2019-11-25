package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightSensorReadingChangedEventArgs extends js.Object {
  var reading: LightSensorReading
}

object ILightSensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: LightSensorReading): ILightSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILightSensorReadingChangedEventArgs]
  }
}

