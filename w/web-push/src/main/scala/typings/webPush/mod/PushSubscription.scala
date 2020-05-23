package typings.webPush.mod

import typings.webPush.anon.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscription extends js.Object {
  var endpoint: String
  var keys: Auth
}

object PushSubscription {
  @scala.inline
  def apply(endpoint: String, keys: Auth): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSubscription]
  }
}

