package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/Machine", JSImport.Namespace)
@js.native
object esMachineMod extends js.Object {
  def Machine[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](config: xstateLib.esTypesMod.MachineConfig[TContext, TStateSchema, TEvent]): xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    config: xstateLib.esTypesMod.MachineConfig[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.esTypesMod.MachineOptions[TContext, TEvent]]
  ): xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    config: xstateLib.esTypesMod.MachineConfig[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.esTypesMod.MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
}

