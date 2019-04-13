package typings
package xstateLib.xstateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", "Interpreter")
@js.native
class Interpreter[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */] protected ()
  extends xstateLib.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] {
  /**
    * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
    *
    * @param machine The machine to be interpreted
    * @param options Interpreter options
    */
  def this(machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent]) = this()
  def this(machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent], options: stdLib.Partial[xstateLib.libTypesMod.InterpreterOptions]) = this()
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
  var defaultOptions: xstateLib.libTypesMod.InterpreterOptions = js.native
  @JSName("interpret")
  var interpret_Original: xstateLib.Anon_Machine = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent]): xstateLib.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.libTypesMod.InterpreterOptions]
  ): xstateLib.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
}

