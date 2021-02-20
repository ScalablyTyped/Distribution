package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationSubscriberUpdateParameters extends StObject {
  
  /**
    * New delivery preference for the subscriber (indicates how the subscriber should be notified).
    */
  var deliveryPreference: NotificationSubscriberDeliveryPreference = js.native
  
  /**
    * New preferred email address for the subscriber. Specify an empty string to clear the current address.
    */
  var preferredEmailAddress: String = js.native
}
object NotificationSubscriberUpdateParameters {
  
  @scala.inline
  def apply(deliveryPreference: NotificationSubscriberDeliveryPreference, preferredEmailAddress: String): NotificationSubscriberUpdateParameters = {
    val __obj = js.Dynamic.literal(deliveryPreference = deliveryPreference.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriberUpdateParameters]
  }
  
  @scala.inline
  implicit class NotificationSubscriberUpdateParametersMutableBuilder[Self <: NotificationSubscriberUpdateParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryPreference(value: NotificationSubscriberDeliveryPreference): Self = StObject.set(x, "deliveryPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredEmailAddress(value: String): Self = StObject.set(x, "preferredEmailAddress", value.asInstanceOf[js.Any])
  }
}
