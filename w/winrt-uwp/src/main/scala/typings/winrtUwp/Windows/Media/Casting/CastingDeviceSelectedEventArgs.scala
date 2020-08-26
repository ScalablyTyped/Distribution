package typings.winrtUwp.Windows.Media.Casting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the event arguments for the CastingDeviceSelected event on the CastingDevicePicker object. */
@js.native
trait CastingDeviceSelectedEventArgs extends js.Object {
  /** Represents the CastingDevice that has been selected by the user in a casting device picker. */
  var selectedCastingDevice: CastingDevice = js.native
}

object CastingDeviceSelectedEventArgs {
  @scala.inline
  def apply(selectedCastingDevice: CastingDevice): CastingDeviceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(selectedCastingDevice = selectedCastingDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingDeviceSelectedEventArgs]
  }
  @scala.inline
  implicit class CastingDeviceSelectedEventArgsOps[Self <: CastingDeviceSelectedEventArgs] (val x: Self) extends AnyVal {
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
    def setSelectedCastingDevice(value: CastingDevice): Self = this.set("selectedCastingDevice", value.asInstanceOf[js.Any])
  }
  
}

