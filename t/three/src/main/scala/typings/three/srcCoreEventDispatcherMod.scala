package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreEventDispatcherMod {
  
  @JSImport("three/src/core/EventDispatcher", "EventDispatcher")
  @js.native
  /**
    * Creates {@link THREE.EventDispatcher | EventDispatcher} object.
    */
  open class EventDispatcher[E /* <: BaseEvent */] () extends StObject {
    
    /**
      * Adds a listener to an event type.
      * @param type The type of event to listen to.
      * @param listener The function that gets called when the event is fired.
      */
    def addEventListener[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: E['type'] */ js.Any */](`type`: T, listener: EventListener[E, T, this.type]): Unit = js.native
    
    /**
      * Fire an event type.
      * @param event The event that gets fired.
      */
    def dispatchEvent(event: E): Unit = js.native
    
    /**
      * Checks if listener is added to an event type.
      * @param type The type of event to listen to.
      * @param listener The function that gets called when the event is fired.
      */
    def hasEventListener[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: E['type'] */ js.Any */](`type`: T, listener: EventListener[E, T, this.type]): Boolean = js.native
    
    /**
      * Removes a listener from an event type.
      * @param type The type of the listener that gets removed.
      * @param listener The listener function that gets removed.
      */
    def removeEventListener[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: E['type'] */ js.Any */](`type`: T, listener: EventListener[E, T, this.type]): Unit = js.native
  }
  
  trait BaseEvent extends StObject {
    
    var `type`: String
  }
  object BaseEvent {
    
    inline def apply(`type`: String): BaseEvent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseEvent] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Event
    extends StObject
       with BaseEvent
       with /* attachment */ StringDictionary[Any] {
    
    var target: js.UndefOr[Any] = js.undefined
  }
  object Event {
    
    inline def apply(`type`: String): Event = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type EventListener[E, T, U] = js.Function1[/* event */ (Type[T, U]) & E, Unit]
}
