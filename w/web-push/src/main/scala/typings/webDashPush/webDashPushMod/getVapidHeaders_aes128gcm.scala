package typings.webDashPush.webDashPushMod

import typings.webDashPush.Anon_Authorization
import typings.webDashPush.webDashPushStrings.aes128gcm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "getVapidHeaders")
@js.native
object getVapidHeaders_aes128gcm extends js.Object {
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aes128gcm
  ): Anon_Authorization = js.native
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aes128gcm,
    expiration: Double
  ): Anon_Authorization = js.native
}

