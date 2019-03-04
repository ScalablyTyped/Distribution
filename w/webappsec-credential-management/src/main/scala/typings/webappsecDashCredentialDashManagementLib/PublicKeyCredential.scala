package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#publickeycredential}
  */
trait PublicKeyCredential
  extends CredentialData
     with Credential {
  val rawId: stdLib.ArrayBuffer
  val response: AuthenticatorAttestationResponse | AuthenticatorAssertionResponse
  val `type`: PublicKeyCredentialType
}

object PublicKeyCredential {
  @scala.inline
  def apply(
    id: java.lang.String,
    rawId: stdLib.ArrayBuffer,
    response: AuthenticatorAttestationResponse | AuthenticatorAssertionResponse,
    `type`: PublicKeyCredentialType
  ): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(id = id, rawId = rawId, response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PublicKeyCredential]
  }
}

