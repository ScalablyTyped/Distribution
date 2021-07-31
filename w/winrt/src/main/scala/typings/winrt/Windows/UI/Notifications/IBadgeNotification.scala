package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBadgeNotification extends StObject {
  
  var content: XmlDocument
  
  var expirationTime: Date
}
object IBadgeNotification {
  
  @scala.inline
  def apply(content: XmlDocument, expirationTime: Date): IBadgeNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBadgeNotification]
  }
  
  @scala.inline
  implicit class IBadgeNotificationMutableBuilder[Self <: IBadgeNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
  }
}
