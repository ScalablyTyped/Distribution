package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the current network security settings. */
@js.native
trait NetworkSecuritySettings extends StObject {
  
  /** Retrieves the type of authentication used by the network. */
  var networkAuthenticationType: NetworkAuthenticationType = js.native
  
  /** Retrieves the type of encryption used by the network. */
  var networkEncryptionType: NetworkEncryptionType = js.native
}
object NetworkSecuritySettings {
  
  @scala.inline
  def apply(networkAuthenticationType: NetworkAuthenticationType, networkEncryptionType: NetworkEncryptionType): NetworkSecuritySettings = {
    val __obj = js.Dynamic.literal(networkAuthenticationType = networkAuthenticationType.asInstanceOf[js.Any], networkEncryptionType = networkEncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkSecuritySettings]
  }
  
  @scala.inline
  implicit class NetworkSecuritySettingsMutableBuilder[Self <: NetworkSecuritySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkAuthenticationType(value: NetworkAuthenticationType): Self = StObject.set(x, "networkAuthenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEncryptionType(value: NetworkEncryptionType): Self = StObject.set(x, "networkEncryptionType", value.asInstanceOf[js.Any])
  }
}
