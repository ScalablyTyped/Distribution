package typings.xstate.anon

import typings.xstate.interpreterMod.Interpreter
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.Typestate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallMachineOptions extends StObject {
  
  def apply[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: PartialInterpreterOptions
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
}
