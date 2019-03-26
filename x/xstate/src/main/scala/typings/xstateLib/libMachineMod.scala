package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/Machine", JSImport.Namespace)
@js.native
object libMachineMod extends js.Object {
  def Machine[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](config: xstateLib.libTypesMod.MachineConfig[TContext, TStateSchema, TEvent]): xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    config: xstateLib.libTypesMod.MachineConfig[TContext, TStateSchema, TEvent],
    options: xstateLib.libTypesMod.MachineOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    config: xstateLib.libTypesMod.MachineConfig[TContext, TStateSchema, TEvent],
    options: xstateLib.libTypesMod.MachineOptions[TContext, TEvent],
    initialContext: TContext
  ): xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
}

