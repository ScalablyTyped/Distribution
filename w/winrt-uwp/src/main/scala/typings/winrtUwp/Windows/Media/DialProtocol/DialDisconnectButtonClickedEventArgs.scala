package typings.winrtUwp.Windows.Media.DialProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the event arguments for the DisconnectButtonClicked event on the DialDevicePicker object. */
@js.native
trait DialDisconnectButtonClickedEventArgs extends js.Object {
  /** Gets the DialDevice object that represents the remote device that the user wants to disconnect. */
  var device: DialDevice = js.native
}

object DialDisconnectButtonClickedEventArgs {
  @scala.inline
  def apply(device: DialDevice): DialDisconnectButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDisconnectButtonClickedEventArgs]
  }
  @scala.inline
  implicit class DialDisconnectButtonClickedEventArgsOps[Self <: DialDisconnectButtonClickedEventArgs] (val x: Self) extends AnyVal {
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
    def setDevice(value: DialDevice): Self = this.set("device", value.asInstanceOf[js.Any])
  }
  
}

