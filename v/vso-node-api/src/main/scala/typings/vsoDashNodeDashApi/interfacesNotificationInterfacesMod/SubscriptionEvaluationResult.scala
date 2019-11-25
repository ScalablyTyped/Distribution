package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionEvaluationResult extends js.Object {
  /**
    * Subscription evaluation job status
    */
  var evaluationJobStatus: EvaluationOperationStatus
  /**
    * Subscription evaluation events results.
    */
  var events: EventsEvaluationResult
  /**
    * The requestId which is the subscription evaluation jobId
    */
  var id: String
  /**
    * Subscription evaluation  notification results.
    */
  var notifications: NotificationsEvaluationResult
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
}

