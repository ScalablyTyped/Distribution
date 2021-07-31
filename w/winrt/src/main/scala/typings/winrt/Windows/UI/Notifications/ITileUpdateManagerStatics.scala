package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITileUpdateManagerStatics extends StObject {
  
  def createTileUpdaterForApplication(): TileUpdater = js.native
  def createTileUpdaterForApplication(applicationId: String): TileUpdater = js.native
  
  def createTileUpdaterForSecondaryTile(tileId: String): TileUpdater = js.native
  
  def getTemplateContent(`type`: TileTemplateType): XmlDocument = js.native
}
