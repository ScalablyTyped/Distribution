package typings.wonderJs.mod

import typings.wonderJs.ieventdataMod.ITouchEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "TouchEvent")
@js.native
class TouchEvent protected ()
  extends typings.wonderJs.touchEventMod.TouchEvent {
  def this(event: js.Any, eventName: typings.wonderJs.eventNameHandlerMod.EEventName) = this()
}
/* static members */
object TouchEvent {
  
  @JSImport("wonder.js/dist/es2015", "TouchEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(event: ITouchEventData, eventName: typings.wonderJs.eventNameHandlerMod.EEventName): typings.wonderJs.touchEventMod.TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(event.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.touchEventMod.TouchEvent]
}
