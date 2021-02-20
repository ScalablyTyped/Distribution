package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignMeta[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent] = js.native
  
  var action: AssignAction[TContext, TEvent] = js.native
  
  var state: js.UndefOr[State[TContext, TEvent, _, ContextTContext[TContext]]] = js.native
}
object AssignMeta {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](_event: typings.xstate.typesMod.SCXML.Event[TEvent], action: AssignAction[TContext, TEvent]): AssignMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignMeta[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class AssignMetaMutableBuilder[Self <: AssignMeta[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (AssignMeta[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setAction(value: AssignAction[TContext, TEvent]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State[TContext, TEvent, _, ContextTContext[TContext]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def set_event(value: typings.xstate.typesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
