package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AccessChanged event. */
@js.native
trait DeviceAccessChangedEventArgs extends js.Object {
  /** The new status of access to a device. */
  var status: DeviceAccessStatus = js.native
}

object DeviceAccessChangedEventArgs {
  @scala.inline
  def apply(status: DeviceAccessStatus): DeviceAccessChangedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAccessChangedEventArgs]
  }
  @scala.inline
  implicit class DeviceAccessChangedEventArgsOps[Self <: DeviceAccessChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setStatus(value: DeviceAccessStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

