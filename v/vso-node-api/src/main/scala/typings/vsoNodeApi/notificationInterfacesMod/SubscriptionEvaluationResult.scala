package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionEvaluationResult extends StObject {
  
  /**
    * Subscription evaluation job status
    */
  var evaluationJobStatus: EvaluationOperationStatus = js.native
  
  /**
    * Subscription evaluation events results.
    */
  var events: EventsEvaluationResult = js.native
  
  /**
    * The requestId which is the subscription evaluation jobId
    */
  var id: String = js.native
  
  /**
    * Subscription evaluation  notification results.
    */
  var notifications: NotificationsEvaluationResult = js.native
}
object SubscriptionEvaluationResult {
  
  @scala.inline
  def apply(
    evaluationJobStatus: EvaluationOperationStatus,
    events: EventsEvaluationResult,
    id: String,
    notifications: NotificationsEvaluationResult
  ): SubscriptionEvaluationResult = {
    val __obj = js.Dynamic.literal(evaluationJobStatus = evaluationJobStatus.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionEvaluationResult]
  }
  
  @scala.inline
  implicit class SubscriptionEvaluationResultMutableBuilder[Self <: SubscriptionEvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationJobStatus(value: EvaluationOperationStatus): Self = StObject.set(x, "evaluationJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: EventsEvaluationResult): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifications(value: NotificationsEvaluationResult): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
  }
}
