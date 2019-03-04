package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationStatistic extends js.Object {
  var date: stdLib.Date
  var hitCount: scala.Double
  var path: java.lang.String
  var `type`: NotificationStatisticType
  var user: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
}

object NotificationStatistic {
  @scala.inline
  def apply(
    date: stdLib.Date,
    hitCount: scala.Double,
    path: java.lang.String,
    `type`: NotificationStatisticType,
    user: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  ): NotificationStatistic = {
    val __obj = js.Dynamic.literal(date = date, hitCount = hitCount, path = path, user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NotificationStatistic]
  }
}

