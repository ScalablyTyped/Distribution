package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionMap[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: js.Array[Action[TContext, TEvent]] = js.native
  
  var onEntry: js.Array[Action[TContext, TEvent]] = js.native
  
  var onExit: js.Array[Action[TContext, TEvent]] = js.native
}
object ActionMap {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[Action[TContext, TEvent]],
    onEntry: js.Array[Action[TContext, TEvent]],
    onExit: js.Array[Action[TContext, TEvent]]
  ): ActionMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onEntry = onEntry.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMap[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class ActionMapMutableBuilder[Self <: ActionMap[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (ActionMap[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[Action[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setOnEntry(value: js.Array[Action[TContext, TEvent]]): Self = StObject.set(x, "onEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEntryVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "onEntry", js.Array(value :_*))
    
    @scala.inline
    def setOnExit(value: js.Array[Action[TContext, TEvent]]): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExitVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "onExit", js.Array(value :_*))
  }
}
