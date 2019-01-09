package typings
package wonderDotJsLib.distEs2015EventObjectKeyboardEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/KeyboardEvent", "KeyboardEvent")
@js.native
class KeyboardEvent ()
  extends wonderDotJsLib.distEs2015EventObjectDomEventMod.DomEvent {
  val altKey: scala.Double = js.native
  val ctrlKey: scala.Double = js.native
  @JSName("event")
  var event_KeyboardEvent: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.IKeyboardEventData = js.native
  val key: js.Any = js.native
  val keyCode: scala.Double = js.native
  var keyState: js.Any = js.native
  val metaKey: scala.Double = js.native
  val shiftKey: scala.Double = js.native
}

@JSImport("wonder.js/dist/es2015/event/object/KeyboardEvent", "KeyboardEvent")
@js.native
object KeyboardEvent extends js.Object {
  def create(event: js.Any, eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): wonderDotJsLib.distEs2015EventObjectKeyboardEventMod.KeyboardEvent = js.native
}

