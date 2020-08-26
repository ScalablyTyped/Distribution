package typings.winrt.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStatusChangedEventArgs extends js.Object {
  var status: PositionStatus = js.native
}

object IStatusChangedEventArgs {
  @scala.inline
  def apply(status: PositionStatus): IStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatusChangedEventArgs]
  }
  @scala.inline
  implicit class IStatusChangedEventArgsOps[Self <: IStatusChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setStatus(value: PositionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

