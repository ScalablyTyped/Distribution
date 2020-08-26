package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the result of attempting to pair a device. */
@js.native
trait DevicePairingResult extends js.Object {
  /** Gets the level of protection used to pair the device. */
  var protectionLevelUsed: DevicePairingProtectionLevel = js.native
  /** Gets the paired status of the device after the pairing action completed. */
  var status: DevicePairingResultStatus = js.native
}

object DevicePairingResult {
  @scala.inline
  def apply(protectionLevelUsed: DevicePairingProtectionLevel, status: DevicePairingResultStatus): DevicePairingResult = {
    val __obj = js.Dynamic.literal(protectionLevelUsed = protectionLevelUsed.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePairingResult]
  }
  @scala.inline
  implicit class DevicePairingResultOps[Self <: DevicePairingResult] (val x: Self) extends AnyVal {
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
    def setProtectionLevelUsed(value: DevicePairingProtectionLevel): Self = this.set("protectionLevelUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: DevicePairingResultStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

