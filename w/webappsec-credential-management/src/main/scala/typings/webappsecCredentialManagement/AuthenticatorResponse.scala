package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorresponse}
  */
trait AuthenticatorResponse extends StObject {
  
  val clientDataJSON: ArrayBuffer
}
object AuthenticatorResponse {
  
  inline def apply(clientDataJSON: ArrayBuffer): AuthenticatorResponse = {
    val __obj = js.Dynamic.literal(clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorResponse]
  }
  
  extension [Self <: AuthenticatorResponse](x: Self) {
    
    inline def setClientDataJSON(value: ArrayBuffer): Self = StObject.set(x, "clientDataJSON", value.asInstanceOf[js.Any])
  }
}
