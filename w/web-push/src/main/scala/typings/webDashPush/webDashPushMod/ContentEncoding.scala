package typings.webDashPush.webDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webDashPush.webDashPushStrings.aesgcm
  - typings.webDashPush.webDashPushStrings.aes128gcm
*/
trait ContentEncoding extends js.Object

object ContentEncoding {
  @scala.inline
  def aes128gcm: typings.webDashPush.webDashPushStrings.aes128gcm = this.cast("aes128gcm")
  @scala.inline
  def aesgcm: typings.webDashPush.webDashPushStrings.aesgcm = this.cast("aesgcm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

