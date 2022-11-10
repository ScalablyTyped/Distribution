package typings.tsXor

import typings.tsXor.distTypesWithoutDottypeMod.Without
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesXorDottypeMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T | U extends object ? ts-xor.ts-xor/dist/types/Without.type.Without<T, U> & U | ts-xor.ts-xor/dist/types/Without.type.Without<U, T> & T : T | U
    }}}
    */
  type XOR[T, U] = ((Without[T, U]) & U) | ((Without[U, T]) & T)
}
