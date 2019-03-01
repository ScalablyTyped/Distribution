package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsEvaluationResult extends js.Object {
  /**
    * Count of generated notifications
    */
  var count: scala.Double
}

object NotificationsEvaluationResult {
  @scala.inline
  def apply(count: scala.Double): NotificationsEvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.asInstanceOf[NotificationsEvaluationResult]
  }
}

