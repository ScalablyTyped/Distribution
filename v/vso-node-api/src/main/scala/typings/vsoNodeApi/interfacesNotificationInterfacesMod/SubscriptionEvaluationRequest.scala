package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionEvaluationRequest extends StObject {
  
  /**
    * The min created date for the events used for matching in UTC. Use all events created since this date
    */
  var minEventsCreatedDate: js.Date
  
  /**
    * User or group that will receive notifications for events matching the subscription's filter criteria. If not specified, defaults to the calling user.
    */
  var subscriptionCreateParameters: NotificationSubscriptionCreateParameters
}
object SubscriptionEvaluationRequest {
  
  inline def apply(
    minEventsCreatedDate: js.Date,
    subscriptionCreateParameters: NotificationSubscriptionCreateParameters
  ): SubscriptionEvaluationRequest = {
    val __obj = js.Dynamic.literal(minEventsCreatedDate = minEventsCreatedDate.asInstanceOf[js.Any], subscriptionCreateParameters = subscriptionCreateParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionEvaluationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionEvaluationRequest] (val x: Self) extends AnyVal {
    
    inline def setMinEventsCreatedDate(value: js.Date): Self = StObject.set(x, "minEventsCreatedDate", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionCreateParameters(value: NotificationSubscriptionCreateParameters): Self = StObject.set(x, "subscriptionCreateParameters", value.asInstanceOf[js.Any])
  }
}
