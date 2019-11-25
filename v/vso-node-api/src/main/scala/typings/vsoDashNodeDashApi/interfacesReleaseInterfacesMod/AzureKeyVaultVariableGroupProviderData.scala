package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureKeyVaultVariableGroupProviderData extends VariableGroupProviderData {
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
}

