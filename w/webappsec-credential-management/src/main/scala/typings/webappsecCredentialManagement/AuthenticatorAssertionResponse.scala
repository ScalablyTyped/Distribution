package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#iface-authenticatorassertionresponse}
  */
trait AuthenticatorAssertionResponse
  extends StObject
     with AuthenticatorResponse {
  
  val authenticatorData: ArrayBuffer
  
  val signature: ArrayBuffer
  
  val userHandle: ArrayBuffer | Null
}
object AuthenticatorAssertionResponse {
  
  inline def apply(authenticatorData: ArrayBuffer, clientDataJSON: ArrayBuffer, signature: ArrayBuffer): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userHandle = null)
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
  
  extension [Self <: AuthenticatorAssertionResponse](x: Self) {
    
    inline def setAuthenticatorData(value: ArrayBuffer): Self = StObject.set(x, "authenticatorData", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: ArrayBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setUserHandle(value: ArrayBuffer): Self = StObject.set(x, "userHandle", value.asInstanceOf[js.Any])
    
    inline def setUserHandleNull: Self = StObject.set(x, "userHandle", null)
  }
}
