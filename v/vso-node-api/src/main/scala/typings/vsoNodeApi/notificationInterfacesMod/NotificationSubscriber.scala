package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSubscriber extends js.Object {
  /**
    * Indicates how the subscriber should be notified by default.
    */
  var deliveryPreference: NotificationSubscriberDeliveryPreference = js.native
  var flags: SubscriberFlags = js.native
  /**
    * Identifier of the subscriber.
    */
  var id: String = js.native
  /**
    * Preferred email address of the subscriber. A null or empty value indicates no preferred email address has been set.
    */
  var preferredEmailAddress: String = js.native
}

object NotificationSubscriber {
  @scala.inline
  def apply(
    deliveryPreference: NotificationSubscriberDeliveryPreference,
    flags: SubscriberFlags,
    id: String,
    preferredEmailAddress: String
  ): NotificationSubscriber = {
    val __obj = js.Dynamic.literal(deliveryPreference = deliveryPreference.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriber]
  }
  @scala.inline
  implicit class NotificationSubscriberOps[Self <: NotificationSubscriber] (val x: Self) extends AnyVal {
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
    def setDeliveryPreference(value: NotificationSubscriberDeliveryPreference): Self = this.set("deliveryPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: SubscriberFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferredEmailAddress(value: String): Self = this.set("preferredEmailAddress", value.asInstanceOf[js.Any])
  }
  
}

