package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEvent extends js.Object {
  /**
    * This is the id of the type. Constants that will be used by subscribers to identify/filter events being published on a topic.
    */
  var eventType: String
  /**
    * This is the service that published this event.
    */
  var publisher: Publisher
  /**
    * The resource object that carries specific information about the event. The object must have the ServiceEventObject applied for serialization/deserialization to work.
    */
  var resource: js.Any
  /**
    * This dictionary carries the context descriptors along with their ids.
    */
  var resourceContainers: StringDictionary[js.Any]
  /**
    * This is the version of the resource.
    */
  var resourceVersion: String
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
    val __obj = js.Dynamic.literal(eventType = eventType, publisher = publisher, resource = resource, resourceContainers = resourceContainers, resourceVersion = resourceVersion)
  
    __obj.asInstanceOf[ServiceEvent]
  }
}

