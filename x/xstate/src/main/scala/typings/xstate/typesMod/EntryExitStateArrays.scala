package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryExitStateArrays[TContext] extends js.Object {
  
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
  implicit class EntryExitStateArraysOps[Self <: EntryExitStateArrays[_], TContext] (val x: Self with EntryExitStateArrays[TContext]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntryVarargs(value: (StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]])*): Self = this.set("entry", js.Array(value :_*))
    
    @scala.inline
    def setEntry(value: js.Array[StateNode[TContext, _, EventObject, ContextTContext[TContext]]]): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitVarargs(value: (StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]])*): Self = this.set("exit", js.Array(value :_*))
    
    @scala.inline
    def setExit(value: js.Array[StateNode[TContext, _, EventObject, ContextTContext[TContext]]]): Self = this.set("exit", value.asInstanceOf[js.Any])
  }
}
