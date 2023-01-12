package typings.xstate.libTypesMod

import typings.xstate.anon.Context
import typings.xstate.libStateMod.State
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignMeta[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var _event: typings.xstate.libTypesMod.SCXML.Event[TEvent]
  
  var action: AssignAction[TContext, TEvent]
  
  var state: js.UndefOr[State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]] = js.undefined
}
object AssignMeta {
  
  inline def apply[TContext, TEvent /* <: EventObject */](_event: typings.xstate.libTypesMod.SCXML.Event[TEvent], action: AssignAction[TContext, TEvent]): AssignMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignMeta[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignMeta[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (AssignMeta[TContext, TEvent])) extends AnyVal {
    
    inline def setAction(value: AssignAction[TContext, TEvent]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setState(value: State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def set_event(value: typings.xstate.libTypesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
