package typings.wonderJs.mod

import typings.wonderJs.ieventdataMod.IMouseEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "MouseEvent")
@js.native
class MouseEvent protected ()
  extends typings.wonderJs.mouseEventMod.MouseEvent {
  def this(event: js.Any, eventName: typings.wonderJs.eventNameHandlerMod.EEventName) = this()
}
/* static members */
object MouseEvent {
  
  @JSImport("wonder.js/dist/es2015", "MouseEvent")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(event: IMouseEventData, eventName: typings.wonderJs.eventNameHandlerMod.EEventName): typings.wonderJs.mouseEventMod.MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(event.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.mouseEventMod.MouseEvent]
}
