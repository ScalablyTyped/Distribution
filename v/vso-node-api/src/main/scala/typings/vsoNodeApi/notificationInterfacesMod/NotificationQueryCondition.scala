package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationQueryCondition extends StObject {
  
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
  implicit class NotificationQueryConditionMutableBuilder[Self <: NotificationQueryCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventInitiator(value: String): Self = StObject.set(x, "eventInitiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriber(value: String): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
  }
}
