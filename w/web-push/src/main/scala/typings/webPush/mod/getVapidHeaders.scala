package typings.webPush.mod

import typings.webPush.AnonAuthorizationCryptoKey
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
  ): AnonAuthorizationCryptoKey = js.native
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: ContentEncoding,
    expiration: Double
  ): AnonAuthorizationCryptoKey = js.native
}

