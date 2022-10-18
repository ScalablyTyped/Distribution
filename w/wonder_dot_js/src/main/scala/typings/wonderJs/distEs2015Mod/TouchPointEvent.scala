package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "TouchPointEvent")
@js.native
open class TouchPointEvent protected ()
  extends typings.wonderJs.distEs2015EventObjectTouchPointEventMod.TouchPointEvent {
  def this(event: Any, eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName) = this()
}
/* static members */
object TouchPointEvent {
  
  @JSImport("wonder.js/dist/es2015", "TouchPointEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName): typings.wonderJs.distEs2015EventObjectTouchPointEventMod.TouchPointEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.distEs2015EventObjectTouchPointEventMod.TouchPointEvent]
}
