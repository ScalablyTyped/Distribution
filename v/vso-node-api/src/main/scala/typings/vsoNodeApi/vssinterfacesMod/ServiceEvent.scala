package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEvent extends js.Object {
  /**
    * This is the id of the type. Constants that will be used by subscribers to identify/filter events being published on a topic.
    */
  var eventType: String = js.native
  /**
    * This is the service that published this event.
    */
  var publisher: Publisher = js.native
  /**
    * The resource object that carries specific information about the event. The object must have the ServiceEventObject applied for serialization/deserialization to work.
    */
  var resource: js.Any = js.native
  /**
    * This dictionary carries the context descriptors along with their ids.
    */
  var resourceContainers: StringDictionary[js.Any] = js.native
  /**
    * This is the version of the resource.
    */
  var resourceVersion: String = js.native
}

object ServiceEvent {
  @scala.inline
  def apply(
    eventType: String,
    publisher: Publisher,
    resource: js.Any,
    resourceContainers: StringDictionary[js.Any],
    resourceVersion: String
  ): ServiceEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceContainers = resourceContainers.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEvent]
  }
  @scala.inline
  implicit class ServiceEventOps[Self <: ServiceEvent] (val x: Self) extends AnyVal {
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
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisher(value: Publisher): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: js.Any): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceContainers(value: StringDictionary[js.Any]): Self = this.set("resourceContainers", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceVersion(value: String): Self = this.set("resourceVersion", value.asInstanceOf[js.Any])
  }
  
}

