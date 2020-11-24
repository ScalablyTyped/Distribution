package typings.vsoNodeApi.notificationInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionEvaluationRequest extends js.Object {
  
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
  implicit class SubscriptionEvaluationRequestOps[Self <: SubscriptionEvaluationRequest] (val x: Self) extends AnyVal {
    
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
    def setMinEventsCreatedDate(value: Date): Self = this.set("minEventsCreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionCreateParameters(value: NotificationSubscriptionCreateParameters): Self = this.set("subscriptionCreateParameters", value.asInstanceOf[js.Any])
  }
}
