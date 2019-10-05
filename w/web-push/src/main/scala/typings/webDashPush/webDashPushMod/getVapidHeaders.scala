package typings.webDashPush.webDashPushMod

import typings.webDashPush.Anon_AuthorizationCryptoKeyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "getVapidHeaders")
@js.native
object getVapidHeaders extends js.Object {
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: ContentEncoding
  ): Anon_AuthorizationCryptoKeyString = js.native
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: ContentEncoding,
    expiration: Double
  ): Anon_AuthorizationCryptoKeyString = js.native
}

