package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorattestationresponse}
  */
trait AuthenticatorAttestationResponse
  extends StObject
     with AuthenticatorResponse {
  
  val attestationObject: ArrayBuffer
}
object AuthenticatorAttestationResponse {
  
  inline def apply(attestationObject: ArrayBuffer, clientDataJSON: ArrayBuffer): AuthenticatorAttestationResponse = {
    val __obj = js.Dynamic.literal(attestationObject = attestationObject.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAttestationResponse]
  }
  
  extension [Self <: AuthenticatorAttestationResponse](x: Self) {
    
    inline def setAttestationObject(value: ArrayBuffer): Self = StObject.set(x, "attestationObject", value.asInstanceOf[js.Any])
  }
}
