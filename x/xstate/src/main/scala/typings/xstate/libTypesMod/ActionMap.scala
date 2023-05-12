package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionMap[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: js.Array[Action[TContext, TEvent, TEvent]]
  
  var onEntry: js.Array[Action[TContext, TEvent, TEvent]]
  
  var onExit: js.Array[Action[TContext, TEvent, TEvent]]
}
object ActionMap {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[Action[TContext, TEvent, TEvent]],
    onEntry: js.Array[Action[TContext, TEvent, TEvent]],
    onExit: js.Array[Action[TContext, TEvent, TEvent]]
  ): ActionMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onEntry = onEntry.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMap[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionMap[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (ActionMap[TContext, TEvent])) extends AnyVal {
    
    inline def setActions(value: js.Array[Action[TContext, TEvent, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: (Action[TContext, TEvent, TEvent])*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setOnEntry(value: js.Array[Action[TContext, TEvent, TEvent]]): Self = StObject.set(x, "onEntry", value.asInstanceOf[js.Any])
    
    inline def setOnEntryVarargs(value: (Action[TContext, TEvent, TEvent])*): Self = StObject.set(x, "onEntry", js.Array(value*))
    
    inline def setOnExit(value: js.Array[Action[TContext, TEvent, TEvent]]): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    inline def setOnExitVarargs(value: (Action[TContext, TEvent, TEvent])*): Self = StObject.set(x, "onExit", js.Array(value*))
  }
}
