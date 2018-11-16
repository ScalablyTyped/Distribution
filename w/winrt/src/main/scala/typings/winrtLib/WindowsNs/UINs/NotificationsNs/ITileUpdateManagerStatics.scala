package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITileUpdateManagerStatics extends js.Object {
  def createTileUpdaterForApplication(): TileUpdater = js.native
  def createTileUpdaterForApplication(applicationId: java.lang.String): TileUpdater = js.native
  def createTileUpdaterForSecondaryTile(tileId: java.lang.String): TileUpdater = js.native
  def getTemplateContent(`type`: TileTemplateType): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

