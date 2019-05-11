package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MachineOptions extends js.Object {
  def apply[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent]): xstateLib.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def apply[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.libTypesMod.InterpreterOptions]
  ): xstateLib.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
}

