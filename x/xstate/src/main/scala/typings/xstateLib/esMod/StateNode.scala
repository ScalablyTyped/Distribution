package typings
package xstateLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es", "StateNode")
@js.native
class StateNode[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject] */] protected ()
  extends xstateLib.esStateNodeMod.StateNode[TContext, TStateSchema, TEvent] {
  def this(_config: xstateLib.esTypesMod.StateNodeConfig[TContext, TStateSchema, TEvent]) = this()
  def this(_config: xstateLib.esTypesMod.StateNodeConfig[TContext, TStateSchema, TEvent], options: stdLib.Partial[xstateLib.esTypesMod.MachineOptions[TContext, TEvent]]) = this()
  def this(_config: xstateLib.esTypesMod.StateNodeConfig[TContext, TStateSchema, TEvent], options: stdLib.Partial[xstateLib.esTypesMod.MachineOptions[TContext, TEvent]], /**
    * The initial extended state
    */
  context: stdLib.Readonly[TContext]) = this()
}

