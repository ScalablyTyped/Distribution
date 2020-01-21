package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationStatisticsQuery extends js.Object {
  var conditions: js.Array[NotificationStatisticsQueryConditions]
}

object NotificationStatisticsQuery {
  @scala.inline
  def apply(conditions: js.Array[NotificationStatisticsQueryConditions]): NotificationStatisticsQuery = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationStatisticsQuery]
  }
}

