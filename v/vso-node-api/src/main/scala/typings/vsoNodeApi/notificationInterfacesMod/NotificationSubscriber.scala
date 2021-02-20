package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationSubscriber extends StObject {
  
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
  implicit class NotificationSubscriberMutableBuilder[Self <: NotificationSubscriber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryPreference(value: NotificationSubscriberDeliveryPreference): Self = StObject.set(x, "deliveryPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: SubscriberFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredEmailAddress(value: String): Self = StObject.set(x, "preferredEmailAddress", value.asInstanceOf[js.Any])
  }
}
