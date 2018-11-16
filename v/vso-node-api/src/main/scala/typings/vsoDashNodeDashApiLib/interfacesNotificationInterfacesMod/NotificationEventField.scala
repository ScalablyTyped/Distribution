package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

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
  var id: java.lang.String
  /**
       * Gets or sets the name of this field.
       */
  var name: java.lang.String
  /**
       * Gets or sets the path to the field in the event object. This path can be either Json Path or XPath, depending on if the event will be serialized into Json or XML
       */
  var path: java.lang.String
  /**
       * Gets or sets the scopes that this field supports. If not specified then the event type scopes apply.
       */
  var supportedScopes: js.Array[java.lang.String]
}

