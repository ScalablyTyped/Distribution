package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the result of attempting to pair a device. */
trait DevicePairingResult extends js.Object {
  /** Gets the level of protection used to pair the device. */
  var protectionLevelUsed: DevicePairingProtectionLevel
  /** Gets the paired status of the device after the pairing action completed. */
  var status: DevicePairingResultStatus
}

object DevicePairingResult {
  @scala.inline
  def apply(protectionLevelUsed: DevicePairingProtectionLevel, status: DevicePairingResultStatus): DevicePairingResult = {
    val __obj = js.Dynamic.literal(protectionLevelUsed = protectionLevelUsed.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePairingResult]
  }
}

