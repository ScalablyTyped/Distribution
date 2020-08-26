package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduledToastNotification extends js.Object {
  var content: XmlDocument = js.native
  var deliveryTime: Date = js.native
  var id: String = js.native
  var maximumSnoozeCount: Double = js.native
  var snoozeInterval: Double = js.native
}

object IScheduledToastNotification {
  @scala.inline
  def apply(
    content: XmlDocument,
    deliveryTime: Date,
    id: String,
    maximumSnoozeCount: Double,
    snoozeInterval: Double
  ): IScheduledToastNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maximumSnoozeCount = maximumSnoozeCount.asInstanceOf[js.Any], snoozeInterval = snoozeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledToastNotification]
  }
  @scala.inline
  implicit class IScheduledToastNotificationOps[Self <: IScheduledToastNotification] (val x: Self) extends AnyVal {
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
    def setContent(value: XmlDocument): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeliveryTime(value: Date): Self = this.set("deliveryTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumSnoozeCount(value: Double): Self = this.set("maximumSnoozeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnoozeInterval(value: Double): Self = this.set("snoozeInterval", value.asInstanceOf[js.Any])
  }
  
}

