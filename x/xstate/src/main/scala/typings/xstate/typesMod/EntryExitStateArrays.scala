package typings.xstate.typesMod

import typings.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryExitStateArrays[TContext] extends js.Object {
  var entry: js.Array[StateNode[TContext, _, EventObject, _]]
  var exit: js.Array[StateNode[TContext, _, EventObject, _]]
}

object EntryExitStateArrays {
  @scala.inline
  def apply[TContext](
    entry: js.Array[StateNode[TContext, _, EventObject, _]],
    exit: js.Array[StateNode[TContext, _, EventObject, _]]
  ): EntryExitStateArrays[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntryExitStateArrays[TContext]]
  }
}

