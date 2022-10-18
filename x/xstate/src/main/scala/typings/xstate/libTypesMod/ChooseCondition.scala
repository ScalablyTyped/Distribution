package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseCondition[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: Actions[TContext, TEvent]
  
  var cond: js.UndefOr[Condition[TContext, TEvent]] = js.undefined
}
object ChooseCondition {
  
  inline def apply[TContext, TEvent /* <: EventObject */](actions: Actions[TContext, TEvent]): ChooseCondition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseCondition[TContext, TEvent]]
  }
  
  extension [Self <: ChooseCondition[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (ChooseCondition[TContext, TEvent])) {
    
    inline def setActions(value: Actions[TContext, TEvent]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => Unit): Self = StObject.set(x, "actions", js.Any.fromFunction3(value))
    
    inline def setActionsVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCond(value: Condition[TContext, TEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setCondFunction3(value: (TContext, TEvent, /* meta */ GuardMeta[TContext, TEvent]) => Boolean): Self = StObject.set(x, "cond", js.Any.fromFunction3(value))
    
    inline def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
  }
}
