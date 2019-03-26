package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryExitStateArrays[TContext] extends js.Object {
  var entry: js.Array[xstateLib.libStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]]
  var exit: js.Array[xstateLib.libStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]]
}

object EntryExitStateArrays {
  @scala.inline
  def apply[TContext](
    entry: js.Array[xstateLib.libStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]],
    exit: js.Array[xstateLib.libStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]]
  ): EntryExitStateArrays[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry, exit = exit)
  
    __obj.asInstanceOf[EntryExitStateArrays[TContext]]
  }
}

