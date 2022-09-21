package typings.wonderJs

import typings.wonderJs.domEventMod.DomEvent
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.IKeyboardEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardEventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/KeyboardEvent", "KeyboardEvent")
  @js.native
  open class KeyboardEvent protected () extends DomEvent {
    def this(event: Any, eventName: EEventName) = this()
    
    val altKey: Double = js.native
    
    val ctrlKey: Double = js.native
    
    @JSName("event")
    var event_KeyboardEvent: IKeyboardEventData = js.native
    
    val key: Any = js.native
    
    val keyCode: Double = js.native
    
    var keyState: Any = js.native
    
    val metaKey: Double = js.native
    
    val shiftKey: Double = js.native
  }
  /* static members */
  object KeyboardEvent {
    
    @JSImport("wonder.js/dist/es2015/event/object/KeyboardEvent", "KeyboardEvent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(event: Any, eventName: EEventName): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(event.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  }
}
