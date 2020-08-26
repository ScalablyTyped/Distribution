package typings.vsoNodeApi.notificationInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationStatistic extends js.Object {
  var date: Date = js.native
  var hitCount: Double = js.native
  var path: String = js.native
  var `type`: NotificationStatisticType = js.native
  var user: IdentityRef = js.native
}

object NotificationStatistic {
  @scala.inline
  def apply(date: Date, hitCount: Double, path: String, `type`: NotificationStatisticType, user: IdentityRef): NotificationStatistic = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hitCount = hitCount.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationStatistic]
  }
  @scala.inline
  implicit class NotificationStatisticOps[Self <: NotificationStatistic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setHitCount(value: Double): Self = this.set("hitCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NotificationStatisticType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: IdentityRef): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

