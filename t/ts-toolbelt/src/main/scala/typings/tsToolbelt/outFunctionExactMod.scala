package typings.tsToolbelt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFunctionExactMod {
  
  /**
    * Force `A` to comply with `W`. `A` must be a shape of `W`. In other words, `A`
    * must extend `W` and have the same properties - no more, no less.
    * @param A
    * @param W
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    W extends unknown ? A extends W ? A extends ts-toolbelt.ts-toolbelt/out/Function/_Internal.Narrowable ? A : {[ K in keyof A ]: K extends keyof W? ts-toolbelt.ts-toolbelt/out/Function/Exact.Exact<A[K], W[K]> : never} : W : never
    }}}
    */
  @js.native
  trait Exact[A, W] extends StObject
}
