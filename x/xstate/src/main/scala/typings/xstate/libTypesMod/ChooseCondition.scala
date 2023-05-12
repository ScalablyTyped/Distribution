package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseCondition[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */] extends StObject {
  
  var actions: Actions[TContext, TExpressionEvent, TEvent]
  
  var cond: js.UndefOr[Condition[TContext, TExpressionEvent]] = js.undefined
}
object ChooseCondition {
  
  inline def apply[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](actions: Actions[TContext, TExpressionEvent, TEvent]): ChooseCondition[TContext, TExpressionEvent, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseCondition[TContext, TExpressionEvent, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChooseCondition[?, ?, ?], TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */] (val x: Self & (ChooseCondition[TContext, TExpressionEvent, TEvent])) extends AnyVal {
    
    inline def setActions(value: Actions[TContext, TExpressionEvent, TEvent]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsFunction3(
      value: (TContext, TExpressionEvent, /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => Unit
    ): Self = StObject.set(x, "actions", js.Any.fromFunction3(value))
    
    inline def setActionsVarargs(value: (Action[TContext, TExpressionEvent, TEvent])*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCond(value: Condition[TContext, TExpressionEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setCondFunction3(value: (TContext, TExpressionEvent, /* meta */ GuardMeta[TContext, TExpressionEvent]) => Boolean): Self = StObject.set(x, "cond", js.Any.fromFunction3(value))
    
    inline def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
  }
}
