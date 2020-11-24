package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the result of attempting to unpair a device. */
@js.native
trait DeviceUnpairingResult extends js.Object {
  
  /** Gets the paired status of the device after the unpairing action completed. */
  var status: DeviceUnpairingResultStatus = js.native
}
object DeviceUnpairingResult {
  
  @scala.inline
  def apply(status: DeviceUnpairingResultStatus): DeviceUnpairingResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUnpairingResult]
  }
  
  @scala.inline
  implicit class DeviceUnpairingResultOps[Self <: DeviceUnpairingResult] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: DeviceUnpairingResultStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
