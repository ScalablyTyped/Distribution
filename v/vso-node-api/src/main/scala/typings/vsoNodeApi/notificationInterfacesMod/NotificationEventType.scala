package typings.vsoNodeApi.notificationInterfacesMod

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
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], customSubscriptionsAllowed = customSubscriptionsAllowed.asInstanceOf[js.Any], eventPublisher = eventPublisher.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasInitiator = hasInitiator.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationEventType]
  }
}

