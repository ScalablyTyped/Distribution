package typings.winrtUwp.Windows.Media.DialProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the event arguments for the DialDeviceSelected event on the DialDevicePicker object. */
@js.native
trait DialDeviceSelectedEventArgs extends js.Object {
  /** Gets the DialDevice object that represents the remote device that has been selected by the user in a DialDevicePicker . */
  var selectedDialDevice: DialDevice = js.native
}

object DialDeviceSelectedEventArgs {
  @scala.inline
  def apply(selectedDialDevice: DialDevice): DialDeviceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDialDevice = selectedDialDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDeviceSelectedEventArgs]
  }
  @scala.inline
  implicit class DialDeviceSelectedEventArgsOps[Self <: DialDeviceSelectedEventArgs] (val x: Self) extends AnyVal {
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
    def setSelectedDialDevice(value: DialDevice): Self = this.set("selectedDialDevice", value.asInstanceOf[js.Any])
  }
  
}

