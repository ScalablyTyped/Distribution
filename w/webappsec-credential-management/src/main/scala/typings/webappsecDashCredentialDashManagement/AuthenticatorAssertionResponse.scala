package typings.webappsecDashCredentialDashManagement

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#iface-authenticatorassertionresponse}
  */
trait AuthenticatorAssertionResponse extends AuthenticatorResponse {
  val authenticatorData: ArrayBuffer
  val signature: ArrayBuffer
  val userHandle: ArrayBuffer | Null
}

object AuthenticatorAssertionResponse {
  @scala.inline
  def apply(
    authenticatorData: ArrayBuffer,
    clientDataJSON: ArrayBuffer,
    signature: ArrayBuffer,
    userHandle: ArrayBuffer = null
  ): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData, clientDataJSON = clientDataJSON, signature = signature)
    if (userHandle != null) __obj.updateDynamic("userHandle")(userHandle)
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
}

