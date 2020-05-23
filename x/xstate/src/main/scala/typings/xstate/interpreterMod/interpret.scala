package typings.xstate.interpreterMod

import typings.xstate.anon.PartialInterpreterOptions
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/interpreter", "interpret")
@js.native
object interpret extends js.Object {
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: PartialInterpreterOptions
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
}

