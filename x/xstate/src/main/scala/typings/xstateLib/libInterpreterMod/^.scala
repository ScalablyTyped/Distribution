package typings
package xstateLib.libInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/interpreter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def interpret[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[InterpreterOptions]
  ): Interpreter[TContext, TStateSchema, TEvent] = js.native
}

