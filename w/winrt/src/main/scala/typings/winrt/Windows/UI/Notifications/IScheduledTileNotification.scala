package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScheduledTileNotification extends StObject {
  
  var content: XmlDocument
  
  var deliveryTime: Date
  
  var expirationTime: Date
  
  var id: String
  
  var tag: String
}
object IScheduledTileNotification {
  
  inline def apply(content: XmlDocument, deliveryTime: Date, expirationTime: Date, id: String, tag: String): IScheduledTileNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledTileNotification]
  }
  
  extension [Self <: IScheduledTileNotification](x: Self) {
    
    inline def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTime(value: Date): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
