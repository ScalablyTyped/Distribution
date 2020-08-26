package typings.xstate.typesMod

import typings.std.Set
import typings.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryExitStates[TContext] extends js.Object {
  var entry: Set[StateNode[TContext, _, EventObject, _]] = js.native
  var exit: Set[StateNode[TContext, _, EventObject, _]] = js.native
}

object EntryExitStates {
  @scala.inline
  def apply[TContext](
    entry: Set[StateNode[TContext, _, EventObject, _]],
    exit: Set[StateNode[TContext, _, EventObject, _]]
  ): EntryExitStates[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitStates[TContext]]
  }
  @scala.inline
  implicit class EntryExitStatesOps[Self <: EntryExitStates[_], TContext] (val x: Self with EntryExitStates[TContext]) extends AnyVal {
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
    def setEntry(value: Set[StateNode[TContext, _, EventObject, _]]): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit(value: Set[StateNode[TContext, _, EventObject, _]]): Self = this.set("exit", value.asInstanceOf[js.Any])
  }
  
}

