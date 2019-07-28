package typings.webappsecDashCredentialDashManagement

import typings.std.ArrayBuffer
import typings.webappsecDashCredentialDashManagement.webappsecDashCredentialDashManagementStrings.`public-key`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#publickeycredential}
  */
trait PublicKeyCredential
  extends Credential
     with CredentialType {
  val rawId: ArrayBuffer
  val response: AuthenticatorResponse
  @JSName("type")
  val type_PublicKeyCredential: `public-key`
}

object PublicKeyCredential {
  @scala.inline
  def apply(id: String, rawId: ArrayBuffer, response: AuthenticatorResponse, `type`: `public-key`): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(id = id, rawId = rawId, response = response)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PublicKeyCredential]
  }
}

