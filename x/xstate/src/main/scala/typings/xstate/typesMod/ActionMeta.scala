package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionMeta[TContext, TEvent /* <: EventObject */]
  extends StObject
     with StateMeta[TContext, TEvent] {
  
  var action: ActionObject[TContext, TEvent]
}
object ActionMeta {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    action: ActionObject[TContext, TEvent],
    state: State[TContext, TEvent, js.Any, ContextTContext[TContext]]
  ): ActionMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[TContext, TEvent]]
  }
  
  extension [Self <: ActionMeta[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (ActionMeta[TContext, TEvent])) {
    
    inline def setAction(value: ActionObject[TContext, TEvent]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
