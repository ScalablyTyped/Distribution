package typings.tsToolbelt

import typings.tsToolbelt.outAnyExtendsMod.Extends
import typings.tsToolbelt.outBooleanAndMod.And
import typings.tsToolbelt.outBooleanOrMod.Or
import typings.tsToolbelt.tsToolbeltInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outCommunityIsLiteralMod {
  
  type IsLiteral[A /* <: Any */, kind /* <: Kind */] = And[Or[IsStringLiteral[A], IsNumberLiteral[A]], Extends[A, kind]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends number ? number extends A ? 0 : 1 : 0
    }}}
    */
  type IsNumberLiteral[A /* <: Any */] = `0`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends string ? string extends A ? 0 : 1 : 0
    }}}
    */
  type IsStringLiteral[A /* <: Any */] = `0`
  
  type Kind = String | Double
}
