package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToastNotification extends StObject {
  
  var content: XmlDocument
  
  var expirationTime: js.Date
  
  var onactivated: Any
  
  var ondismissed: Any
  
  var onfailed: Any
}
object IToastNotification {
  
  inline def apply(content: XmlDocument, expirationTime: js.Date, onactivated: Any, ondismissed: Any, onfailed: Any): IToastNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any], ondismissed = ondismissed.asInstanceOf[js.Any], onfailed = onfailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IToastNotification] (val x: Self) extends AnyVal {
    
    inline def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: js.Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setOnactivated(value: Any): Self = StObject.set(x, "onactivated", value.asInstanceOf[js.Any])
    
    inline def setOndismissed(value: Any): Self = StObject.set(x, "ondismissed", value.asInstanceOf[js.Any])
    
    inline def setOnfailed(value: Any): Self = StObject.set(x, "onfailed", value.asInstanceOf[js.Any])
  }
}
