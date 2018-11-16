package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ArrayUtilities")
@js.native
class ArrayUtilities ()
  extends typescriptDashServicesLib.TypeScriptNs.ArrayUtilities

@JSImport("typescript-services", "ArrayUtilities")
@js.native
object ArrayUtilities extends js.Object {
  def all[T](array: js.Array[T], func: js.Function1[/* v */ T, scala.Boolean]): scala.Boolean = js.native
  def any[T](array: js.Array[T], func: js.Function1[/* v */ T, scala.Boolean]): scala.Boolean = js.native
  def binarySearch(array: js.Array[scala.Double], value: scala.Double): scala.Double = js.native
  def contains[T](array: js.Array[T], value: T): scala.Boolean = js.native
  def copy[T](
    sourceArray: js.Array[T],
    sourceIndex: scala.Double,
    destinationArray: js.Array[T],
    destinationIndex: scala.Double,
    length: scala.Double
  ): scala.Unit = js.native
  def createArray[T](length: scala.Double, defaultValue: js.Any): js.Array[T] = js.native
  def distinct[T](array: js.Array[T]): js.Array[T] = js.native
  def distinct[T](array: js.Array[T], equalsFn: js.Function2[/* a */ T, /* b */ T, scala.Boolean]): js.Array[T] = js.native
  def first[T](array: js.Array[T]): T = js.native
  def first[T](array: js.Array[T], func: js.Function2[/* v */ T, /* index */ scala.Double, scala.Boolean]): T = js.native
  def firstOrDefault[T](array: js.Array[T], func: js.Function2[/* v */ T, /* index */ scala.Double, scala.Boolean]): T = js.native
  def groupBy[T](array: js.Array[T], func: js.Function1[/* v */ T, java.lang.String]): js.Any = js.native
  def grow[T](array: js.Array[T], length: scala.Double, defaultValue: T): scala.Unit = js.native
  def indexOf[T](array: js.Array[T], predicate: js.Function1[/* v */ T, scala.Boolean]): scala.Double = js.native
  def isArray(value: js.Any): scala.Boolean = js.native
  def last[T](array: js.Array[T]): T = js.native
  def lastOrDefault[T](array: js.Array[T], predicate: js.Function2[/* v */ T, /* index */ scala.Double, scala.Boolean]): T = js.native
  def max[T](array: js.Array[T], func: js.Function1[/* v */ T, scala.Double]): scala.Double = js.native
  def min[T](array: js.Array[T], func: js.Function1[/* v */ T, scala.Double]): scala.Double = js.native
  def select[T, S](values: js.Array[T], func: js.Function1[/* v */ T, S]): js.Array[S] = js.native
  def sequenceEquals[T](
    array1: js.Array[T],
    array2: js.Array[T],
    equals: js.Function2[/* v1 */ T, /* v2 */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def sum[T](array: js.Array[T], func: js.Function1[/* v */ T, scala.Double]): scala.Double = js.native
  def where[T](values: js.Array[T], func: js.Function1[/* v */ T, scala.Boolean]): js.Array[T] = js.native
}

