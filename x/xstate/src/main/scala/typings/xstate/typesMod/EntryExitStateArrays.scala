package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryExitStateArrays[TContext] extends StObject {
  
  var entry: js.Array[StateNode[TContext, _, EventObject, ContextTContext[TContext]]] = js.native
  
  var exit: js.Array[StateNode[TContext, _, EventObject, ContextTContext[TContext]]] = js.native
}
object EntryExitStateArrays {
  
  @scala.inline
  def apply[TContext](
    entry: js.Array[StateNode[TContext, _, EventObject, ContextTContext[TContext]]],
    exit: js.Array[StateNode[TContext, _, EventObject, ContextTContext[TContext]]]
  ): EntryExitStateArrays[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitStateArrays[TContext]]
  }
  
  @scala.inline
  implicit class EntryExitStateArraysMutableBuilder[Self <: EntryExitStateArrays[_], TContext] (val x: Self with EntryExitStateArrays[TContext]) extends AnyVal {
    
    @scala.inline
    def setEntry(value: js.Array[StateNode[TContext, _, EventObject, ContextTContext[TContext]]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryVarargs(value: (StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]])*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setExit(value: js.Array[StateNode[TContext, _, EventObject, ContextTContext[TContext]]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitVarargs(value: (StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]])*): Self = StObject.set(x, "exit", js.Array(value :_*))
  }
}
