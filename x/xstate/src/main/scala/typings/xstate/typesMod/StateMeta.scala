package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateMeta[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent]
  
  var state: State[TContext, TEvent, js.Any, ContextTContext[TContext]]
}
object StateMeta {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    state: State[TContext, TEvent, js.Any, ContextTContext[TContext]]
  ): StateMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMeta[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class StateMetaMutableBuilder[Self <: StateMeta[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (StateMeta[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setState(value: State[TContext, TEvent, js.Any, ContextTContext[TContext]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_event(value: typings.xstate.typesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
