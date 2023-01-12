package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToastNotificationFactory extends StObject {
  
  def createToastNotification(content: XmlDocument): ToastNotification
}
object IToastNotificationFactory {
  
  inline def apply(createToastNotification: XmlDocument => ToastNotification): IToastNotificationFactory = {
    val __obj = js.Dynamic.literal(createToastNotification = js.Any.fromFunction1(createToastNotification))
    __obj.asInstanceOf[IToastNotificationFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IToastNotificationFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateToastNotification(value: XmlDocument => ToastNotification): Self = StObject.set(x, "createToastNotification", js.Any.fromFunction1(value))
  }
}
