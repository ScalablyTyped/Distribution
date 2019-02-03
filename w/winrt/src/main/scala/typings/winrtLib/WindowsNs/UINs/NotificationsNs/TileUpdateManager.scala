package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.TileUpdateManager")
@js.native
class TileUpdateManager () extends js.Object

/* static members */
@JSGlobal("Windows.UI.Notifications.TileUpdateManager")
@js.native
object TileUpdateManager extends js.Object {
  def createTileUpdaterForApplication(): winrtLib.WindowsNs.UINs.NotificationsNs.TileUpdater = js.native
  def createTileUpdaterForApplication(applicationId: java.lang.String): winrtLib.WindowsNs.UINs.NotificationsNs.TileUpdater = js.native
  def createTileUpdaterForSecondaryTile(tileId: java.lang.String): winrtLib.WindowsNs.UINs.NotificationsNs.TileUpdater = js.native
  def getTemplateContent(`type`: winrtLib.WindowsNs.UINs.NotificationsNs.TileTemplateType): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

