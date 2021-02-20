package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceEvent extends StObject {
  
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
  implicit class ServiceEventMutableBuilder[Self <: ServiceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: Publisher): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: js.Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceContainers(value: StringDictionary[js.Any]): Self = StObject.set(x, "resourceContainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
  }
}
