package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Settings governing "legacy" mode (non-Wi-Fi Direct connections to the access point being advertised.) */
trait WiFiDirectLegacySettings extends StObject {
  
  /** Gets or sets a value specifying whether "legacy mode" is enabled. When enabled, this mode causes this device to act as a normal Wi-Fi access point, and is intended to support devices which do not support connection via Wi-Fi Direct. */
  var isEnabled: Boolean
  
  /** Gets or sets the pass phrase used by non-Wi-Fi Direct clients to connect to this access point in "legacy mode". */
  var passphrase: PasswordCredential
  
  /** Gets or sets the Service Set Identifier (SSID, or "access point ID"). */
  var ssid: String
}
object WiFiDirectLegacySettings {
  
  inline def apply(isEnabled: Boolean, passphrase: PasswordCredential, ssid: String): WiFiDirectLegacySettings = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectLegacySettings]
  }
  
  extension [Self <: WiFiDirectLegacySettings](x: Self) {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setPassphrase(value: PasswordCredential): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
  }
}
