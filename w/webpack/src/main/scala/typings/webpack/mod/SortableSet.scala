package typings.webpack.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableSet[T]
  extends StObject
     with Set[T] {
  
  /**
  	 * Get data from cache
  	 */
  def getFromCache[R](fn: js.Function1[/* arg0 */ SortableSet[T], R]): R = js.native
  
  /**
  	 * Get data from cache (ignoring sorting)
  	 */
  def getFromUnorderedCache[R](fn: js.Function1[/* arg0 */ SortableSet[T], R]): R = js.native
  
  def sort(): SortableSet[T] = js.native
  
  /**
  	 * Sort with a comparer function
  	 */
  def sortWith(sortFn: js.Function2[/* arg0 */ T, /* arg1 */ T, Double]): Unit = js.native
  
  def toJSON(): js.Array[T] = js.native
}
