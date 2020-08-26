package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileNotification extends ITileNotification

object TileNotification {
  @scala.inline
  def apply(content: XmlDocument, expirationTime: Date, tag: String): TileNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileNotification]
  }
}

