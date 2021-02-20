package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITileNotificationFactory extends StObject {
  
  def createTileNotification(content: XmlDocument): TileNotification = js.native
}
object ITileNotificationFactory {
  
  @scala.inline
  def apply(createTileNotification: XmlDocument => TileNotification): ITileNotificationFactory = {
    val __obj = js.Dynamic.literal(createTileNotification = js.Any.fromFunction1(createTileNotification))
    __obj.asInstanceOf[ITileNotificationFactory]
  }
  
  @scala.inline
  implicit class ITileNotificationFactoryMutableBuilder[Self <: ITileNotificationFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTileNotification(value: XmlDocument => TileNotification): Self = StObject.set(x, "createTileNotification", js.Any.fromFunction1(value))
  }
}
