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

