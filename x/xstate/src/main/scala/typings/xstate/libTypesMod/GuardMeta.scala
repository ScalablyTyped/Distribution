package typings.xstate.libTypesMod

import typings.xstate.libStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuardMeta[TContext, TEvent /* <: EventObject */]
  extends StObject
     with StateMeta[TContext, TEvent] {
  
  var cond: Guard[TContext, TEvent]
}
object GuardMeta {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    _event: typings.xstate.libTypesMod.SCXML.Event[TEvent],
    cond: Guard[TContext, TEvent],
    state: State[TContext, TEvent, Any, Any, Any]
  ): GuardMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuardMeta[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GuardMeta[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (GuardMeta[TContext, TEvent])) extends AnyVal {
    
    inline def setCond(value: Guard[TContext, TEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
  }
}
