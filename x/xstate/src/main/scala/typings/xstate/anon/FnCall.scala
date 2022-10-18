package typings.xstate.anon

import typings.xstate.libInterpreterMod.Interpreter
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InterpreterOptions
import typings.xstate.libTypesMod.StateSchema
import typings.xstate.libTypesMod.Typestate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
    machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
    machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any,
    options: InterpreterOptions
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = js.native
}
