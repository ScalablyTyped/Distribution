package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureKeyVaultVariableGroupProviderData
  extends StObject
     with VariableGroupProviderData {
  
  var lastRefreshedOn: js.Date
  
  var serviceEndpointId: String
  
  var vault: String
}
object AzureKeyVaultVariableGroupProviderData {
  
  inline def apply(lastRefreshedOn: js.Date, serviceEndpointId: String, vault: String): AzureKeyVaultVariableGroupProviderData = {
    val __obj = js.Dynamic.literal(lastRefreshedOn = lastRefreshedOn.asInstanceOf[js.Any], serviceEndpointId = serviceEndpointId.asInstanceOf[js.Any], vault = vault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureKeyVaultVariableGroupProviderData]
  }
  
  extension [Self <: AzureKeyVaultVariableGroupProviderData](x: Self) {
    
    inline def setLastRefreshedOn(value: js.Date): Self = StObject.set(x, "lastRefreshedOn", value.asInstanceOf[js.Any])
    
    inline def setServiceEndpointId(value: String): Self = StObject.set(x, "serviceEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVault(value: String): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
  }
}
