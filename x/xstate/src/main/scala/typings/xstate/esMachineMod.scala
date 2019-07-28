package typings.xstate

import typings.std.Partial
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.MachineConfig
import typings.xstate.esTypesMod.MachineOptions
import typings.xstate.esTypesMod.StateMachine
import typings.xstate.esTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/Machine", JSImport.Namespace)
@js.native
object esMachineMod extends js.Object {
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

