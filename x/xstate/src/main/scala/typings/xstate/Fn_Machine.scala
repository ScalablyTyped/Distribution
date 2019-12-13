package typings.xstate

import typings.std.Partial
import typings.xstate.libInterpreterMod.Interpreter
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InterpreterOptions
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.StateSchema
import typings.xstate.libTypesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Machine extends js.Object {
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent, Typestate[TContext]]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    machine: StateMachine[TContext, TStateSchema, TEvent, Typestate[TContext]],
    options: Partial[InterpreterOptions]
  ): Interpreter[TContext, TStateSchema, TEvent] = js.native
}

