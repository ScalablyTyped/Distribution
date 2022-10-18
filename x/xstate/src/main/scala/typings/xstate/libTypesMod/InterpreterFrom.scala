package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  xstate.xstate/lib/types.ReturnTypeOrValue<T> extends xstate.xstate/lib/types.StateMachine<infer TContext, infer TStateSchema, infer TEvent, infer TTypestate, any, any, infer TResolvedTypesMeta> ? xstate.xstate/lib/interpreter.Interpreter<TContext, TStateSchema, TEvent, TTypestate, xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends false ? xstate.xstate/lib/typegenTypes.MarkAllImplementationsAsProvided<TResolvedTypesMeta> : TResolvedTypesMeta> : never
  }}}
  */
@js.native
trait InterpreterFrom[T /* <: AnyStateMachine | (js.Function1[/* repeated */ Any, AnyStateMachine]) */] extends StObject
