package typings.vsoNodeApi.notificationInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationStatisticsQueryConditions extends js.Object {
  var endDate: Date
  var hitCountMinimum: Double
  var path: String
  var startDate: Date
  var `type`: NotificationStatisticType
  var user: IdentityRef
}

object NotificationStatisticsQueryConditions {
  @scala.inline
  def apply(
    endDate: Date,
    hitCountMinimum: Double,
    path: String,
    startDate: Date,
    `type`: NotificationStatisticType,
    user: IdentityRef
  ): NotificationStatisticsQueryConditions = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], hitCountMinimum = hitCountMinimum.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationStatisticsQueryConditions]
  }
}

