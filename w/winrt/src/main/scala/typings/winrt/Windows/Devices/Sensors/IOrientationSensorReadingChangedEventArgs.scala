package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrientationSensorReadingChangedEventArgs extends js.Object {
  var reading: OrientationSensorReading = js.native
}

object IOrientationSensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: OrientationSensorReading): IOrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrientationSensorReadingChangedEventArgs]
  }
  @scala.inline
  implicit class IOrientationSensorReadingChangedEventArgsOps[Self <: IOrientationSensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReading(value: OrientationSensorReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
  
}

