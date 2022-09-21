package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VssNotificationEvent extends StObject {
  
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
  var data: Any
  
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
  
  inline def apply(
    actors: js.Array[EventActor],
    artifactUris: js.Array[String],
    data: Any,
    eventType: String,
    scopes: js.Array[EventScope]
  ): VssNotificationEvent = {
    val __obj = js.Dynamic.literal(actors = actors.asInstanceOf[js.Any], artifactUris = artifactUris.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssNotificationEvent]
  }
  
  extension [Self <: VssNotificationEvent](x: Self) {
    
    inline def setActors(value: js.Array[EventActor]): Self = StObject.set(x, "actors", value.asInstanceOf[js.Any])
    
    inline def setActorsVarargs(value: EventActor*): Self = StObject.set(x, "actors", js.Array(value*))
    
    inline def setArtifactUris(value: js.Array[String]): Self = StObject.set(x, "artifactUris", value.asInstanceOf[js.Any])
    
    inline def setArtifactUrisVarargs(value: String*): Self = StObject.set(x, "artifactUris", js.Array(value*))
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[EventScope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: EventScope*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
