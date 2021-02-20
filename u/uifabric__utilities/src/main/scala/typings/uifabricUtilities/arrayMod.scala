package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("@uifabric/utilities/lib/array", "addElementAtIndex")
  @js.native
  def addElementAtIndex[T](array: js.Array[T], index: Double, itemToAdd: T): js.Array[T] = js.native
  
  @JSImport("@uifabric/utilities/lib/array", "arraysEqual")
  @js.native
  def arraysEqual[T](array1: js.Array[T], array2: js.Array[T]): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/array", "createArray")
  @js.native
  def createArray[T](size: Double, getItem: js.Function1[/* index */ Double, T]): js.Array[T] = js.native
  
  @JSImport("@uifabric/utilities/lib/array", "find")
  @js.native
  def find[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  
  @JSImport("@uifabric/utilities/lib/array", "findIndex")
  @js.native
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean]): Double = js.native
  @JSImport("@uifabric/utilities/lib/array", "findIndex")
  @js.native
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean], fromIndex: Double): Double = js.native
  
  @JSImport("@uifabric/utilities/lib/array", "flatten")
  @js.native
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  
  @JSImport("@uifabric/utilities/lib/array", "removeIndex")
  @js.native
  def removeIndex[T](array: js.Array[T], index: Double): js.Array[T] = js.native
  
  @JSImport("@uifabric/utilities/lib/array", "replaceElement")
  @js.native
  def replaceElement[T](array: js.Array[T], newElement: T, index: Double): js.Array[T] = js.native
  
  @JSImport("@uifabric/utilities/lib/array", "toMatrix")
  @js.native
  def toMatrix[T](items: js.Array[T], columnCount: Double): js.Array[js.Array[T]] = js.native
}
