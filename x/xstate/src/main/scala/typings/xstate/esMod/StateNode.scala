package typings.xstate.esMod

import typings.std.Partial
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.MachineOptions
import typings.xstate.esTypesMod.OmniEventObject
import typings.xstate.esTypesMod.StateNodeConfig
import typings.xstate.esTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es", "StateNode")
@js.native
class StateNode[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: OmniEventObject[EventObject] */] protected ()
  extends typings.xstate.esStateNodeMod.StateNode[TContext, TStateSchema, TEvent] {
  def this(_config: StateNodeConfig[TContext, TStateSchema, TEvent]) = this()
  def this(
    _config: StateNodeConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ) = this()
  def this(
    _config: StateNodeConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    /**
    * The initial extended state
    */
  context: TContext
  ) = this()
}

