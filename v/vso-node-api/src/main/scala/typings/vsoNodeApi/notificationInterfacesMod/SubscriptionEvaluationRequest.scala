package typings.vsoNodeApi.notificationInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionEvaluationRequest extends StObject {
  
  /**
    * The min created date for the events used for matching in UTC. Use all events created since this date
    */
  var minEventsCreatedDate: Date = js.native
  
  /**
    * User or group that will receive notifications for events matching the subscription's filter criteria. If not specified, defaults to the calling user.
    */
  var subscriptionCreateParameters: NotificationSubscriptionCreateParameters = js.native
}
object SubscriptionEvaluationRequest {
  
  @scala.inline
  def apply(minEventsCreatedDate: Date, subscriptionCreateParameters: NotificationSubscriptionCreateParameters): SubscriptionEvaluationRequest = {
    val __obj = js.Dynamic.literal(minEventsCreatedDate = minEventsCreatedDate.asInstanceOf[js.Any], subscriptionCreateParameters = subscriptionCreateParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionEvaluationRequest]
  }
  
  @scala.inline
  implicit class SubscriptionEvaluationRequestMutableBuilder[Self <: SubscriptionEvaluationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinEventsCreatedDate(value: Date): Self = StObject.set(x, "minEventsCreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionCreateParameters(value: NotificationSubscriptionCreateParameters): Self = StObject.set(x, "subscriptionCreateParameters", value.asInstanceOf[js.Any])
  }
}
