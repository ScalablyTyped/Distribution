package typings.wordpressCompose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHigherOrderWithGlobalEventsListenerMod {
  
  /**
    * Class responsible for orchestrating event handling on the global window,
    * binding a single event to be shared across all handling instances, and
    * removing the handler when no instances are listening for the event.
    */
  @JSImport("@wordpress/compose/build-types/higher-order/with-global-events/listener", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Listener {
    
    /* CompleteClass */
    override def add(eventType: Any, instance: Any): Unit = js.native
    
    /* CompleteClass */
    override def handleEvent(event: Any): Unit = js.native
    
    /** @type {any} */
    /* CompleteClass */
    var listeners: Any = js.native
    
    /* CompleteClass */
    override def remove(eventType: Any, instance: Any): Unit = js.native
  }
  
  /**
    * Class responsible for orchestrating event handling on the global window,
    * binding a single event to be shared across all handling instances, and
    * removing the handler when no instances are listening for the event.
    */
  trait Listener extends StObject {
    
    def add(eventType: Any, instance: Any): Unit
    
    def handleEvent(event: Any): Unit
    
    /** @type {any} */
    var listeners: Any
    
    def remove(eventType: Any, instance: Any): Unit
  }
  object Listener {
    
    inline def apply(add: (Any, Any) => Unit, handleEvent: Any => Unit, listeners: Any, remove: (Any, Any) => Unit): Listener = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), handleEvent = js.Any.fromFunction1(handleEvent), listeners = listeners.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove))
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: (Any, Any) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setHandleEvent(value: Any => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      
      inline def setListeners(value: Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: (Any, Any) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    }
  }
}
