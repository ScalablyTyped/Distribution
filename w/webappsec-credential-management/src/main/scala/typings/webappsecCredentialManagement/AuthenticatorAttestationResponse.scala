package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorattestationresponse}
  */
trait AuthenticatorAttestationResponse
  extends StObject
     with AuthenticatorResponse {
  
  val attestationObject: js.typedarray.ArrayBuffer
}
object AuthenticatorAttestationResponse {
  
  inline def apply(attestationObject: js.typedarray.ArrayBuffer, clientDataJSON: js.typedarray.ArrayBuffer): AuthenticatorAttestationResponse = {
    val __obj = js.Dynamic.literal(attestationObject = attestationObject.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAttestationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticatorAttestationResponse] (val x: Self) extends AnyVal {
    
    inline def setAttestationObject(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "attestationObject", value.asInstanceOf[js.Any])
  }
}
