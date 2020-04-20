package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorattestationresponse}
  */
trait AuthenticatorAttestationResponse extends AuthenticatorResponse {
  val attestationObject: ArrayBuffer
}

object AuthenticatorAttestationResponse {
  @scala.inline
  def apply(attestationObject: ArrayBuffer, clientDataJSON: ArrayBuffer): AuthenticatorAttestationResponse = {
    val __obj = js.Dynamic.literal(attestationObject = attestationObject.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAttestationResponse]
  }
}

