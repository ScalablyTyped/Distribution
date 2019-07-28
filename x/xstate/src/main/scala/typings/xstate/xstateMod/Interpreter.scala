package typings.xstate.xstateMod

import typings.std.Partial
import typings.xstate.Fn_MachineOptions
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InterpreterOptions
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", "Interpreter")
@js.native
class Interpreter[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] protected ()
  extends typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] {
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
@JSImport("xstate", "Interpreter")
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
  var interpret_Original: Fn_MachineOptions = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
}

