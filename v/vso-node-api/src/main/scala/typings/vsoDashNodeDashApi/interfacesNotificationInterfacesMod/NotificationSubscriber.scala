package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSubscriber extends js.Object {
  /**
    * Indicates how the subscriber should be notified by default.
    */
  var deliveryPreference: NotificationSubscriberDeliveryPreference
  var flags: SubscriberFlags
  /**
    * Identifier of the subscriber.
    */
  var id: String
  /**
    * Preferred email address of the subscriber. A null or empty value indicates no preferred email address has been set.
    */
  var preferredEmailAddress: String
}

object NotificationSubscriber {
  @scala.inline
  def apply(
    deliveryPreference: NotificationSubscriberDeliveryPreference,
    flags: SubscriberFlags,
    id: String,
    preferredEmailAddress: String
  ): NotificationSubscriber = {
    val __obj = js.Dynamic.literal(deliveryPreference = deliveryPreference, flags = flags, id = id, preferredEmailAddress = preferredEmailAddress)
  
    __obj.asInstanceOf[NotificationSubscriber]
  }
}

