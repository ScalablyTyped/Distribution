package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryExitStateArrays[TContext] extends StObject {
  
  var entry: js.Array[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]]
  
  var exit: js.Array[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]]
}
object EntryExitStateArrays {
  
  inline def apply[TContext](
    entry: js.Array[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]],
    exit: js.Array[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]]
  ): EntryExitStateArrays[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitStateArrays[TContext]]
  }
  
  extension [Self <: EntryExitStateArrays[?], TContext](x: Self & EntryExitStateArrays[TContext]) {
    
    inline def setEntry(value: js.Array[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryVarargs(value: (StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]])*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    inline def setExit(value: js.Array[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitVarargs(value: (StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]])*): Self = StObject.set(x, "exit", js.Array(value :_*))
  }
}
