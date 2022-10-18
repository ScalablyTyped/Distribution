package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEventType extends StObject {
  
  var category: NotificationEventTypeCategory
  
  /**
    * Gets or sets the color representing this event type. Example: rgb(128,245,211) or #fafafa
    */
  var color: String
  
  var customSubscriptionsAllowed: Boolean
  
  var eventPublisher: NotificationEventPublisher
  
  var fields: StringDictionary[NotificationEventField]
  
  var hasInitiator: Boolean
  
  /**
    * Gets or sets the icon representing this event type. Can be a URL or a CSS class. Example: css://some-css-class
    */
  var icon: String
  
  /**
    * Gets or sets the unique identifier of this event definition.
    */
  var id: String
  
  /**
    * Gets or sets the name of this event definition.
    */
  var name: String
  
  var roles: js.Array[NotificationEventRole]
  
  /**
    * Gets or sets the scopes that this event type supports
    */
  var supportedScopes: js.Array[String]
  
  /**
    * Gets or sets the rest end point to get this event type details (fields, fields types)
    */
  var url: String
}
object NotificationEventType {
  
  inline def apply(
    category: NotificationEventTypeCategory,
    color: String,
    customSubscriptionsAllowed: Boolean,
    eventPublisher: NotificationEventPublisher,
    fields: StringDictionary[NotificationEventField],
    hasInitiator: Boolean,
    icon: String,
    id: String,
    name: String,
    roles: js.Array[NotificationEventRole],
    supportedScopes: js.Array[String],
    url: String
  ): NotificationEventType = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], customSubscriptionsAllowed = customSubscriptionsAllowed.asInstanceOf[js.Any], eventPublisher = eventPublisher.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasInitiator = hasInitiator.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventType]
  }
  
  extension [Self <: NotificationEventType](x: Self) {
    
    inline def setCategory(value: NotificationEventTypeCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCustomSubscriptionsAllowed(value: Boolean): Self = StObject.set(x, "customSubscriptionsAllowed", value.asInstanceOf[js.Any])
    
    inline def setEventPublisher(value: NotificationEventPublisher): Self = StObject.set(x, "eventPublisher", value.asInstanceOf[js.Any])
    
    inline def setFields(value: StringDictionary[NotificationEventField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setHasInitiator(value: Boolean): Self = StObject.set(x, "hasInitiator", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[NotificationEventRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: NotificationEventRole*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setSupportedScopes(value: js.Array[String]): Self = StObject.set(x, "supportedScopes", value.asInstanceOf[js.Any])
    
    inline def setSupportedScopesVarargs(value: String*): Self = StObject.set(x, "supportedScopes", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
