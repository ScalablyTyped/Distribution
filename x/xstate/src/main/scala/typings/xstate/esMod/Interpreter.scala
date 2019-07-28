package typings.xstate.esMod

import typings.std.Partial
import typings.xstate.Fn_Machine
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.InterpreterOptions
import typings.xstate.esTypesMod.StateMachine
import typings.xstate.esTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es", "Interpreter")
@js.native
class Interpreter[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] protected ()
  extends typings.xstate.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] {
  /**
    * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
    *
    * @param machine The machine to be interpreted
    * @param options Interpreter options
    */
  def this(machine: StateMachine[TContext, TStateSchema, TEvent]) = this()
  def this(machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]) = this()
}

/* static members */
@JSImport("xstate/es", "Interpreter")
@js.native
object Interpreter extends js.Object {
  /**
    * The default interpreter options:
    *
    * - `clock` uses the global `setTimeout` and `clearTimeout` functions
    * - `logger` uses the global `console.log()` method
    */
  var defaultOptions: InterpreterOptions = js.native
  @JSName("interpret")
  var interpret_Original: Fn_Machine = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): typings.xstate.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): typings.xstate.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
}

