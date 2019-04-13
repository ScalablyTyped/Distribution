package typings
package xstateLib.xstateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", "StateNode")
@js.native
class StateNode[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject] */] protected ()
  extends xstateLib.libStateNodeMod.StateNode[TContext, TStateSchema, TEvent] {
  def this(_config: xstateLib.libTypesMod.StateNodeConfig[TContext, TStateSchema, TEvent]) = this()
  def this(_config: xstateLib.libTypesMod.StateNodeConfig[TContext, TStateSchema, TEvent], options: stdLib.Partial[xstateLib.libTypesMod.MachineOptions[TContext, TEvent]]) = this()
  def this(_config: xstateLib.libTypesMod.StateNodeConfig[TContext, TStateSchema, TEvent], options: stdLib.Partial[xstateLib.libTypesMod.MachineOptions[TContext, TEvent]], /**
    * The initial extended state
    */
  context: stdLib.Readonly[TContext]) = this()
}

