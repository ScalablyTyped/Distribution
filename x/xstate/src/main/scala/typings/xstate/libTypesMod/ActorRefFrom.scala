package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  xstate.xstate/lib/types.ReturnTypeOrValue<T> extends infer R ? R extends xstate.xstate/lib/types.StateMachine<infer TContext, any, infer TEvent, infer TTypestate, any, any, infer TResolvedTypesMeta> ? xstate.xstate/lib/types.ActorRefWithDeprecatedState<TContext, TEvent, TTypestate, xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends false ? xstate.xstate/lib/typegenTypes.MarkAllImplementationsAsProvided<TResolvedTypesMeta> : TResolvedTypesMeta> : R extends std.Promise<infer U> ? xstate.xstate/lib/types.ActorRef<never, U> : R extends xstate.xstate/lib/types.Behavior<infer TEvent, infer TEmitted> ? xstate.xstate/lib/types.ActorRef<TEvent, TEmitted> : never : never
  }}}
  */
@js.native
trait ActorRefFrom[T] extends StObject
