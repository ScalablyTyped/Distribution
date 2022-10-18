package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeDefinition<TContext, TStateSchema['states'][K] & {}, TEvent>}
  }}}
  */
@js.native
trait StatesDefinition[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] extends StObject
