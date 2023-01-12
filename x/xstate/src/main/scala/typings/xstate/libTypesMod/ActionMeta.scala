package typings.xstate.libTypesMod

import typings.xstate.libStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionMeta[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */]
  extends StObject
     with StateMeta[TContext, TEvent] {
  
  var action: TAction
}
object ActionMeta {
  
  inline def apply[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */](
    _event: typings.xstate.libTypesMod.SCXML.Event[TEvent],
    action: TAction,
    state: State[TContext, TEvent, Any, Any, Any]
  ): ActionMeta[TContext, TEvent, TAction] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[TContext, TEvent, TAction]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionMeta[?, ?, ?], TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] (val x: Self & (ActionMeta[TContext, TEvent, TAction])) extends AnyVal {
    
    inline def setAction(value: TAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
