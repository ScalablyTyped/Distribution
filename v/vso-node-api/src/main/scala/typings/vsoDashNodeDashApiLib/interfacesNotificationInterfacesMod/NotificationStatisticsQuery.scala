package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationStatisticsQuery extends js.Object {
  var conditions: js.Array[NotificationStatisticsQueryConditions]
}

object NotificationStatisticsQuery {
  @scala.inline
  def apply(conditions: js.Array[NotificationStatisticsQueryConditions]): NotificationStatisticsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conditions")(conditions)
    __obj.asInstanceOf[NotificationStatisticsQuery]
  }
}

