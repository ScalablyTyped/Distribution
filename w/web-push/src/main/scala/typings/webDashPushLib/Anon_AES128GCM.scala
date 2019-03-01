package typings
package webDashPushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AES128GCM extends js.Object {
  val AES_128_GCM: webDashPushLib.webDashPushLibStrings.aws128gcm with webDashPushLib.webDashPushMod.ContentEncoding
  val AES_GCM: webDashPushLib.webDashPushLibStrings.aesgcm with webDashPushLib.webDashPushMod.ContentEncoding
}

object Anon_AES128GCM {
  @scala.inline
  def apply(
    AES_128_GCM: webDashPushLib.webDashPushLibStrings.aws128gcm with webDashPushLib.webDashPushMod.ContentEncoding,
    AES_GCM: webDashPushLib.webDashPushLibStrings.aesgcm with webDashPushLib.webDashPushMod.ContentEncoding
  ): Anon_AES128GCM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AES_128_GCM")(AES_128_GCM)
    __obj.updateDynamic("AES_GCM")(AES_GCM)
    __obj.asInstanceOf[Anon_AES128GCM]
  }
}

