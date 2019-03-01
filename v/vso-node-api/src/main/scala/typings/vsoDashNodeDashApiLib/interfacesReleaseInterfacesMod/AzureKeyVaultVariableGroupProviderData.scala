package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureKeyVaultVariableGroupProviderData extends VariableGroupProviderData {
  var lastRefreshedOn: stdLib.Date
  var serviceEndpointId: java.lang.String
  var vault: java.lang.String
}

object AzureKeyVaultVariableGroupProviderData {
  @scala.inline
  def apply(lastRefreshedOn: stdLib.Date, serviceEndpointId: java.lang.String, vault: java.lang.String): AzureKeyVaultVariableGroupProviderData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lastRefreshedOn")(lastRefreshedOn)
    __obj.updateDynamic("serviceEndpointId")(serviceEndpointId)
    __obj.updateDynamic("vault")(vault)
    __obj.asInstanceOf[AzureKeyVaultVariableGroupProviderData]
  }
}

