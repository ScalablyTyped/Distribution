package typings.webDashPush.webDashPushMod

import typings.webDashPush.Anon_Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscription extends js.Object {
  var endpoint: String
  var keys: Anon_Auth
}

object PushSubscription {
  @scala.inline
  def apply(endpoint: String, keys: Anon_Auth): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint, keys = keys)
  
    __obj.asInstanceOf[PushSubscription]
  }
}

