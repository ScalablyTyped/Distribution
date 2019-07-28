package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationStatisticsQuery extends js.Object {
  var conditions: js.Array[NotificationStatisticsQueryConditions]
}

object NotificationStatisticsQuery {
  @scala.inline
  def apply(conditions: js.Array[NotificationStatisticsQueryConditions]): NotificationStatisticsQuery = {
    val __obj = js.Dynamic.literal(conditions = conditions)
  
    __obj.asInstanceOf[NotificationStatisticsQuery]
  }
}

