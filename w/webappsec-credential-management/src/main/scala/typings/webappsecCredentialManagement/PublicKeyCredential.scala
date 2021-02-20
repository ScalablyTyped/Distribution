package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#publickeycredential}
  */
@js.native
trait PublicKeyCredential
  extends Credential
     with CredentialType {
  
  val rawId: ArrayBuffer = js.native
  
  val response: AuthenticatorResponse = js.native
  
  @JSName("type")
  val type_PublicKeyCredential: `public-key` = js.native
}
object PublicKeyCredential {
  
  @scala.inline
  def apply(id: String, rawId: ArrayBuffer, response: AuthenticatorResponse, `type`: `public-key`): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialMutableBuilder[Self <: PublicKeyCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRawId(value: ArrayBuffer): Self = StObject.set(x, "rawId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: AuthenticatorResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `public-key`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
