package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationSubscriptionTemplate extends StObject {
  
  var description: String
  
  var filter: ISubscriptionFilter
  
  var id: String
  
  var notificationEventInformation: NotificationEventType
  
  var `type`: SubscriptionTemplateType
}
object NotificationSubscriptionTemplate {
  
  inline def apply(
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
  
  extension [Self <: NotificationSubscriptionTemplate](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: ISubscriptionFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNotificationEventInformation(value: NotificationEventType): Self = StObject.set(x, "notificationEventInformation", value.asInstanceOf[js.Any])
    
    inline def setType(value: SubscriptionTemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
