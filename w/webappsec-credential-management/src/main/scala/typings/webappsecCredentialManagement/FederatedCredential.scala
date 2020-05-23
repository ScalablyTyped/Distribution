package typings.webappsecCredentialManagement

import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.federated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FederatedCredential
  extends SiteBoundCredential
     with CredentialType {
  /**
    * The credential’s federated identity provider’s protocol (e.g.
    * "openidconnect"). If this value is null, then the protocol can be
    * inferred from the provider.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredential-protocol}
    */
  val protocol: String | Null
  /**
    * The credential’s federated identity provider. Must be a absolute,
    * hierarchical, https URI with no path (e.g. https://www.facebook.com).
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredential-provider}
    */
  val provider: String
  @JSName("type")
  val type_FederatedCredential: federated
}

object FederatedCredential {
  @scala.inline
  def apply(
    id: String,
    provider: String,
    `type`: federated,
    iconURL: String = null,
    name: String = null,
    protocol: String = null
  ): FederatedCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], iconURL = iconURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedCredential]
  }
}

