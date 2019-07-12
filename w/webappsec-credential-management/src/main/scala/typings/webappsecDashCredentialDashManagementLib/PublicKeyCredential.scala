package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#publickeycredential}
  */
trait PublicKeyCredential
  extends Credential
     with CredentialType {
  val rawId: stdLib.ArrayBuffer
  val response: AuthenticatorResponse
  @JSName("type")
  val type_PublicKeyCredential: webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.`public-key`
}

object PublicKeyCredential {
  @scala.inline
  def apply(
    id: java.lang.String,
    rawId: stdLib.ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.`public-key`
  ): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(id = id, rawId = rawId, response = response)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PublicKeyCredential]
  }
}

