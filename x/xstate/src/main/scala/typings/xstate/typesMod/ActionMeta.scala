package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionMeta[TContext, TEvent /* <: EventObject */] extends StateMeta[TContext, TEvent] {
  
  var action: ActionObject[TContext, TEvent] = js.native
}
object ActionMeta {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    action: ActionObject[TContext, TEvent],
    state: State[TContext, TEvent, _, ContextTContext[TContext]]
  ): ActionMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class ActionMetaMutableBuilder[Self <: ActionMeta[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (ActionMeta[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionObject[TContext, TEvent]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
