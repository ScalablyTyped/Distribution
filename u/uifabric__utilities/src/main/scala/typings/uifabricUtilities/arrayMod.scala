package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("@uifabric/utilities/lib/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addElementAtIndex[T](array: js.Array[T], index: Double, itemToAdd: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addElementAtIndex")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], itemToAdd.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def arraysEqual[T](array1: js.Array[T], array2: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def createArray[T](size: Double, getItem: js.Function1[/* index */ Double, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createArray")(size.asInstanceOf[js.Any], getItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def find[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(array.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean], fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def removeIndex[T](array: js.Array[T], index: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIndex")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def replaceElement[T](array: js.Array[T], newElement: T, index: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(array.asInstanceOf[js.Any], newElement.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def toMatrix[T](items: js.Array[T], columnCount: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toMatrix")(items.asInstanceOf[js.Any], columnCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
}
