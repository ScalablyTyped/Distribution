package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INetworkSecuritySettings extends StObject {
  
  var networkAuthenticationType: NetworkAuthenticationType = js.native
  
  var networkEncryptionType: NetworkEncryptionType = js.native
}
object INetworkSecuritySettings {
  
  @scala.inline
  def apply(networkAuthenticationType: NetworkAuthenticationType, networkEncryptionType: NetworkEncryptionType): INetworkSecuritySettings = {
    val __obj = js.Dynamic.literal(networkAuthenticationType = networkAuthenticationType.asInstanceOf[js.Any], networkEncryptionType = networkEncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkSecuritySettings]
  }
  
  @scala.inline
  implicit class INetworkSecuritySettingsMutableBuilder[Self <: INetworkSecuritySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkAuthenticationType(value: NetworkAuthenticationType): Self = StObject.set(x, "networkAuthenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEncryptionType(value: NetworkEncryptionType): Self = StObject.set(x, "networkEncryptionType", value.asInstanceOf[js.Any])
  }
}
