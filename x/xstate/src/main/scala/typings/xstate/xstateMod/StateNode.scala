package typings.xstate.xstateMod

import typings.std.Partial
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.MachineOptions
import typings.xstate.libTypesMod.OmniEventObject
import typings.xstate.libTypesMod.StateNodeConfig
import typings.xstate.libTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", "StateNode")
@js.native
class StateNode[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: OmniEventObject[EventObject] */] protected ()
  extends typings.xstate.libStateNodeMod.StateNode[TContext, TStateSchema, TEvent] {
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

