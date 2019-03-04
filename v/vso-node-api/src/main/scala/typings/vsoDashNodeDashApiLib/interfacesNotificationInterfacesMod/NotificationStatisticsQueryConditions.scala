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
    val __obj = js.Dynamic.literal(endDate = endDate, hitCountMinimum = hitCountMinimum, path = path, startDate = startDate, user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NotificationStatisticsQueryConditions]
  }
}

