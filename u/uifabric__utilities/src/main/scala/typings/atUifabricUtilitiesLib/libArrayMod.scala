package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/array", JSImport.Namespace)
@js.native
object libArrayMod extends js.Object {
  def addElementAtIndex[T](array: js.Array[T], index: scala.Double, itemToAdd: T): js.Array[T] = js.native
  def arraysEqual[T](array1: js.Array[T], array2: js.Array[T]): scala.Boolean = js.native
  def createArray[T](size: scala.Double, getItem: js.Function1[/* index */ scala.Double, T]): js.Array[T] = js.native
  def find[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean]): js.UndefOr[T] = js.native
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean]): scala.Double = js.native
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def removeIndex[T](array: js.Array[T], index: scala.Double): js.Array[T] = js.native
  def replaceElement[T](array: js.Array[T], newElement: T, index: scala.Double): js.Array[T] = js.native
  def toMatrix[T](items: js.Array[T], columnCount: scala.Double): js.Array[js.Array[T]] = js.native
}

