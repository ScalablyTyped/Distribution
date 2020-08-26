package typings.stripe.mod.subscriptionItems

import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionItemListOptions extends IListOptionsCreated {
  /**
    * The ID of the subscription whose items will be retrieved.
    */
  var subscription: String = js.native
}

object ISubscriptionItemListOptions {
  @scala.inline
  def apply(subscription: String): ISubscriptionItemListOptions = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionItemListOptions]
  }
  @scala.inline
  implicit class ISubscriptionItemListOptionsOps[Self <: ISubscriptionItemListOptions] (val x: Self) extends AnyVal {
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
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
  }
  
}

