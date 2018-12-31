package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an update to a tile, including its visuals, identification tag, and expiration time. */
@JSGlobal("Windows.UI.Notifications.TileNotification")
@js.native
class TileNotification protected () extends js.Object {
  /**
    * Creates and initializes a new instance of the TileNotification object for use with a TileUpdater .
    * @param content The object that provides the content for the tile notification.
    */
  def this(content: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument) = this()
  /** Gets the XML description of the notification content, which you can then manipulate to alter the notification. */
  var content: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /** Gets or sets the time that Windows will remove the notification from the tile. By default, a tile update does not expire. It is a best practice to explicitly set an expiration time to avoid stale content. */
  var expirationTime: stdLib.Date = js.native
  /** Gets or sets a string that Windows can use to prevent duplicate notification content from appearing in the queue. */
  var tag: java.lang.String = js.native
}

