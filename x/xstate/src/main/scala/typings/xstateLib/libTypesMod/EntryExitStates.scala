package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryExitStates[TContext] extends js.Object {
  var entry: stdLib.Set[xstateLib.libStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]]
  var exit: stdLib.Set[xstateLib.libStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]]
}

object EntryExitStates {
  @scala.inline
  def apply[TContext](
    entry: stdLib.Set[xstateLib.libStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]],
    exit: stdLib.Set[xstateLib.libStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]]
  ): EntryExitStates[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry, exit = exit)
  
    __obj.asInstanceOf[EntryExitStates[TContext]]
  }
}

