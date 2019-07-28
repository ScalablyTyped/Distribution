package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(endDate = endDate, hitCountMinimum = hitCountMinimum, path = path, startDate = startDate, user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NotificationStatisticsQueryConditions]
  }
}

