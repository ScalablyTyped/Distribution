package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates TileUpdater objects used to change and update Start menu tiles. This class also provides access to the XML content of the system-provided tile templates so that you can customize that content for use in updating your tiles. */
@JSGlobal("Windows.UI.Notifications.TileUpdateManager")
@js.native
abstract class TileUpdateManager () extends js.Object

/* static members */
@JSGlobal("Windows.UI.Notifications.TileUpdateManager")
@js.native
object TileUpdateManager extends js.Object {
  /**
    * Creates and initializes a new instance of the TileUpdater , which lets you change the appearance of the calling app's tile.
    * @return The object you will use to send changes to the app's tile.
    */
  def createTileUpdaterForApplication(): winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.TileUpdater = js.native
  /**
    * Creates and initializes a new instance of the TileUpdater for a tile that belongs to another app in the same package as the calling app. The TileUpdater lets a developer change the appearance of that tile.
    * @param applicationId The Package Relative Application ID (PRAID) of the tile.
    * @return The object you will use to send changes to the tile identified by applicationId.
    */
  def createTileUpdaterForApplication(applicationId: java.lang.String): winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.TileUpdater = js.native
  /**
    * Creates and initializes a new instance of the TileUpdater , which enables you to change the appearance of a secondary tile . The tile can belong to the calling app or any other app in the same package.
    * @param tileId A unique ID for the tile.
    * @return The object you will use to send updates to the tile identified by tileID.
    */
  def createTileUpdaterForSecondaryTile(tileId: java.lang.String): winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.TileUpdater = js.native
  /**
    * Gets the XML content of one of the predefined tile templates so that you can customize it for a tile update.
    * @param type The name of the template.
    * @return The object that contains the XML.
    */
  def getTemplateContent(`type`: winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.TileTemplateType): winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

