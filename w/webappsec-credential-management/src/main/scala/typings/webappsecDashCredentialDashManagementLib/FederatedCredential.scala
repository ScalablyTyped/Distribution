package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FederatedCredential")
@js.native
class FederatedCredential protected () extends SiteBoundCredential {
  def this(data: FederatedCredentialData) = this()
  /**
    * The credential’s federated identity provider’s protocol (e.g.
    * "openidconnect"). If this value is null, then the protocol can be
    * inferred from the provider.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredential-protocol}
    */
  val protocol: java.lang.String | scala.Null = js.native
  /**
    * The credential’s federated identity provider. Must be a absolute,
    * hierarchical, https URI with no path (e.g. https://www.facebook.com).
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredential-provider}
    */
  val provider: java.lang.String = js.native
  @JSName("type")
  val type_FederatedCredential: webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.federated = js.native
}

