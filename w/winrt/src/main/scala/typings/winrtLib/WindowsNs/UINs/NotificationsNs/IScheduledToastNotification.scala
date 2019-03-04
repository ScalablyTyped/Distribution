package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledToastNotification extends js.Object {
  var content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
  var deliveryTime: stdLib.Date
  var id: java.lang.String
  var maximumSnoozeCount: scala.Double
  var snoozeInterval: scala.Double
}

object IScheduledToastNotification {
  @scala.inline
  def apply(
    content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument,
    deliveryTime: stdLib.Date,
    id: java.lang.String,
    maximumSnoozeCount: scala.Double,
    snoozeInterval: scala.Double
  ): IScheduledToastNotification = {
    val __obj = js.Dynamic.literal(content = content, deliveryTime = deliveryTime, id = id, maximumSnoozeCount = maximumSnoozeCount, snoozeInterval = snoozeInterval)
  
    __obj.asInstanceOf[IScheduledToastNotification]
  }
}

