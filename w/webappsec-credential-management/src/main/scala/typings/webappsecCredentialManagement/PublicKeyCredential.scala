package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#publickeycredential}
  */
trait PublicKeyCredential
  extends StObject
     with Credential
     with CredentialType {
  
  val rawId: ArrayBuffer
  
  val response: AuthenticatorResponse
  
  @JSName("type")
  val type_PublicKeyCredential: `public-key`
}
object PublicKeyCredential {
  
  inline def apply(id: String, rawId: ArrayBuffer, response: AuthenticatorResponse): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public-key")
    __obj.asInstanceOf[PublicKeyCredential]
  }
  
  extension [Self <: PublicKeyCredential](x: Self) {
    
    inline def setRawId(value: ArrayBuffer): Self = StObject.set(x, "rawId", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: AuthenticatorResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setType(value: `public-key`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
