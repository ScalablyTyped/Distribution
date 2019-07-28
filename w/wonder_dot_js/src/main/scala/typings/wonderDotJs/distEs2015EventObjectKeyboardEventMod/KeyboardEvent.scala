package typings.wonderDotJs.distEs2015EventObjectKeyboardEventMod

import typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod.IKeyboardEventData
import typings.wonderDotJs.distEs2015EventObjectDomEventMod.DomEvent
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/KeyboardEvent", "KeyboardEvent")
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
@JSImport("wonder.js/dist/es2015/event/object/KeyboardEvent", "KeyboardEvent")
@js.native
object KeyboardEvent extends js.Object {
  def create(event: js.Any, eventName: EEventName): KeyboardEvent = js.native
}

