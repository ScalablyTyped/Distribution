package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ArrayUtilities")
@js.native
class ArrayUtilities ()
  extends typings.typescriptServices.TypeScript.ArrayUtilities
object ArrayUtilities {
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.all")
  @js.native
  def all[T](array: js.Array[T], func: js.Function1[/* v */ T, Boolean]): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.any")
  @js.native
  def any[T](array: js.Array[T], func: js.Function1[/* v */ T, Boolean]): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.binarySearch")
  @js.native
  def binarySearch(array: js.Array[Double], value: Double): Double = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.contains")
  @js.native
  def contains[T](array: js.Array[T], value: T): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.copy")
  @js.native
  def copy[T](
    sourceArray: js.Array[T],
    sourceIndex: Double,
    destinationArray: js.Array[T],
    destinationIndex: Double,
    length: Double
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.createArray")
  @js.native
  def createArray[T](length: Double, defaultValue: js.Any): js.Array[T] = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.distinct")
  @js.native
  def distinct[T](array: js.Array[T]): js.Array[T] = js.native
  @JSGlobal("TypeScript.ArrayUtilities.distinct")
  @js.native
  def distinct[T](array: js.Array[T], equalsFn: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Array[T] = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.first")
  @js.native
  def first[T](array: js.Array[T]): T = js.native
  @JSGlobal("TypeScript.ArrayUtilities.first")
  @js.native
  def first[T](array: js.Array[T], func: js.Function2[/* v */ T, /* index */ Double, Boolean]): T = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.firstOrDefault")
  @js.native
  def firstOrDefault[T](array: js.Array[T], func: js.Function2[/* v */ T, /* index */ Double, Boolean]): T = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.groupBy")
  @js.native
  def groupBy[T](array: js.Array[T], func: js.Function1[/* v */ T, String]): js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.grow")
  @js.native
  def grow[T](array: js.Array[T], length: Double, defaultValue: T): Unit = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.indexOf")
  @js.native
  def indexOf[T](array: js.Array[T], predicate: js.Function1[/* v */ T, Boolean]): Double = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.isArray")
  @js.native
  def isArray(value: js.Any): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.last")
  @js.native
  def last[T](array: js.Array[T]): T = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.lastOrDefault")
  @js.native
  def lastOrDefault[T](array: js.Array[T], predicate: js.Function2[/* v */ T, /* index */ Double, Boolean]): T = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.max")
  @js.native
  def max[T](array: js.Array[T], func: js.Function1[/* v */ T, Double]): Double = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.min")
  @js.native
  def min[T](array: js.Array[T], func: js.Function1[/* v */ T, Double]): Double = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.select")
  @js.native
  def select[T, S](values: js.Array[T], func: js.Function1[/* v */ T, S]): js.Array[S] = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.sequenceEquals")
  @js.native
  def sequenceEquals[T](array1: js.Array[T], array2: js.Array[T], equals: js.Function2[/* v1 */ T, /* v2 */ T, Boolean]): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.sum")
  @js.native
  def sum[T](array: js.Array[T], func: js.Function1[/* v */ T, Double]): Double = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArrayUtilities.where")
  @js.native
  def where[T](values: js.Array[T], func: js.Function1[/* v */ T, Boolean]): js.Array[T] = js.native
}
