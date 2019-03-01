package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledTileNotificationFactory extends js.Object {
  def createScheduledTileNotification(content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, deliveryTime: stdLib.Date): ScheduledTileNotification
}

object IScheduledTileNotificationFactory {
  @scala.inline
  def apply(
    createScheduledTileNotification: js.Function2[
      winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, 
      stdLib.Date, 
      ScheduledTileNotification
    ]
  ): IScheduledTileNotificationFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createScheduledTileNotification")(createScheduledTileNotification)
    __obj.asInstanceOf[IScheduledTileNotificationFactory]
  }
}

