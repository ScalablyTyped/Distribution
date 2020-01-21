package typings.webPush.mod

import typings.webPush.AnonAuthorizationCryptoKeyString
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
  ): AnonAuthorizationCryptoKeyString = js.native
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: ContentEncoding,
    expiration: Double
  ): AnonAuthorizationCryptoKeyString = js.native
}

