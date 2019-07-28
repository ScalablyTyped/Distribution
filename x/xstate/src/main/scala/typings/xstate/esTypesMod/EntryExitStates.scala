package typings.xstate.esTypesMod

import typings.std.Set
import typings.xstate.esStateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryExitStates[TContext] extends js.Object {
  var entry: Set[StateNode[TContext, _, OmniEventObject[EventObject]]]
  var exit: Set[StateNode[TContext, _, OmniEventObject[EventObject]]]
}

object EntryExitStates {
  @scala.inline
  def apply[TContext](
    entry: Set[StateNode[TContext, _, OmniEventObject[EventObject]]],
    exit: Set[StateNode[TContext, _, OmniEventObject[EventObject]]]
  ): EntryExitStates[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry, exit = exit)
  
    __obj.asInstanceOf[EntryExitStates[TContext]]
  }
}

