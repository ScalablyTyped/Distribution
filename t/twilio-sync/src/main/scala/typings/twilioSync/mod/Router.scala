package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Routes all incoming messages to the consumers.
  */
trait Router extends StObject {
  
  /**
    * Entry point for all incoming messages
    * @param {String} type - Type of incoming message
    * @param {Object} message - Message to route
    */
  def _routeMessage(`type`: String, message: Any): Any
  
  /**
    * Subscribe to events
    */
  def _subscribe(sid: String, entity: Any): Any
  
  /**
    * Unsubscribe from events
    */
  def _unsubscribe(sid: String): Any
}
object Router {
  
  inline def apply(_routeMessage: (String, Any) => Any, _subscribe: (String, Any) => Any, _unsubscribe: String => Any): Router = {
    val __obj = js.Dynamic.literal(_routeMessage = js.Any.fromFunction2(_routeMessage), _subscribe = js.Any.fromFunction2(_subscribe), _unsubscribe = js.Any.fromFunction1(_unsubscribe))
    __obj.asInstanceOf[Router]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Router] (val x: Self) extends AnyVal {
    
    inline def set_routeMessage(value: (String, Any) => Any): Self = StObject.set(x, "_routeMessage", js.Any.fromFunction2(value))
    
    inline def set_subscribe(value: (String, Any) => Any): Self = StObject.set(x, "_subscribe", js.Any.fromFunction2(value))
    
    inline def set_unsubscribe(value: String => Any): Self = StObject.set(x, "_unsubscribe", js.Any.fromFunction1(value))
  }
}
