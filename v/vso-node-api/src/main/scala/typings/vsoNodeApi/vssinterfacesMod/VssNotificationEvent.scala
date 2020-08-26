package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VssNotificationEvent extends js.Object {
  /**
    * Optional: A list of actors which are additional identities with corresponding roles that are relevant to the event.
    */
  var actors: js.Array[EventActor] = js.native
  /**
    * Optional: A list of artifacts referenced or impacted by this event.
    */
  var artifactUris: js.Array[String] = js.native
  /**
    * Required: The event payload.  If Data is a string, it must be in Json or XML format.  Otherwise it must have a serialization format attribute.
    */
  var data: js.Any = js.native
  /**
    * Required: The name of the event.  This event must be registered in the context it is being fired.
    */
  var eventType: String = js.native
  /**
    * Optional: A list of scopes which are are relevant to the event.
    */
  var scopes: js.Array[EventScope] = js.native
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
  @scala.inline
  implicit class VssNotificationEventOps[Self <: VssNotificationEvent] (val x: Self) extends AnyVal {
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
    def setActorsVarargs(value: EventActor*): Self = this.set("actors", js.Array(value :_*))
    @scala.inline
    def setActors(value: js.Array[EventActor]): Self = this.set("actors", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactUrisVarargs(value: String*): Self = this.set("artifactUris", js.Array(value :_*))
    @scala.inline
    def setArtifactUris(value: js.Array[String]): Self = this.set("artifactUris", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: EventScope*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[EventScope]): Self = this.set("scopes", value.asInstanceOf[js.Any])
  }
  
}

