package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledTileNotification extends js.Object {
  var content: XmlDocument
  var deliveryTime: Date
  var expirationTime: Date
  var id: String
  var tag: String
}

object IScheduledTileNotification {
  @scala.inline
  def apply(content: XmlDocument, deliveryTime: Date, expirationTime: Date, id: String, tag: String): IScheduledTileNotification = {
    val __obj = js.Dynamic.literal(content = content, deliveryTime = deliveryTime, expirationTime = expirationTime, id = id, tag = tag)
  
    __obj.asInstanceOf[IScheduledTileNotification]
  }
}

