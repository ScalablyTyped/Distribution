package typings.typeFest

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multidimensionalArrayMod {
  
  type MultidimensionalArray[Element, Dimensions /* <: Double */] = js.Array[Any] | Element | Recursive[Element]
  
  @js.native
  trait Recursive[T]
    extends StObject
       with Array[Recursive[T]]
}
