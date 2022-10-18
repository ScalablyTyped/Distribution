package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "KeyboardEvent")
@js.native
open class KeyboardEvent protected ()
  extends typings.wonderJs.distEs2015EventObjectKeyboardEventMod.KeyboardEvent {
  def this(event: Any, eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName) = this()
}
/* static members */
object KeyboardEvent {
  
  @JSImport("wonder.js/dist/es2015", "KeyboardEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(event: Any, eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName): typings.wonderJs.distEs2015EventObjectKeyboardEventMod.KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(event.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015EventObjectKeyboardEventMod.KeyboardEvent]
}
