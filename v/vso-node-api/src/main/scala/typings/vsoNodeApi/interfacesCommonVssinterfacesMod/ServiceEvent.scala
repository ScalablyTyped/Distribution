package typings.vsoNodeApi.interfacesCommonVssinterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEvent extends StObject {
  
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
  var resource: Any
  
  /**
    * This dictionary carries the context descriptors along with their ids.
    */
  var resourceContainers: StringDictionary[Any]
  
  /**
    * This is the version of the resource.
    */
  var resourceVersion: String
}
object ServiceEvent {
  
  inline def apply(
    eventType: String,
    publisher: Publisher,
    resource: Any,
    resourceContainers: StringDictionary[Any],
    resourceVersion: String
  ): ServiceEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceContainers = resourceContainers.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceEvent] (val x: Self) extends AnyVal {
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: Publisher): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setResource(value: Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceContainers(value: StringDictionary[Any]): Self = StObject.set(x, "resourceContainers", value.asInstanceOf[js.Any])
    
    inline def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
  }
}
