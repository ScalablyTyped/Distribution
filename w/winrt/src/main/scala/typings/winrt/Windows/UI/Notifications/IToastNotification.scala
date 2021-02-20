package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastNotification extends StObject {
  
  var content: XmlDocument = js.native
  
  var expirationTime: Date = js.native
  
  var onactivated: js.Any = js.native
  
  var ondismissed: js.Any = js.native
  
  var onfailed: js.Any = js.native
}
object IToastNotification {
  
  @scala.inline
  def apply(
    content: XmlDocument,
    expirationTime: Date,
    onactivated: js.Any,
    ondismissed: js.Any,
    onfailed: js.Any
  ): IToastNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any], ondismissed = ondismissed.asInstanceOf[js.Any], onfailed = onfailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastNotification]
  }
  
  @scala.inline
  implicit class IToastNotificationMutableBuilder[Self <: IToastNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnactivated(value: js.Any): Self = StObject.set(x, "onactivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndismissed(value: js.Any): Self = StObject.set(x, "ondismissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfailed(value: js.Any): Self = StObject.set(x, "onfailed", value.asInstanceOf[js.Any])
  }
}
