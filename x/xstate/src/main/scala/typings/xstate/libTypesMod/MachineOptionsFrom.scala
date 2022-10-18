package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  xstate.xstate/lib/types.ReturnTypeOrValue<T> extends xstate.xstate/lib/types.StateMachine<infer TContext, any, infer TEvent, any, any, any, infer TResolvedTypesMeta> ? xstate.xstate/lib/types.InternalMachineOptions<TContext, TEvent, TResolvedTypesMeta, TRequireMissingImplementations, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> : never
  }}}
  */
@js.native
trait MachineOptionsFrom[T /* <: AnyStateMachine | (js.Function1[/* repeated */ Any, AnyStateMachine]) */, TRequireMissingImplementations /* <: Boolean */] extends StObject
