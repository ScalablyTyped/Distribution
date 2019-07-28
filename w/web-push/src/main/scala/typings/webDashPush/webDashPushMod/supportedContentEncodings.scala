package typings.webDashPush.webDashPushMod

import typings.webDashPush.webDashPushStrings.aesgcm
import typings.webDashPush.webDashPushStrings.aws128gcm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "supportedContentEncodings")
@js.native
object supportedContentEncodings extends js.Object {
  val AES_128_GCM: aws128gcm with ContentEncoding = js.native
  val AES_GCM: aesgcm with ContentEncoding = js.native
}

