package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventType extends js.Object {
  var category: NotificationEventTypeCategory
  /**
    * Gets or sets the color representing this event type. Example: rgb(128,245,211) or #fafafa
    */
  var color: java.lang.String
  var customSubscriptionsAllowed: scala.Boolean
  var eventPublisher: NotificationEventPublisher
  var fields: org.scalablytyped.runtime.StringDictionary[NotificationEventField]
  var hasInitiator: scala.Boolean
  /**
    * Gets or sets the icon representing this event type. Can be a URL or a CSS class. Example: css://some-css-class
    */
  var icon: java.lang.String
  /**
    * Gets or sets the unique identifier of this event definition.
    */
  var id: java.lang.String
  /**
    * Gets or sets the name of this event definition.
    */
  var name: java.lang.String
  var roles: js.Array[NotificationEventRole]
  /**
    * Gets or sets the scopes that this event type supports
    */
  var supportedScopes: js.Array[java.lang.String]
  /**
    * Gets or sets the rest end point to get this event type details (fields, fields types)
    */
  var url: java.lang.String
}

object NotificationEventType {
  @scala.inline
  def apply(
    category: NotificationEventTypeCategory,
    color: java.lang.String,
    customSubscriptionsAllowed: scala.Boolean,
    eventPublisher: NotificationEventPublisher,
    fields: org.scalablytyped.runtime.StringDictionary[NotificationEventField],
    hasInitiator: scala.Boolean,
    icon: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    roles: js.Array[NotificationEventRole],
    supportedScopes: js.Array[java.lang.String],
    url: java.lang.String
  ): NotificationEventType = {
    val __obj = js.Dynamic.literal(category = category, color = color, customSubscriptionsAllowed = customSubscriptionsAllowed, eventPublisher = eventPublisher, fields = fields, hasInitiator = hasInitiator, icon = icon, id = id, name = name, roles = roles, supportedScopes = supportedScopes, url = url)
  
    __obj.asInstanceOf[NotificationEventType]
  }
}

