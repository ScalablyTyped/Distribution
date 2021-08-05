package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationSubscriberUpdateParameters extends StObject {
  
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
  
  inline def apply(deliveryPreference: NotificationSubscriberDeliveryPreference, preferredEmailAddress: String): NotificationSubscriberUpdateParameters = {
    val __obj = js.Dynamic.literal(deliveryPreference = deliveryPreference.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriberUpdateParameters]
  }
  
  extension [Self <: NotificationSubscriberUpdateParameters](x: Self) {
    
    inline def setDeliveryPreference(value: NotificationSubscriberDeliveryPreference): Self = StObject.set(x, "deliveryPreference", value.asInstanceOf[js.Any])
    
    inline def setPreferredEmailAddress(value: String): Self = StObject.set(x, "preferredEmailAddress", value.asInstanceOf[js.Any])
  }
}
