package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsEvaluationResult extends js.Object {
  /**
    * Count of generated notifications
    */
  var count: Double
}

object NotificationsEvaluationResult {
  @scala.inline
  def apply(count: Double): NotificationsEvaluationResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsEvaluationResult]
  }
}

