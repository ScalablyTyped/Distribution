package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledTileNotificationFactory extends js.Object {
  
  def createScheduledTileNotification(content: XmlDocument, deliveryTime: Date): ScheduledTileNotification = js.native
}
object IScheduledTileNotificationFactory {
  
  @scala.inline
  def apply(createScheduledTileNotification: (XmlDocument, Date) => ScheduledTileNotification): IScheduledTileNotificationFactory = {
    val __obj = js.Dynamic.literal(createScheduledTileNotification = js.Any.fromFunction2(createScheduledTileNotification))
    __obj.asInstanceOf[IScheduledTileNotificationFactory]
  }
  
  @scala.inline
  implicit class IScheduledTileNotificationFactoryOps[Self <: IScheduledTileNotificationFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateScheduledTileNotification(value: (XmlDocument, Date) => ScheduledTileNotification): Self = this.set("createScheduledTileNotification", js.Any.fromFunction2(value))
  }
}
