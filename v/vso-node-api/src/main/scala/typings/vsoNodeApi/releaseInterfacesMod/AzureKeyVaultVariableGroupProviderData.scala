package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureKeyVaultVariableGroupProviderData
  extends StObject
     with VariableGroupProviderData {
  
  var lastRefreshedOn: Date
  
  var serviceEndpointId: String
  
  var vault: String
}
object AzureKeyVaultVariableGroupProviderData {
  
  @scala.inline
  def apply(lastRefreshedOn: Date, serviceEndpointId: String, vault: String): AzureKeyVaultVariableGroupProviderData = {
    val __obj = js.Dynamic.literal(lastRefreshedOn = lastRefreshedOn.asInstanceOf[js.Any], serviceEndpointId = serviceEndpointId.asInstanceOf[js.Any], vault = vault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureKeyVaultVariableGroupProviderData]
  }
  
  @scala.inline
  implicit class AzureKeyVaultVariableGroupProviderDataMutableBuilder[Self <: AzureKeyVaultVariableGroupProviderData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastRefreshedOn(value: Date): Self = StObject.set(x, "lastRefreshedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceEndpointId(value: String): Self = StObject.set(x, "serviceEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVault(value: String): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
  }
}
