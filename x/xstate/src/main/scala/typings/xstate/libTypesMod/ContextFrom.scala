package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  xstate.xstate/lib/types.ReturnTypeOrValue<T> extends infer R ? R extends xstate.xstate/lib/types.StateMachine<infer TContext, infer _, infer __, infer ___, infer ____, infer _____, infer ______> ? TContext : R extends xstate.xstate/lib/model.types.Model<infer TContext, infer _, infer __, infer ___> ? TContext : R extends xstate.xstate/lib/State.State<infer TContext, infer _, infer __, infer ___, infer ____> ? TContext : R extends xstate.xstate/lib/interpreter.Interpreter<infer TContext, infer _, infer __, infer ___, infer ____> ? TContext : never : never
  }}}
  */
@js.native
trait ContextFrom[T] extends StObject
