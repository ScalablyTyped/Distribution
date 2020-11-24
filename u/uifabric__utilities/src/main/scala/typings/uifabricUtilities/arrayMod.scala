package typings.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  
  def addElementAtIndex[T](array: js.Array[T], index: Double, itemToAdd: T): js.Array[T] = js.native
  
  def arraysEqual[T](array1: js.Array[T], array2: js.Array[T]): Boolean = js.native
  
  def createArray[T](size: Double, getItem: js.Function1[/* index */ Double, T]): js.Array[T] = js.native
  
  def find[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean]): Double = js.native
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean], fromIndex: Double): Double = js.native
  
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  
  def removeIndex[T](array: js.Array[T], index: Double): js.Array[T] = js.native
  
  def replaceElement[T](array: js.Array[T], newElement: T, index: Double): js.Array[T] = js.native
  
  def toMatrix[T](items: js.Array[T], columnCount: Double): js.Array[js.Array[T]] = js.native
}
