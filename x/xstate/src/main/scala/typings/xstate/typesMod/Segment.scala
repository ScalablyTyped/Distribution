package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segment[TContext, TEvent /* <: EventObject */] extends StObject {
  
  /**
    * Event from state.
    */
  var event: TEvent = js.native
  
  /**
    * From state.
    */
  var state: State[TContext, TEvent, _, ContextTContext[TContext]] = js.native
}
object Segment {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](event: TEvent, state: State[TContext, TEvent, _, ContextTContext[TContext]]): Segment[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class SegmentMutableBuilder[Self <: Segment[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (Segment[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State[TContext, TEvent, _, ContextTContext[TContext]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
