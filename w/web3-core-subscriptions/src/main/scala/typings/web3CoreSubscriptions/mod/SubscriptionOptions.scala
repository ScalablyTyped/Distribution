package typings.web3CoreSubscriptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionOptions extends js.Object {
  var requestManager: js.Any = js.native
  var subscription: String = js.native
  var `type`: String = js.native
}

object SubscriptionOptions {
  @scala.inline
  def apply(requestManager: js.Any, subscription: String, `type`: String): SubscriptionOptions = {
    val __obj = js.Dynamic.literal(requestManager = requestManager.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
  @scala.inline
  implicit class SubscriptionOptionsOps[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
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
    def setRequestManager(value: js.Any): Self = this.set("requestManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

