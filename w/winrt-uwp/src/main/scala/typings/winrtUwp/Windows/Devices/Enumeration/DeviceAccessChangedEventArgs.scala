package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AccessChanged event. */
trait DeviceAccessChangedEventArgs extends js.Object {
  /** The new status of access to a device. */
  var status: DeviceAccessStatus
}

object DeviceAccessChangedEventArgs {
  @scala.inline
  def apply(status: DeviceAccessStatus): DeviceAccessChangedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAccessChangedEventArgs]
  }
}

