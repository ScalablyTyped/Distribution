package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBadgeNotification extends StObject {
  
  var content: XmlDocument
  
  var expirationTime: js.Date
}
object IBadgeNotification {
  
  inline def apply(content: XmlDocument, expirationTime: js.Date): IBadgeNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBadgeNotification]
  }
  
  extension [Self <: IBadgeNotification](x: Self) {
    
    inline def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: js.Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
  }
}
