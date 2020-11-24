package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEventType extends js.Object {
  
  var category: NotificationEventTypeCategory = js.native
  
  /**
    * Gets or sets the color representing this event type. Example: rgb(128,245,211) or #fafafa
    */
  var color: String = js.native
  
  var customSubscriptionsAllowed: Boolean = js.native
  
  var eventPublisher: NotificationEventPublisher = js.native
  
  var fields: StringDictionary[NotificationEventField] = js.native
  
  var hasInitiator: Boolean = js.native
  
  /**
    * Gets or sets the icon representing this event type. Can be a URL or a CSS class. Example: css://some-css-class
    */
  var icon: String = js.native
  
  /**
    * Gets or sets the unique identifier of this event definition.
    */
  var id: String = js.native
  
  /**
    * Gets or sets the name of this event definition.
    */
  var name: String = js.native
  
  var roles: js.Array[NotificationEventRole] = js.native
  
  /**
    * Gets or sets the scopes that this event type supports
    */
  var supportedScopes: js.Array[String] = js.native
  
  /**
    * Gets or sets the rest end point to get this event type details (fields, fields types)
    */
  var url: String = js.native
}
object NotificationEventType {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class NotificationEventTypeOps[Self <: NotificationEventType] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: NotificationEventTypeCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSubscriptionsAllowed(value: Boolean): Self = this.set("customSubscriptionsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPublisher(value: NotificationEventPublisher): Self = this.set("eventPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: StringDictionary[NotificationEventField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasInitiator(value: Boolean): Self = this.set("hasInitiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: NotificationEventRole*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[NotificationEventRole]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopesVarargs(value: String*): Self = this.set("supportedScopes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedScopes(value: js.Array[String]): Self = this.set("supportedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
