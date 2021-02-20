package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the result of attempting to pair a device. */
@js.native
trait DevicePairingResult extends StObject {
  
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
  implicit class DevicePairingResultMutableBuilder[Self <: DevicePairingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectionLevelUsed(value: DevicePairingProtectionLevel): Self = StObject.set(x, "protectionLevelUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DevicePairingResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
