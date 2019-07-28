package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITileUpdateManagerStatics extends js.Object {
  def createTileUpdaterForApplication(): TileUpdater = js.native
  def createTileUpdaterForApplication(applicationId: String): TileUpdater = js.native
  def createTileUpdaterForSecondaryTile(tileId: String): TileUpdater = js.native
  def getTemplateContent(`type`: TileTemplateType): XmlDocument = js.native
}

