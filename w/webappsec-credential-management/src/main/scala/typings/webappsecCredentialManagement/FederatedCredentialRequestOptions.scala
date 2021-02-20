package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-federatedcredentialrequestoptions}
  */
@js.native
trait FederatedCredentialRequestOptions extends StObject {
  
  /**
    * An array of protocol identifiers.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredentialrequestoptions-protocols}
    */
  var protocols: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of federation identifiers.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredentialrequestoptions-providers}
    */
  var providers: js.UndefOr[js.Array[String]] = js.native
}
object FederatedCredentialRequestOptions {
  
  @scala.inline
  def apply(): FederatedCredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedCredentialRequestOptions]
  }
  
  @scala.inline
  implicit class FederatedCredentialRequestOptionsMutableBuilder[Self <: FederatedCredentialRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[String]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: String*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
