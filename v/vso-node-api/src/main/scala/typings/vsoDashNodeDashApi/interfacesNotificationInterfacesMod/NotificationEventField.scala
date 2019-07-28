package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventField extends js.Object {
  /**
    * Gets or sets the type of this field.
    */
  var fieldType: NotificationEventFieldType
  /**
    * Gets or sets the unique identifier of this field.
    */
  var id: String
  /**
    * Gets or sets the name of this field.
    */
  var name: String
  /**
    * Gets or sets the path to the field in the event object. This path can be either Json Path or XPath, depending on if the event will be serialized into Json or XML
    */
  var path: String
  /**
    * Gets or sets the scopes that this field supports. If not specified then the event type scopes apply.
    */
  var supportedScopes: js.Array[String]
}

object NotificationEventField {
  @scala.inline
  def apply(
    fieldType: NotificationEventFieldType,
    id: String,
    name: String,
    path: String,
    supportedScopes: js.Array[String]
  ): NotificationEventField = {
    val __obj = js.Dynamic.literal(fieldType = fieldType, id = id, name = name, path = path, supportedScopes = supportedScopes)
  
    __obj.asInstanceOf[NotificationEventField]
  }
}

