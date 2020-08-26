package typings.webappsecCredentialManagement

import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.federated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FederatedCredential
  extends SiteBoundCredential
     with CredentialType {
  /**
    * The credential’s federated identity provider’s protocol (e.g.
    * "openidconnect"). If this value is null, then the protocol can be
    * inferred from the provider.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredential-protocol}
    */
  val protocol: String | Null = js.native
  /**
    * The credential’s federated identity provider. Must be a absolute,
    * hierarchical, https URI with no path (e.g. https://www.facebook.com).
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredential-provider}
    */
  val provider: String = js.native
  @JSName("type")
  val type_FederatedCredential: federated = js.native
}

object FederatedCredential {
  @scala.inline
  def apply(id: String, provider: String, `type`: federated): FederatedCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedCredential]
  }
  @scala.inline
  implicit class FederatedCredentialOps[Self <: FederatedCredential] (val x: Self) extends AnyVal {
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
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: federated): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolNull: Self = this.set("protocol", null)
  }
  
}

