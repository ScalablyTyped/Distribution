package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VssNotificationEvent extends js.Object {
  /**
       * Optional: A list of actors which are additional identities with corresponding roles that are relevant to the event.
       */
  var actors: js.Array[EventActor]
  /**
       * Optional: A list of artifacts referenced or impacted by this event.
       */
  var artifactUris: js.Array[java.lang.String]
  /**
       * Required: The event payload.  If Data is a string, it must be in Json or XML format.  Otherwise it must have a serialization format attribute.
       */
  var data: js.Any
  /**
       * Required: The name of the event.  This event must be registered in the context it is being fired.
       */
  var eventType: java.lang.String
  /**
       * Optional: A list of scopes which are are relevant to the event.
       */
  var scopes: js.Array[EventScope]
}

