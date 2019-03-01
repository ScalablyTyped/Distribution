package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationStatisticsQueryConditions extends js.Object {
  var endDate: stdLib.Date
  var hitCountMinimum: scala.Double
  var path: java.lang.String
  var startDate: stdLib.Date
  var `type`: NotificationStatisticType
  var user: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
}

object NotificationStatisticsQueryConditions {
  @scala.inline
  def apply(
    endDate: stdLib.Date,
    hitCountMinimum: scala.Double,
    path: java.lang.String,
    startDate: stdLib.Date,
    `type`: NotificationStatisticType,
    user: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  ): NotificationStatisticsQueryConditions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("endDate")(endDate)
    __obj.updateDynamic("hitCountMinimum")(hitCountMinimum)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("startDate")(startDate)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[NotificationStatisticsQueryConditions]
  }
}

