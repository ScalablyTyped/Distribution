package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignMeta[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent]
  
  var action: AssignAction[TContext, TEvent]
  
  var state: js.UndefOr[State[TContext, TEvent, js.Any, ContextTContext[TContext]]] = js.undefined
}
object AssignMeta {
  
  inline def apply[TContext, TEvent /* <: EventObject */](_event: typings.xstate.typesMod.SCXML.Event[TEvent], action: AssignAction[TContext, TEvent]): AssignMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignMeta[TContext, TEvent]]
  }
  
  extension [Self <: AssignMeta[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (AssignMeta[TContext, TEvent])) {
    
    inline def setAction(value: AssignAction[TContext, TEvent]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setState(value: State[TContext, TEvent, js.Any, ContextTContext[TContext]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def set_event(value: typings.xstate.typesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
