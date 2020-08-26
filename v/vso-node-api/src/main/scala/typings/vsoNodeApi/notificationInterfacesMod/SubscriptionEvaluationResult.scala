package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionEvaluationResult extends js.Object {
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
  implicit class SubscriptionEvaluationResultOps[Self <: SubscriptionEvaluationResult] (val x: Self) extends AnyVal {
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
    def setEvaluationJobStatus(value: EvaluationOperationStatus): Self = this.set("evaluationJobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents(value: EventsEvaluationResult): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifications(value: NotificationsEvaluationResult): Self = this.set("notifications", value.asInstanceOf[js.Any])
  }
  
}

