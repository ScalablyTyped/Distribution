package typings.winrtUwp.Windows.Media.Casting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the event arguments for the CastingDeviceSelected event on the CastingDevicePicker object. */
trait CastingDeviceSelectedEventArgs extends js.Object {
  /** Represents the CastingDevice that has been selected by the user in a casting device picker. */
  var selectedCastingDevice: CastingDevice
}

object CastingDeviceSelectedEventArgs {
  @scala.inline
  def apply(selectedCastingDevice: CastingDevice): CastingDeviceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(selectedCastingDevice = selectedCastingDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingDeviceSelectedEventArgs]
  }
}

