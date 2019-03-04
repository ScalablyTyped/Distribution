package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#iface-authenticatorassertionresponse}
  */
trait AuthenticatorAssertionResponse extends AuthenticatorResponse {
  val authenticatorData: stdLib.ArrayBuffer
  val signature: stdLib.ArrayBuffer
  val userHandle: stdLib.ArrayBuffer | scala.Null
}

object AuthenticatorAssertionResponse {
  @scala.inline
  def apply(
    authenticatorData: stdLib.ArrayBuffer,
    clientDataJSON: stdLib.ArrayBuffer,
    signature: stdLib.ArrayBuffer,
    userHandle: stdLib.ArrayBuffer = null
  ): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData, clientDataJSON = clientDataJSON, signature = signature)
    if (userHandle != null) __obj.updateDynamic("userHandle")(userHandle)
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
}

