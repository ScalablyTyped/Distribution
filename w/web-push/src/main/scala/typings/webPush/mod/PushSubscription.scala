package typings.webPush.mod

import typings.webPush.AnonAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscription extends js.Object {
  var endpoint: String
  var keys: AnonAuth
}

object PushSubscription {
  @scala.inline
  def apply(endpoint: String, keys: AnonAuth): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSubscription]
  }
}

