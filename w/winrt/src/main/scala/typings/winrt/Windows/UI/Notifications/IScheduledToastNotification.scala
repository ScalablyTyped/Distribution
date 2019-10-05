package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledToastNotification extends js.Object {
  var content: XmlDocument
  var deliveryTime: Date
  var id: String
  var maximumSnoozeCount: Double
  var snoozeInterval: Double
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
    val __obj = js.Dynamic.literal(content = content, deliveryTime = deliveryTime, id = id, maximumSnoozeCount = maximumSnoozeCount, snoozeInterval = snoozeInterval)
  
    __obj.asInstanceOf[IScheduledToastNotification]
  }
}

