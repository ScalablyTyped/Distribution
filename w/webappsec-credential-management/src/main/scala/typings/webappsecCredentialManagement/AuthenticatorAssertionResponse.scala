package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#iface-authenticatorassertionresponse}
  */
trait AuthenticatorAssertionResponse
  extends StObject
     with AuthenticatorResponse {
  
  val authenticatorData: js.typedarray.ArrayBuffer
  
  val signature: js.typedarray.ArrayBuffer
  
  val userHandle: js.typedarray.ArrayBuffer | Null
}
object AuthenticatorAssertionResponse {
  
  inline def apply(
    authenticatorData: js.typedarray.ArrayBuffer,
    clientDataJSON: js.typedarray.ArrayBuffer,
    signature: js.typedarray.ArrayBuffer
  ): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userHandle = null)
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
  
  extension [Self <: AuthenticatorAssertionResponse](x: Self) {
    
    inline def setAuthenticatorData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "authenticatorData", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setUserHandle(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "userHandle", value.asInstanceOf[js.Any])
    
    inline def setUserHandleNull: Self = StObject.set(x, "userHandle", null)
  }
}
