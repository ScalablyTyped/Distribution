package typings.webappsecCredentialManagement

import typings.std.AbortSignal
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.optional
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.required
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-credentialrequestoptions}
  */
trait CredentialRequestOptions extends StObject {
  
  /**
    * If set, the user agent will request {@link FederatedCredential} objects
    * for the providers and protocol types listed. Defaults to {@code null}.
    */
  var federated: js.UndefOr[FederatedCredentialRequestOptions] = js.undefined
  
  /**
    * This property specifies the mediation requirements for a given credential
    * request.
    */
  var mediation: js.UndefOr[silent | optional | required] = js.undefined
  
  /**
    * If set, the user agent will request {@link PasswordCredential} objects.
    * Defaults to {@code false}.
    */
  var password: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property specifies options for requesting a public-key signature.
    */
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.undefined
  
  /**
    * This property lets the developer abort an ongoing get() operation.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * If {@code true}, the user agent will only attempt to provide a Credential
    * without user interaction. Defaults to {@code false}.
    *
    * @deprecated Use {@link mediation} instead.
    */
  var unmediated: js.UndefOr[Boolean] = js.undefined
}
object CredentialRequestOptions {
  
  @scala.inline
  def apply(): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialRequestOptions]
  }
  
  @scala.inline
  implicit class CredentialRequestOptionsMutableBuilder[Self <: CredentialRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFederated(value: FederatedCredentialRequestOptions): Self = StObject.set(x, "federated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedUndefined: Self = StObject.set(x, "federated", js.undefined)
    
    @scala.inline
    def setMediation(value: silent | optional | required): Self = StObject.set(x, "mediation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediationUndefined: Self = StObject.set(x, "mediation", js.undefined)
    
    @scala.inline
    def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPublicKey(value: PublicKeyCredentialRequestOptions): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setUnmediated(value: Boolean): Self = StObject.set(x, "unmediated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmediatedUndefined: Self = StObject.set(x, "unmediated", js.undefined)
  }
}
