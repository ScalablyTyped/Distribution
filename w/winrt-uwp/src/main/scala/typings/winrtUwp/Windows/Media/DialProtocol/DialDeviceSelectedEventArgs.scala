package typings.winrtUwp.Windows.Media.DialProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the event arguments for the DialDeviceSelected event on the DialDevicePicker object. */
trait DialDeviceSelectedEventArgs extends js.Object {
  /** Gets the DialDevice object that represents the remote device that has been selected by the user in a DialDevicePicker . */
  var selectedDialDevice: DialDevice
}

object DialDeviceSelectedEventArgs {
  @scala.inline
  def apply(selectedDialDevice: DialDevice): DialDeviceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDialDevice = selectedDialDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDeviceSelectedEventArgs]
  }
}

