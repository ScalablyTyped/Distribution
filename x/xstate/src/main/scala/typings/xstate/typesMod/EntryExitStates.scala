package typings.xstate.typesMod

import typings.std.Set
import typings.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryExitStates[TContext] extends js.Object {
  var entry: Set[StateNode[TContext, _, EventObject, _]]
  var exit: Set[StateNode[TContext, _, EventObject, _]]
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
}

