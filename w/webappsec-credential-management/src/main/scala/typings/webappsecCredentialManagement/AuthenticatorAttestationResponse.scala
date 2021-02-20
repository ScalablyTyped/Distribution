package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorattestationresponse}
  */
@js.native
trait AuthenticatorAttestationResponse extends AuthenticatorResponse {
  
  val attestationObject: ArrayBuffer = js.native
}
object AuthenticatorAttestationResponse {
  
  @scala.inline
  def apply(attestationObject: ArrayBuffer, clientDataJSON: ArrayBuffer): AuthenticatorAttestationResponse = {
    val __obj = js.Dynamic.literal(attestationObject = attestationObject.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAttestationResponse]
  }
  
  @scala.inline
  implicit class AuthenticatorAttestationResponseMutableBuilder[Self <: AuthenticatorAttestationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttestationObject(value: ArrayBuffer): Self = StObject.set(x, "attestationObject", value.asInstanceOf[js.Any])
  }
}
