package typings.webappsecCredentialManagement

import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.federated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederatedCredential
  extends StObject
     with SiteBoundCredential
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
  def apply(id: String, provider: String): FederatedCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], iconURL = null, name = null, protocol = null)
    __obj.updateDynamic("type")("federated")
    __obj.asInstanceOf[FederatedCredential]
  }
  
  @scala.inline
  implicit class FederatedCredentialMutableBuilder[Self <: FederatedCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: federated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
