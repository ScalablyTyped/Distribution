package typings.xstate.anon

import typings.xstate.interpreterMod.Interpreter
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InterpreterOptions
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.Typestate
import typings.xstate.xstateStrings.`Some implementations missing`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
    machine: (`Some implementations missing`) | (StateMachine[TContext, TStateSchema, TEvent, TTypestate, Any, Any, TResolvedTypesMeta])
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
    machine: (`Some implementations missing`) | (StateMachine[TContext, TStateSchema, TEvent, TTypestate, Any, Any, TResolvedTypesMeta]),
    options: InterpreterOptions
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = js.native
}
