package typings.winrtUwp.Windows.UI.Notifications

import typings.std.Date
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an update to a tile, including its visuals, identification tag, and expiration time. */
trait TileNotification extends js.Object {
  /** Gets the XML description of the notification content, which you can then manipulate to alter the notification. */
  var content: XmlDocument
  /** Gets or sets the time that Windows will remove the notification from the tile. By default, a tile update does not expire. It is a best practice to explicitly set an expiration time to avoid stale content. */
  var expirationTime: Date
  /** Gets or sets a string that Windows can use to prevent duplicate notification content from appearing in the queue. */
  var tag: String
}

object TileNotification {
  @scala.inline
  def apply(content: XmlDocument, expirationTime: Date, tag: String): TileNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileNotification]
  }
}

