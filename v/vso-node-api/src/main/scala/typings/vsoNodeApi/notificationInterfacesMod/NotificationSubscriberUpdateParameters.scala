package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSubscriberUpdateParameters extends js.Object {
  /**
    * New delivery preference for the subscriber (indicates how the subscriber should be notified).
    */
  var deliveryPreference: NotificationSubscriberDeliveryPreference
  /**
    * New preferred email address for the subscriber. Specify an empty string to clear the current address.
    */
  var preferredEmailAddress: String
}

object NotificationSubscriberUpdateParameters {
  @scala.inline
  def apply(deliveryPreference: NotificationSubscriberDeliveryPreference, preferredEmailAddress: String): NotificationSubscriberUpdateParameters = {
    val __obj = js.Dynamic.literal(deliveryPreference = deliveryPreference.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationSubscriberUpdateParameters]
  }
}

