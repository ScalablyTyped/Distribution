package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryExitStates[TContext] extends js.Object {
  var entry: stdLib.Set[xstateLib.esStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]]
  var exit: stdLib.Set[xstateLib.esStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]]
}

object EntryExitStates {
  @scala.inline
  def apply[TContext](
    entry: stdLib.Set[xstateLib.esStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]],
    exit: stdLib.Set[xstateLib.esStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]]
  ): EntryExitStates[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry, exit = exit)
  
    __obj.asInstanceOf[EntryExitStates[TContext]]
  }
}

