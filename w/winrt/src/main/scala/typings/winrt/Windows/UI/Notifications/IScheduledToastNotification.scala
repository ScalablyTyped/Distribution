package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledToastNotification extends StObject {
  
  var content: XmlDocument = js.native
  
  var deliveryTime: Date = js.native
  
  var id: String = js.native
  
  var maximumSnoozeCount: Double = js.native
  
  var snoozeInterval: Double = js.native
}
object IScheduledToastNotification {
  
  @scala.inline
  def apply(
    content: XmlDocument,
    deliveryTime: Date,
    id: String,
    maximumSnoozeCount: Double,
    snoozeInterval: Double
  ): IScheduledToastNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maximumSnoozeCount = maximumSnoozeCount.asInstanceOf[js.Any], snoozeInterval = snoozeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledToastNotification]
  }
  
  @scala.inline
  implicit class IScheduledToastNotificationMutableBuilder[Self <: IScheduledToastNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTime(value: Date): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSnoozeCount(value: Double): Self = StObject.set(x, "maximumSnoozeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnoozeInterval(value: Double): Self = StObject.set(x, "snoozeInterval", value.asInstanceOf[js.Any])
  }
}
