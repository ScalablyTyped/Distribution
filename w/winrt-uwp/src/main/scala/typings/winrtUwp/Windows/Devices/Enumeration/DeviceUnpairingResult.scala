package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the result of attempting to unpair a device. */
trait DeviceUnpairingResult extends js.Object {
  /** Gets the paired status of the device after the unpairing action completed. */
  var status: DeviceUnpairingResultStatus
}

object DeviceUnpairingResult {
  @scala.inline
  def apply(status: DeviceUnpairingResultStatus): DeviceUnpairingResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUnpairingResult]
  }
}

