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
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledTileNotification]
  }
}

