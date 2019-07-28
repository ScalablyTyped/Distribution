package typings.xstate

import typings.std.Partial
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.MachineConfig
import typings.xstate.libTypesMod.MachineOptions
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/Machine", JSImport.Namespace)
@js.native
object libMachineMod extends js.Object {
  def Machine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](config: MachineConfig[TContext, TStateSchema, TEvent]): StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, TStateSchema, TEvent] = js.native
}

