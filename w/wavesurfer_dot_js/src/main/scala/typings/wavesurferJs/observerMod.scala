package typings.wavesurferJs

import org.scalablytyped.runtime.StringDictionary
import typings.wavesurferJs.typesUtilMod.EventHandler
import typings.wavesurferJs.typesUtilMod.ListenerDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerMod {
  
  @JSImport("wavesurfer.js/src/util/observer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Observer {
    
    /** Manually fire an event. */
    /* CompleteClass */
    override def fireEvent(eventName: String, args: Any*): Unit = js.native
    
    /* CompleteClass */
    override val handlers: StringDictionary[js.Array[EventHandler]] = js.native
    
    /** Attach a handler function for an event. */
    /* CompleteClass */
    override def on(eventName: String, callback: EventHandler): ListenerDescriptor = js.native
    
    /** Attach a handler to an event. */
    /* CompleteClass */
    override def once(eventName: String, callback: EventHandler): ListenerDescriptor = js.native
    
    /** Disable firing a list of events by name. */
    /* CompleteClass */
    override def setDisabledEventEmissions(eventNames: js.Array[String]): Unit = js.native
    
    /** Remove an event handler. */
    /* CompleteClass */
    override def un(eventName: String, callback: EventHandler): Unit = js.native
    
    /** Remove all event handlers. */
    /* CompleteClass */
    override def unAll(): Unit = js.native
  }
  
  trait Observer extends StObject {
    
    /** Manually fire an event. */
    def fireEvent(eventName: String, args: Any*): Unit
    
    val handlers: StringDictionary[js.Array[EventHandler]]
    
    /** Attach a handler function for an event. */
    def on(eventName: String, callback: EventHandler): ListenerDescriptor
    
    /** Attach a handler to an event. */
    def once(eventName: String, callback: EventHandler): ListenerDescriptor
    
    /** Disable firing a list of events by name. */
    def setDisabledEventEmissions(eventNames: js.Array[String]): Unit
    
    /** Remove an event handler. */
    def un(eventName: String, callback: EventHandler): Unit
    
    /** Remove all event handlers. */
    def unAll(): Unit
  }
  object Observer {
    
    inline def apply(
      fireEvent: (String, /* repeated */ Any) => Unit,
      handlers: StringDictionary[js.Array[EventHandler]],
      on: (String, EventHandler) => ListenerDescriptor,
      once: (String, EventHandler) => ListenerDescriptor,
      setDisabledEventEmissions: js.Array[String] => Unit,
      un: (String, EventHandler) => Unit,
      unAll: () => Unit
    ): Observer = {
      val __obj = js.Dynamic.literal(fireEvent = js.Any.fromFunction2(fireEvent), handlers = handlers.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), setDisabledEventEmissions = js.Any.fromFunction1(setDisabledEventEmissions), un = js.Any.fromFunction2(un), unAll = js.Any.fromFunction0(unAll))
      __obj.asInstanceOf[Observer]
    }
    
    extension [Self <: Observer](x: Self) {
      
      inline def setFireEvent(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
      
      inline def setHandlers(value: StringDictionary[js.Array[EventHandler]]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (String, EventHandler) => ListenerDescriptor): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (String, EventHandler) => ListenerDescriptor): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setSetDisabledEventEmissions(value: js.Array[String] => Unit): Self = StObject.set(x, "setDisabledEventEmissions", js.Any.fromFunction1(value))
      
      inline def setUn(value: (String, EventHandler) => Unit): Self = StObject.set(x, "un", js.Any.fromFunction2(value))
      
      inline def setUnAll(value: () => Unit): Self = StObject.set(x, "unAll", js.Any.fromFunction0(value))
    }
  }
}
