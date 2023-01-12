package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScheduledTileNotificationFactory extends StObject {
  
  def createScheduledTileNotification(content: XmlDocument, deliveryTime: js.Date): ScheduledTileNotification
}
object IScheduledTileNotificationFactory {
  
  inline def apply(createScheduledTileNotification: (XmlDocument, js.Date) => ScheduledTileNotification): IScheduledTileNotificationFactory = {
    val __obj = js.Dynamic.literal(createScheduledTileNotification = js.Any.fromFunction2(createScheduledTileNotification))
    __obj.asInstanceOf[IScheduledTileNotificationFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IScheduledTileNotificationFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateScheduledTileNotification(value: (XmlDocument, js.Date) => ScheduledTileNotification): Self = StObject.set(x, "createScheduledTileNotification", js.Any.fromFunction2(value))
  }
}
