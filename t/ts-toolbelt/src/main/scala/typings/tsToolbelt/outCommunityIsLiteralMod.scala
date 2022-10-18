package typings.tsToolbelt

import typings.tsToolbelt.outAnyExtendsMod.Extends
import typings.tsToolbelt.outBooleanAndMod.And
import typings.tsToolbelt.outBooleanOrMod.Or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outCommunityIsLiteralMod {
  
  type IsLiteral[A /* <: Any */, kind /* <: Kind */] = And[Or[IsStringLiteral[A], IsNumberLiteral[A]], Extends[A, kind]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends number ? number extends A ? 0 : 1 : 0
    }}}
    */
  @js.native
  trait IsNumberLiteral[A /* <: Any */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends string ? string extends A ? 0 : 1 : 0
    }}}
    */
  @js.native
  trait IsStringLiteral[A /* <: Any */] extends StObject
  
  type Kind = String | Double
}
