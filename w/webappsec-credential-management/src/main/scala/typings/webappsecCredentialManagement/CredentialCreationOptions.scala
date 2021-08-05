package typings.webappsecCredentialManagement

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-credentialcreationoptions}
  */
trait CredentialCreationOptions extends StObject {
  
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dom-credentialcreationoptions-federated}
    */
  var federated: js.UndefOr[FederatedCredentialInit] = js.undefined
  
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-federatedcredentialinit}
    */
  var password: js.UndefOr[PasswordCredentialInit] = js.undefined
  
  /**
    * @see {@link https://w3c.github.io/webauthn/#dictionary-makecredentialoptions}
    */
  var publicKey: js.UndefOr[PublicKeyCredentialCreationOptions] = js.undefined
  
  /**
    * @see {@link https://w3c.github.io/webappsec-credential-management/#dom-credentialrequestoptions-signal}
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object CredentialCreationOptions {
  
  inline def apply(): CredentialCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialCreationOptions]
  }
  
  extension [Self <: CredentialCreationOptions](x: Self) {
    
    inline def setFederated(value: FederatedCredentialInit): Self = StObject.set(x, "federated", value.asInstanceOf[js.Any])
    
    inline def setFederatedUndefined: Self = StObject.set(x, "federated", js.undefined)
    
    inline def setPassword(value: PasswordCredentialInit): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPublicKey(value: PublicKeyCredentialCreationOptions): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
