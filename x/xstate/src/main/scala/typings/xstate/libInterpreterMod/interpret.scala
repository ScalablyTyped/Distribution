package typings.xstate.libInterpreterMod

import typings.std.Partial
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InterpreterOptions
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/interpreter", "interpret")
@js.native
object interpret extends js.Object {
  def apply[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): Interpreter[TContext, TStateSchema, TEvent] = js.native
}

