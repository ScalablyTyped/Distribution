package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.Dictattachment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventDispatcherMod {
  
  @JSImport("three/src/core/EventDispatcher", "EventDispatcher")
  @js.native
  /**
  	 * Creates eventDispatcher object. It needs to be call with '.call' to add the functionality to an object.
  	 */
  class EventDispatcher () extends StObject {
    
    /**
    	 * Adds a listener to an event type.
    	 * @param type The type of event to listen to.
    	 * @param listener The function that gets called when the event is fired.
    	 */
    def addEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
    
    /**
    	 * Fire an event type.
    	 * @param type The type of event that gets fired.
    	 */
    def dispatchEvent(event: Dictattachment): Unit = js.native
    
    /**
    	 * Checks if listener is added to an event type.
    	 * @param type The type of event to listen to.
    	 * @param listener The function that gets called when the event is fired.
    	 */
    def hasEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Boolean = js.native
    
    /**
    	 * Removes a listener from an event type.
    	 * @param type The type of the listener that gets removed.
    	 * @param listener The listener function that gets removed.
    	 */
    def removeEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
  }
  
  trait Event
    extends StObject
       with /* attachment */ StringDictionary[js.Any] {
    
    var target: js.UndefOr[js.Any] = js.undefined
    
    var `type`: String
  }
  object Event {
    
    @scala.inline
    def apply(`type`: String): Event = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
