package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof TParams ]:? (context : TContext, event : TEvent): TParams[K] | TParams[K]}
  }}}
  */
@js.native
trait PropertyMapper[TContext, TEvent /* <: EventObject */, TParams /* <: js.Object */] extends StObject
