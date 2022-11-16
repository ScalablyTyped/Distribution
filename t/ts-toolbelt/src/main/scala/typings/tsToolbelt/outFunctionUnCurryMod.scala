package typings.tsToolbelt

import typings.tsToolbelt.outFunctionCurryMod.Curry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFunctionUnCurryMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    F extends ts-toolbelt.ts-toolbelt/out/Function/Curry.Curry<infer UF> ? UF : never
    }}}
    */
  @js.native
  trait UnCurry[F /* <: Curry[Any] */] extends StObject
}
