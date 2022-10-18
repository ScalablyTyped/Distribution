package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "MousePointEvent")
@js.native
open class MousePointEvent protected ()
  extends typings.wonderJs.distEs2015EventObjectMousePointEventMod.MousePointEvent {
  def this(event: Any, eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName) = this()
}
/* static members */
object MousePointEvent {
  
  @JSImport("wonder.js/dist/es2015", "MousePointEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName): typings.wonderJs.distEs2015EventObjectMousePointEventMod.MousePointEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.distEs2015EventObjectMousePointEventMod.MousePointEvent]
}
