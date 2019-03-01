package typings
package webDashPushLib.webDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscription extends js.Object {
  var endpoint: java.lang.String
  var keys: webDashPushLib.Anon_Auth
}

object PushSubscription {
  @scala.inline
  def apply(endpoint: java.lang.String, keys: webDashPushLib.Anon_Auth): PushSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("keys")(keys)
    __obj.asInstanceOf[PushSubscription]
  }
}

