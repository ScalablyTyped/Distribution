package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureKeyVaultVariableGroupProviderData extends VariableGroupProviderData {
  
  var lastRefreshedOn: Date = js.native
  
  var serviceEndpointId: String = js.native
  
  var vault: String = js.native
}
object AzureKeyVaultVariableGroupProviderData {
  
  @scala.inline
  def apply(lastRefreshedOn: Date, serviceEndpointId: String, vault: String): AzureKeyVaultVariableGroupProviderData = {
    val __obj = js.Dynamic.literal(lastRefreshedOn = lastRefreshedOn.asInstanceOf[js.Any], serviceEndpointId = serviceEndpointId.asInstanceOf[js.Any], vault = vault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureKeyVaultVariableGroupProviderData]
  }
  
  @scala.inline
  implicit class AzureKeyVaultVariableGroupProviderDataOps[Self <: AzureKeyVaultVariableGroupProviderData] (val x: Self) extends AnyVal {
    
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
    def setLastRefreshedOn(value: Date): Self = this.set("lastRefreshedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceEndpointId(value: String): Self = this.set("serviceEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVault(value: String): Self = this.set("vault", value.asInstanceOf[js.Any])
  }
}
