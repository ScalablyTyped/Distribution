package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  xstate.xstate/lib/types.ReturnTypeOrValue<T> extends infer R ? R extends xstate.xstate/lib/types.StateMachine<infer _, infer __, infer TEvent, infer ___, infer ____, infer _____, infer ______> ? TEvent : R extends xstate.xstate/lib/model.types.Model<infer _, infer TEvent, infer __, infer ___> ? TEvent : R extends xstate.xstate/lib/State.State<infer _, infer TEvent, infer __, infer ___, infer ____> ? TEvent : R extends xstate.xstate/lib/interpreter.Interpreter<infer _, infer __, infer TEvent, infer ___, infer ____> ? TEvent : R extends xstate.xstate/lib/types.ActorRef<infer TEvent, infer _> ? TEvent : never : never
  }}}
  */
@js.native
trait ResolveEventType[T] extends StObject
