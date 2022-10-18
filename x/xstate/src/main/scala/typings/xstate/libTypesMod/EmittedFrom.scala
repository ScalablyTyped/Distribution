package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  xstate.xstate/lib/types.ReturnTypeOrValue<T> extends infer R ? R extends xstate.xstate/lib/interpreter.Interpreter<infer _, infer __, infer ___, infer ____, infer _____> ? R['initialState'] : R extends xstate.xstate/lib/types.ActorRef<infer _, infer TEmitted> ? TEmitted : R extends xstate.xstate/lib/types.Behavior<infer _, infer TEmitted> ? TEmitted : R extends xstate.xstate/lib/types.ActorContext<infer _, infer TEmitted> ? TEmitted : never : never
  }}}
  */
@js.native
trait EmittedFrom[T] extends StObject
