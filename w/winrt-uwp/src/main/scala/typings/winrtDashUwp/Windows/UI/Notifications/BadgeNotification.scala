package typings.winrtDashUwp.Windows.UI.Notifications

import typings.std.Date
import typings.winrtDashUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the content, associated metadata, and expiration time of an update to a tile's badge overlay. A badge can display a number from 1 to 99 or a status glyph. */
@JSGlobal("Windows.UI.Notifications.BadgeNotification")
@js.native
class BadgeNotification protected () extends js.Object {
  /**
    * Creates and initializes a new instance of the BadgeNotification .
    * @param content The XML content that defines the badge update.
    */
  def this(content: XmlDocument) = this()
  /** Gets the XML that defines the value or glyph used as the tile's badge. */
  var content: XmlDocument = js.native
  /** Gets or sets the time that Windows will remove the badge from the tile. By default, local badge notifications do not expire and push, periodic, and scheduled badge notifications expire after three days. It is a best practice to explicitly set an expiration time to avoid stale content. */
  var expirationTime: Date = js.native
}

