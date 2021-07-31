package typings.xstate.typesMod

import typings.std.Set
import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryExitStates[TContext] extends StObject {
  
  var entry: Set[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]]
  
  var exit: Set[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]]
}
object EntryExitStates {
  
  @scala.inline
  def apply[TContext](
    entry: Set[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]],
    exit: Set[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]]
  ): EntryExitStates[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitStates[TContext]]
  }
  
  @scala.inline
  implicit class EntryExitStatesMutableBuilder[Self <: EntryExitStates[?], TContext] (val x: Self & EntryExitStates[TContext]) extends AnyVal {
    
    @scala.inline
    def setEntry(value: Set[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: Set[StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
  }
}
