package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledTileNotificationFactory extends js.Object {
  def createScheduledTileNotification(content: XmlDocument, deliveryTime: Date): ScheduledTileNotification
}

object IScheduledTileNotificationFactory {
  @scala.inline
  def apply(createScheduledTileNotification: (XmlDocument, Date) => ScheduledTileNotification): IScheduledTileNotificationFactory = {
    val __obj = js.Dynamic.literal(createScheduledTileNotification = js.Any.fromFunction2(createScheduledTileNotification))
  
    __obj.asInstanceOf[IScheduledTileNotificationFactory]
  }
}

