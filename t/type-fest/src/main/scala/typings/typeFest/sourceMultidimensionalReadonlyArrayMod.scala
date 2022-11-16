package typings.typeFest

import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMultidimensionalReadonlyArrayMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    number extends Dimensions ? type-fest.type-fest/source/multidimensional-readonly-array.Recursive<Element> : type-fest.type-fest/source/internal.IsEqual<Dimensions, 0> extends true ? Element : std.ReadonlyArray<type-fest.type-fest/source/multidimensional-readonly-array.MultidimensionalReadonlyArray<Element, type-fest.type-fest/source/internal.Subtract<Dimensions, 1>>>
    }}}
    */
  type MultidimensionalReadonlyArray[Element, Dimensions /* <: Double */] = Element
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Recursive = std.ReadonlyArray<type-fest.type-fest/source/multidimensional-readonly-array.Recursive<T>>
  }}}
  to avoid circular code involving: 
  - type-fest.type-fest/source/multidimensional-readonly-array.Recursive
  */
  @js.native
  trait Recursive[T]
    extends StObject
       with ReadonlyArray[Recursive[T]]
}
