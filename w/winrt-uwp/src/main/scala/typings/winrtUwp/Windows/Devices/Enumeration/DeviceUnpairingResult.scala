package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the result of attempting to unpair a device. */
@js.native
trait DeviceUnpairingResult extends StObject {
  
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
  implicit class DeviceUnpairingResultMutableBuilder[Self <: DeviceUnpairingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: DeviceUnpairingResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
