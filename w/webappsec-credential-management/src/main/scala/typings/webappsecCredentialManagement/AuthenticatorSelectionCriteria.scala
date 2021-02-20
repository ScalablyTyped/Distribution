package typings.webappsecCredentialManagement

import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.`cross-platform`
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.discouraged
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.platform
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.preferred
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-authenticatorselectioncriteria}
  */
@js.native
trait AuthenticatorSelectionCriteria extends StObject {
  
  var authenticatorAttachment: js.UndefOr[platform | `cross-platform`] = js.native
  
  var requireResidentKey: js.UndefOr[Boolean] = js.native
  
  var userVerification: js.UndefOr[required | preferred | discouraged] = js.native
}
object AuthenticatorSelectionCriteria {
  
  @scala.inline
  def apply(): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
  
  @scala.inline
  implicit class AuthenticatorSelectionCriteriaMutableBuilder[Self <: AuthenticatorSelectionCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorAttachment(value: platform | `cross-platform`): Self = StObject.set(x, "authenticatorAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticatorAttachmentUndefined: Self = StObject.set(x, "authenticatorAttachment", js.undefined)
    
    @scala.inline
    def setRequireResidentKey(value: Boolean): Self = StObject.set(x, "requireResidentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireResidentKeyUndefined: Self = StObject.set(x, "requireResidentKey", js.undefined)
    
    @scala.inline
    def setUserVerification(value: required | preferred | discouraged): Self = StObject.set(x, "userVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVerificationUndefined: Self = StObject.set(x, "userVerification", js.undefined)
  }
}
