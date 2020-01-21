package typings.webPush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webPush.webPushStrings.aesgcm
  - typings.webPush.webPushStrings.aes128gcm
*/
trait ContentEncoding extends js.Object

object ContentEncoding {
  @scala.inline
  def aes128gcm: typings.webPush.webPushStrings.aes128gcm = this.cast("aes128gcm")
  @scala.inline
  def aesgcm: typings.webPush.webPushStrings.aesgcm = this.cast("aesgcm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

