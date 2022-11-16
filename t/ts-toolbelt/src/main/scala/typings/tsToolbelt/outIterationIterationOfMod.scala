package typings.tsToolbelt

import typings.tsToolbelt.tsToolbeltStrings.Plussign
import typings.tsToolbelt.tsToolbeltStrings.__
import typings.tsToolbelt.tsToolbeltStrings.`-_`
import typings.tsToolbelt.tsToolbeltStrings.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outIterationIterationOfMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    / * template literal string: ${N} * / string extends keyof ts-toolbelt.ts-toolbelt/out/Iteration/Iteration.IterationMap ? ts-toolbelt.ts-toolbelt/out/Iteration/Iteration.IterationMap[/ * template literal string: ${N} * / string] : [number, '-' | '0' | '+', '__', '__', '__']
    }}}
    */
  type IterationOf[N /* <: Double */] = js.Tuple5[Double, `-_` | `0` | Plussign, __, __, __]
}
