package typings.winrtUwp.global.Windows.UI.Notifications

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the content, associated metadata, and expiration time of an update to a tile's badge overlay. A badge can display a number from 1 to 99 or a status glyph. */
@JSGlobal("Windows.UI.Notifications.BadgeNotification")
@js.native
class BadgeNotification protected ()
  extends typings.winrtUwp.Windows.UI.Notifications.BadgeNotification {
  /**
    * Creates and initializes a new instance of the BadgeNotification .
    * @param content The XML content that defines the badge update.
    */
  def this(content: XmlDocument) = this()
}
