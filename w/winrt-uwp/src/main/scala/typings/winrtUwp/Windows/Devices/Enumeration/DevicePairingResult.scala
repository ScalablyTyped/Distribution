package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the result of attempting to pair a device. */
trait DevicePairingResult extends StObject {
  
  /** Gets the level of protection used to pair the device. */
  var protectionLevelUsed: DevicePairingProtectionLevel
  
  /** Gets the paired status of the device after the pairing action completed. */
  var status: DevicePairingResultStatus
}
object DevicePairingResult {
  
  inline def apply(protectionLevelUsed: DevicePairingProtectionLevel, status: DevicePairingResultStatus): DevicePairingResult = {
    val __obj = js.Dynamic.literal(protectionLevelUsed = protectionLevelUsed.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePairingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DevicePairingResult] (val x: Self) extends AnyVal {
    
    inline def setProtectionLevelUsed(value: DevicePairingProtectionLevel): Self = StObject.set(x, "protectionLevelUsed", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DevicePairingResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
