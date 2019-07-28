package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITileNotificationFactory extends js.Object {
  def createTileNotification(content: XmlDocument): TileNotification
}

object ITileNotificationFactory {
  @scala.inline
  def apply(createTileNotification: XmlDocument => TileNotification): ITileNotificationFactory = {
    val __obj = js.Dynamic.literal(createTileNotification = js.Any.fromFunction1(createTileNotification))
  
    __obj.asInstanceOf[ITileNotificationFactory]
  }
}

