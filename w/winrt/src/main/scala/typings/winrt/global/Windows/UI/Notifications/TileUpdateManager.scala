package typings.winrt.global.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.UI.Notifications.TileUpdateManager")
@js.native
class TileUpdateManager ()
  extends typings.winrt.Windows.UI.Notifications.TileUpdateManager
/* static members */
@JSGlobal("Windows.UI.Notifications.TileUpdateManager")
@js.native
object TileUpdateManager extends js.Object {
  
  def createTileUpdaterForApplication(): typings.winrt.Windows.UI.Notifications.TileUpdater = js.native
  def createTileUpdaterForApplication(applicationId: String): typings.winrt.Windows.UI.Notifications.TileUpdater = js.native
  
  def createTileUpdaterForSecondaryTile(tileId: String): typings.winrt.Windows.UI.Notifications.TileUpdater = js.native
  
  def getTemplateContent(`type`: typings.winrt.Windows.UI.Notifications.TileTemplateType): XmlDocument = js.native
}
