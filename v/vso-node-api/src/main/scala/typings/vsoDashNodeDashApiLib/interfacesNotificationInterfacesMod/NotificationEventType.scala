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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("customSubscriptionsAllowed")(customSubscriptionsAllowed)
    __obj.updateDynamic("eventPublisher")(eventPublisher)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("hasInitiator")(hasInitiator)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("roles")(roles)
    __obj.updateDynamic("supportedScopes")(supportedScopes)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[NotificationEventType]
  }
}

