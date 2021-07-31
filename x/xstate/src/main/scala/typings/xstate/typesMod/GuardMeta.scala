package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuardMeta[TContext, TEvent /* <: EventObject */]
  extends StObject
     with StateMeta[TContext, TEvent] {
  
  var cond: Guard[TContext, TEvent]
}
object GuardMeta {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    cond: Guard[TContext, TEvent],
    state: State[TContext, TEvent, js.Any, ContextTContext[TContext]]
  ): GuardMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuardMeta[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class GuardMetaMutableBuilder[Self <: GuardMeta[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (GuardMeta[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setCond(value: Guard[TContext, TEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
  }
}
