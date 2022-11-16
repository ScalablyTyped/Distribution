package typings.typeFest

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMultidimensionalArrayMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    number extends Dimensions ? type-fest.type-fest/source/multidimensional-array.Recursive<Element> : type-fest.type-fest/source/internal.IsEqual<Dimensions, 0> extends true ? Element : std.Array<type-fest.type-fest/source/multidimensional-array.MultidimensionalArray<Element, type-fest.type-fest/source/internal.Subtract<Dimensions, 1>>>
    }}}
    */
  type MultidimensionalArray[Element, Dimensions /* <: Double */] = Element
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Recursive = std.Array<type-fest.type-fest/source/multidimensional-array.Recursive<T>>
  }}}
  to avoid circular code involving: 
  - type-fest.type-fest/source/multidimensional-array.Recursive
  */
  @js.native
  trait Recursive[T]
    extends StObject
       with Array[Recursive[T]]
}
