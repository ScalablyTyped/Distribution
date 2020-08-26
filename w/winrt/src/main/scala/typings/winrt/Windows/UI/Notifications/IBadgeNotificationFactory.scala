package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBadgeNotificationFactory extends js.Object {
  def createBadgeNotification(content: XmlDocument): BadgeNotification = js.native
}

object IBadgeNotificationFactory {
  @scala.inline
  def apply(createBadgeNotification: XmlDocument => BadgeNotification): IBadgeNotificationFactory = {
    val __obj = js.Dynamic.literal(createBadgeNotification = js.Any.fromFunction1(createBadgeNotification))
    __obj.asInstanceOf[IBadgeNotificationFactory]
  }
  @scala.inline
  implicit class IBadgeNotificationFactoryOps[Self <: IBadgeNotificationFactory] (val x: Self) extends AnyVal {
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
    def setCreateBadgeNotification(value: XmlDocument => BadgeNotification): Self = this.set("createBadgeNotification", js.Any.fromFunction1(value))
  }
  
}

