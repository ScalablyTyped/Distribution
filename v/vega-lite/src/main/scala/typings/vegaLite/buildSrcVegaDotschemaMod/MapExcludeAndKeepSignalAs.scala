package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ P in keyof T ]: vega-typings.vega-typings/types/spec/signal.SignalRef extends T[P]? std.Exclude<T[P], E> | S : std.Exclude<T[P], E>}
  }}}
  */
@js.native
trait MapExcludeAndKeepSignalAs[T, E, S /* <: ExprRef | SignalRef */] extends StObject
