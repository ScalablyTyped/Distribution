package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INetworkSecuritySettings extends StObject {
  
  var networkAuthenticationType: NetworkAuthenticationType
  
  var networkEncryptionType: NetworkEncryptionType
}
object INetworkSecuritySettings {
  
  inline def apply(networkAuthenticationType: NetworkAuthenticationType, networkEncryptionType: NetworkEncryptionType): INetworkSecuritySettings = {
    val __obj = js.Dynamic.literal(networkAuthenticationType = networkAuthenticationType.asInstanceOf[js.Any], networkEncryptionType = networkEncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkSecuritySettings]
  }
  
  extension [Self <: INetworkSecuritySettings](x: Self) {
    
    inline def setNetworkAuthenticationType(value: NetworkAuthenticationType): Self = StObject.set(x, "networkAuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setNetworkEncryptionType(value: NetworkEncryptionType): Self = StObject.set(x, "networkEncryptionType", value.asInstanceOf[js.Any])
  }
}
