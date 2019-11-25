package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrientationSensorReadingChangedEventArgs extends js.Object {
  var reading: OrientationSensorReading
}

object IOrientationSensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: OrientationSensorReading): IOrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOrientationSensorReadingChangedEventArgs]
  }
}

