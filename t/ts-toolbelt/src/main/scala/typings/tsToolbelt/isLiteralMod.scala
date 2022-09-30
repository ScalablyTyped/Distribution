package typings.tsToolbelt

import typings.tsToolbelt.andMod.And
import typings.tsToolbelt.extendsMod.Extends
import typings.tsToolbelt.orMod.Or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isLiteralMod {
  
  type IsLiteral[A /* <: Any */, kind /* <: Kind */] = And[Or[IsStringLiteral[A], IsNumberLiteral[A]], Extends[A, kind]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsToolbelt.tsToolbeltInts.`0`
    - typings.tsToolbelt.tsToolbeltInts.`1`
  */
  trait IsNumberLiteral[A /* <: Any */] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsToolbelt.tsToolbeltInts.`0`
    - typings.tsToolbelt.tsToolbeltInts.`1`
  */
  trait IsStringLiteral[A /* <: Any */] extends StObject
  
  type Kind = String | Double
}
