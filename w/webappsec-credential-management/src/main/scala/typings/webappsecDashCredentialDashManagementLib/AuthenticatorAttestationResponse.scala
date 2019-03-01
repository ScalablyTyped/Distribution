package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorattestationresponse}
  */
trait AuthenticatorAttestationResponse extends AuthenticatorResponse {
  val attestationObject: stdLib.ArrayBuffer
}

object AuthenticatorAttestationResponse {
  @scala.inline
  def apply(attestationObject: stdLib.ArrayBuffer, clientDataJSON: stdLib.ArrayBuffer): AuthenticatorAttestationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attestationObject")(attestationObject)
    __obj.updateDynamic("clientDataJSON")(clientDataJSON)
    __obj.asInstanceOf[AuthenticatorAttestationResponse]
  }
}

