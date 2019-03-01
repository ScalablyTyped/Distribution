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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("rawId")(rawId)
    __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
}

