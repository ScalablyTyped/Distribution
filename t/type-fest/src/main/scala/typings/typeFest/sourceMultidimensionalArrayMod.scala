package typings.typeFest

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMultidimensionalArrayMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    number extends Dimensions ? type-fest.type-fest/source/multidimensional-array.Recursive<Element> : type-fest.type-fest/source/internal.IsEqual<Dimensions, 0> extends true ? Element : std.Array<type-fest.type-fest/source/multidimensional-array.MultidimensionalArray<Element, type-fest.type-fest/source/internal.Subtract<Dimensions, 1>>>
    }}}
    */
  @js.native
  trait MultidimensionalArray[Element, Dimensions /* <: Double */] extends StObject
  
  @js.native
  trait Recursive[T]
    extends StObject
       with Array[Recursive[T]]
}
