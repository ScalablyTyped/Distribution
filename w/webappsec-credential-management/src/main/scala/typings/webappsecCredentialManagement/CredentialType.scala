package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.federated
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webappsecCredentialManagement.PasswordCredential
  - typings.webappsecCredentialManagement.FederatedCredential
  - typings.webappsecCredentialManagement.PublicKeyCredential
*/
trait CredentialType extends StObject
object CredentialType {
  
  @scala.inline
  def FederatedCredential(id: String, provider: String, `type`: federated): typings.webappsecCredentialManagement.FederatedCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webappsecCredentialManagement.FederatedCredential]
  }
  
  @scala.inline
  def PasswordCredential(id: String, idName: String, passwordName: String, `type`: password): typings.webappsecCredentialManagement.PasswordCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], idName = idName.asInstanceOf[js.Any], passwordName = passwordName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webappsecCredentialManagement.PasswordCredential]
  }
  
  @scala.inline
  def PublicKeyCredential(id: String, rawId: ArrayBuffer, response: AuthenticatorResponse, `type`: `public-key`): typings.webappsecCredentialManagement.PublicKeyCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webappsecCredentialManagement.PublicKeyCredential]
  }
}
