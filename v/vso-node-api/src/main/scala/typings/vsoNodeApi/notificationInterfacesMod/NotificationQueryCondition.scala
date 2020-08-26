package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationQueryCondition extends js.Object {
  var eventInitiator: String = js.native
  var eventType: String = js.native
  var subscriber: String = js.native
  var subscriptionId: String = js.native
}

object NotificationQueryCondition {
  @scala.inline
  def apply(eventInitiator: String, eventType: String, subscriber: String, subscriptionId: String): NotificationQueryCondition = {
    val __obj = js.Dynamic.literal(eventInitiator = eventInitiator.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationQueryCondition]
  }
  @scala.inline
  implicit class NotificationQueryConditionOps[Self <: NotificationQueryCondition] (val x: Self) extends AnyVal {
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
    def setEventInitiator(value: String): Self = this.set("eventInitiator", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriber(value: String): Self = this.set("subscriber", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
  }
  
}

