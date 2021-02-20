package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBadgeNotificationFactory extends StObject {
  
  def createBadgeNotification(content: XmlDocument): BadgeNotification = js.native
}
object IBadgeNotificationFactory {
  
  @scala.inline
  def apply(createBadgeNotification: XmlDocument => BadgeNotification): IBadgeNotificationFactory = {
    val __obj = js.Dynamic.literal(createBadgeNotification = js.Any.fromFunction1(createBadgeNotification))
    __obj.asInstanceOf[IBadgeNotificationFactory]
  }
  
  @scala.inline
  implicit class IBadgeNotificationFactoryMutableBuilder[Self <: IBadgeNotificationFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateBadgeNotification(value: XmlDocument => BadgeNotification): Self = StObject.set(x, "createBadgeNotification", js.Any.fromFunction1(value))
  }
}
