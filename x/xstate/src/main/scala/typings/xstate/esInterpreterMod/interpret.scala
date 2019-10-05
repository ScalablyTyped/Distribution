package typings.xstate.esInterpreterMod

import typings.std.Partial
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.InterpreterOptions
import typings.xstate.esTypesMod.StateMachine
import typings.xstate.esTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/interpreter", "interpret")
@js.native
object interpret extends js.Object {
  def apply[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): Interpreter[TContext, TStateSchema, TEvent] = js.native
}

