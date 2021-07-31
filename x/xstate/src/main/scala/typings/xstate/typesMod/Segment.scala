package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment[TContext, TEvent /* <: EventObject */] extends StObject {
  
  /**
    * Event from state.
    */
  var event: TEvent
  
  /**
    * From state.
    */
  var state: State[TContext, TEvent, js.Any, ContextTContext[TContext]]
}
object Segment {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](event: TEvent, state: State[TContext, TEvent, js.Any, ContextTContext[TContext]]): Segment[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class SegmentMutableBuilder[Self <: Segment[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (Segment[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State[TContext, TEvent, js.Any, ContextTContext[TContext]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
