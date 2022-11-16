package typings.tsToolbelt

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationIterationOfMod.IterationOf
import typings.tsToolbelt.outNumberIsPositiveMod._IsPositive
import typings.tsToolbelt.outNumberSubMod._Sub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outNumberGreaterMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    N1 extends unknown ? N2 extends unknown ? ts-toolbelt.ts-toolbelt/out/Number/Greater._Greater<ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<N1>, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<N2>> : never : never
    }}}
    */
  type Greater[N1 /* <: Double */, N2 /* <: Double */] = _Greater[IterationOf[N1], IterationOf[N2]]
  
  type _Greater[N1 /* <: Iteration */, N2 /* <: Iteration */] = _IsPositive[_Sub[N1, N2]]
}
