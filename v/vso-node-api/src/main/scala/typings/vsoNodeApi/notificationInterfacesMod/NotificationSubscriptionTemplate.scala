package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationSubscriptionTemplate extends js.Object {
  
  var description: String = js.native
  
  var filter: ISubscriptionFilter = js.native
  
  var id: String = js.native
  
  var notificationEventInformation: NotificationEventType = js.native
  
  var `type`: SubscriptionTemplateType = js.native
}
object NotificationSubscriptionTemplate {
  
  @scala.inline
  def apply(
    description: String,
    filter: ISubscriptionFilter,
    id: String,
    notificationEventInformation: NotificationEventType,
    `type`: SubscriptionTemplateType
  ): NotificationSubscriptionTemplate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], notificationEventInformation = notificationEventInformation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriptionTemplate]
  }
  
  @scala.inline
  implicit class NotificationSubscriptionTemplateOps[Self <: NotificationSubscriptionTemplate] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: ISubscriptionFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEventInformation(value: NotificationEventType): Self = this.set("notificationEventInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SubscriptionTemplateType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
