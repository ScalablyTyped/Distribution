package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorresponse}
  */
trait AuthenticatorResponse extends js.Object {
  val clientDataJSON: stdLib.ArrayBuffer
}

object AuthenticatorResponse {
  @scala.inline
  def apply(clientDataJSON: stdLib.ArrayBuffer): AuthenticatorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientDataJSON")(clientDataJSON)
    __obj.asInstanceOf[AuthenticatorResponse]
  }
}

