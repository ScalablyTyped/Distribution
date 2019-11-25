package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

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
  var artifactUris: js.Array[String]
  /**
    * Required: The event payload.  If Data is a string, it must be in Json or XML format.  Otherwise it must have a serialization format attribute.
    */
  var data: js.Any
  /**
    * Required: The name of the event.  This event must be registered in the context it is being fired.
    */
  var eventType: String
  /**
    * Optional: A list of scopes which are are relevant to the event.
    */
  var scopes: js.Array[EventScope]
}

object VssNotificationEvent {
  @scala.inline
  def apply(
    actors: js.Array[EventActor],
    artifactUris: js.Array[String],
    data: js.Any,
    eventType: String,
    scopes: js.Array[EventScope]
  ): VssNotificationEvent = {
    val __obj = js.Dynamic.literal(actors = actors.asInstanceOf[js.Any], artifactUris = artifactUris.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VssNotificationEvent]
  }
}

