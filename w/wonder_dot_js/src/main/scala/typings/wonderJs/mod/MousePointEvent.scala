package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "MousePointEvent")
@js.native
class MousePointEvent protected ()
  extends typings.wonderJs.mousePointEventMod.MousePointEvent {
  def this(event: js.Any, eventName: typings.wonderJs.eventNameHandlerMod.EEventName) = this()
}
/* static members */
object MousePointEvent {
  
  @JSImport("wonder.js/dist/es2015", "MousePointEvent")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(eventName: typings.wonderJs.eventNameHandlerMod.EEventName): typings.wonderJs.mousePointEventMod.MousePointEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.mousePointEventMod.MousePointEvent]
}
