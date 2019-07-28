package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventType extends js.Object {
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
    val __obj = js.Dynamic.literal(category = category, color = color, customSubscriptionsAllowed = customSubscriptionsAllowed, eventPublisher = eventPublisher, fields = fields, hasInitiator = hasInitiator, icon = icon, id = id, name = name, roles = roles, supportedScopes = supportedScopes, url = url)
  
    __obj.asInstanceOf[NotificationEventType]
  }
}

