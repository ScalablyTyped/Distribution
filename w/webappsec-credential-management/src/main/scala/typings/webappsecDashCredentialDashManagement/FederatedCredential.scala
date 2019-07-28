package typings.webappsecDashCredentialDashManagement

import typings.webappsecDashCredentialDashManagement.webappsecDashCredentialDashManagementStrings.federated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FederatedCredential")
@js.native
class FederatedCredential protected ()
  extends SiteBoundCredential
     with CredentialType {
  def this(data: FederatedCredentialData) = this()
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

