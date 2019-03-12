package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITileNotificationFactory extends js.Object {
  def createTileNotification(content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument): TileNotification
}

object ITileNotificationFactory {
  @scala.inline
  def apply(createTileNotification: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument => TileNotification): ITileNotificationFactory = {
    val __obj = js.Dynamic.literal(createTileNotification = js.Any.fromFunction1(createTileNotification))
  
    __obj.asInstanceOf[ITileNotificationFactory]
  }
}

