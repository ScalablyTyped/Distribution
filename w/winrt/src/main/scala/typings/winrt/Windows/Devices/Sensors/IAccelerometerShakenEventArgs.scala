package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccelerometerShakenEventArgs extends js.Object {
  var timestamp: Date = js.native
}

object IAccelerometerShakenEventArgs {
  @scala.inline
  def apply(timestamp: Date): IAccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometerShakenEventArgs]
  }
  @scala.inline
  implicit class IAccelerometerShakenEventArgsOps[Self <: IAccelerometerShakenEventArgs] (val x: Self) extends AnyVal {
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
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

