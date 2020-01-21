package typings.wonderJs

import typings.wonderJs.domEventMod.DomEvent
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.IKeyboardEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/KeyboardEvent", JSImport.Namespace)
@js.native
object keyboardEventMod extends js.Object {
  @js.native
  class KeyboardEvent () extends DomEvent {
    val altKey: Double = js.native
    val ctrlKey: Double = js.native
    @JSName("event")
    var event_KeyboardEvent: IKeyboardEventData = js.native
    val key: js.Any = js.native
    val keyCode: Double = js.native
    var keyState: js.Any = js.native
    val metaKey: Double = js.native
    val shiftKey: Double = js.native
  }
  
  /* static members */
  @js.native
  object KeyboardEvent extends js.Object {
    def create(event: js.Any, eventName: EEventName): KeyboardEvent = js.native
  }
  
}

