package typings.webappsecDashCredentialDashManagement

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorresponse}
  */
trait AuthenticatorResponse extends js.Object {
  val clientDataJSON: ArrayBuffer
}

object AuthenticatorResponse {
  @scala.inline
  def apply(clientDataJSON: ArrayBuffer): AuthenticatorResponse = {
    val __obj = js.Dynamic.literal(clientDataJSON = clientDataJSON)
  
    __obj.asInstanceOf[AuthenticatorResponse]
  }
}

