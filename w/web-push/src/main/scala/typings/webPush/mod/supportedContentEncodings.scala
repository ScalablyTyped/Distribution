package typings.webPush.mod

import typings.webPush.webPushStrings.aesgcm
import typings.webPush.webPushStrings.aws128gcm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-push", "supportedContentEncodings")
@js.native
object supportedContentEncodings extends js.Object {
  
  val AES_128_GCM: aws128gcm with ContentEncoding = js.native
  
  val AES_GCM: aesgcm with ContentEncoding = js.native
}
