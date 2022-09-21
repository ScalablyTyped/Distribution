package typings.unorderedArrayRemove

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Efficiently remove an element from an unordered array without doing a splice.
    *
    * This works by popping the last element (which is fast because it doesn't need
    * shift all array elements) and overwriting the removed index with this element.
    *
    * @param array The array to remove the element at index.
    * @param index The index to remove the element at.
    * @returns The removed element or `undefined` in case the index was out of bounds.
    *
    * @example
    * import remove = require('unordered-array-remove');
    *
    * const list = ['a', 'b', 'c', 'd', 'e'];
    * remove(list, 2); // remove 'c'
    * console.log(list); // returns ['a', 'b', 'e', 'd'] (no 'c')
    */
  inline def apply[T](array: js.Array[T], index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @JSImport("unordered-array-remove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
