package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseConditon[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: Actions[TContext, TEvent]
  
  var cond: js.UndefOr[Condition[TContext, TEvent]] = js.undefined
}
object ChooseConditon {
  
  inline def apply[TContext, TEvent /* <: EventObject */](actions: Actions[TContext, TEvent]): ChooseConditon[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseConditon[TContext, TEvent]]
  }
  
  extension [Self <: ChooseConditon[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (ChooseConditon[TContext, TEvent])) {
    
    inline def setActions(value: Actions[TContext, TEvent]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = StObject.set(x, "actions", js.Any.fromFunction3(value))
    
    inline def setActionsVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setCond(value: Condition[TContext, TEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setCondFunction3(value: (TContext, TEvent, /* meta */ GuardMeta[TContext, TEvent]) => Boolean): Self = StObject.set(x, "cond", js.Any.fromFunction3(value))
    
    inline def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
  }
}
