package typings
package xstateLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es", "Interpreter")
@js.native
class Interpreter[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */] protected ()
  extends xstateLib.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] {
  /**
    * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
    *
    * @param machine The machine to be interpreted
    * @param options Interpreter options
    */
  def this(machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent]) = this()
  def this(machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent], options: stdLib.Partial[xstateLib.esTypesMod.InterpreterOptions]) = this()
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
  var defaultOptions: xstateLib.esTypesMod.InterpreterOptions = js.native
  @JSName("interpret")
  var interpret_Original: xstateLib.Fn_Machine = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent]): xstateLib.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.esTypesMod.InterpreterOptions]
  ): xstateLib.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
}

