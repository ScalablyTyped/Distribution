package typings.webPush.mod

import typings.webPush.anon.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushSubscription extends js.Object {
  var endpoint: String = js.native
  var keys: Auth = js.native
}

object PushSubscription {
  @scala.inline
  def apply(endpoint: String, keys: Auth): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSubscription]
  }
  @scala.inline
  implicit class PushSubscriptionOps[Self <: PushSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: Auth): Self = this.set("keys", value.asInstanceOf[js.Any])
  }
  
}

