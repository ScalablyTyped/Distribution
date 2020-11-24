package typings.webPush.mod

import typings.webPush.anon.CryptoKey
import typings.webPush.webPushStrings.aesgcm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-push", "getVapidHeaders")
@js.native
object getVapidHeaders_aesgcm extends js.Object {
  
  def apply(audience: String, subject: String, publicKey: String, privateKey: String, contentEncoding: aesgcm): CryptoKey = js.native
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aesgcm,
    expiration: Double
  ): CryptoKey = js.native
}
