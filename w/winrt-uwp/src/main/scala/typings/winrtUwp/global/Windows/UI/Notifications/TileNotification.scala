package typings.winrtUwp.global.Windows.UI.Notifications

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines an update to a tile, including its visuals, identification tag, and expiration time. */
@JSGlobal("Windows.UI.Notifications.TileNotification")
@js.native
class TileNotification protected ()
  extends typings.winrtUwp.Windows.UI.Notifications.TileNotification {
  /**
    * Creates and initializes a new instance of the TileNotification object for use with a TileUpdater .
    * @param content The object that provides the content for the tile notification.
    */
  def this(content: XmlDocument) = this()
}
