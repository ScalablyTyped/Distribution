package typings.webPush.mod

import typings.webPush.AnonCryptoKey
import typings.webPush.webPushStrings.aesgcm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "getVapidHeaders")
@js.native
object getVapidHeaders_aesgcm extends js.Object {
  def apply(audience: String, subject: String, publicKey: String, privateKey: String, contentEncoding: aesgcm): AnonCryptoKey = js.native
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aesgcm,
    expiration: Double
  ): AnonCryptoKey = js.native
}

