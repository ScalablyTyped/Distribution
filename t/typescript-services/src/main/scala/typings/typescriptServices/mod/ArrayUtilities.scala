package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ArrayUtilities")
@js.native
class ArrayUtilities ()
  extends StObject
     with typings.typescriptServices.TypeScript.ArrayUtilities
object ArrayUtilities {
  
  @JSImport("typescript-services", "ArrayUtilities")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def all[T](array: js.Array[T], func: js.Function1[/* v */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(array.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def any[T](array: js.Array[T], func: js.Function1[/* v */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(array.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def binarySearch(array: js.Array[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def contains[T](array: js.Array[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def copy[T](
    sourceArray: js.Array[T],
    sourceIndex: Double,
    destinationArray: js.Array[T],
    destinationIndex: Double,
    length: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(sourceArray.asInstanceOf[js.Any], sourceIndex.asInstanceOf[js.Any], destinationArray.asInstanceOf[js.Any], destinationIndex.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def createArray[T](length: Double, defaultValue: js.Any): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createArray")(length.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /* static member */
  inline def distinct[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def distinct[T](array: js.Array[T], equalsFn: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(array.asInstanceOf[js.Any], equalsFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /* static member */
  inline def first[T](array: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(array.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def first[T](array: js.Array[T], func: js.Function2[/* v */ T, /* index */ Double, Boolean]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(array.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /* static member */
  inline def firstOrDefault[T](array: js.Array[T], func: js.Function2[/* v */ T, /* index */ Double, Boolean]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("firstOrDefault")(array.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /* static member */
  inline def groupBy[T](array: js.Array[T], func: js.Function1[/* v */ T, String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(array.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def grow[T](array: js.Array[T], length: Double, defaultValue: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("grow")(array.asInstanceOf[js.Any], length.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def indexOf[T](array: js.Array[T], predicate: js.Function1[/* v */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def isArray(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def last[T](array: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(array.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /* static member */
  inline def lastOrDefault[T](array: js.Array[T], predicate: js.Function2[/* v */ T, /* index */ Double, Boolean]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lastOrDefault")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /* static member */
  inline def max[T](array: js.Array[T], func: js.Function1[/* v */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def min[T](array: js.Array[T], func: js.Function1[/* v */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def select[T, S](values: js.Array[T], func: js.Function1[/* v */ T, S]): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(values.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
  
  /* static member */
  inline def sequenceEquals[T](array1: js.Array[T], array2: js.Array[T], equals: js.Function2[/* v1 */ T, /* v2 */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEquals")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], equals.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def sum[T](array: js.Array[T], func: js.Function1[/* v */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(array.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def where[T](values: js.Array[T], func: js.Function1[/* v */ T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(values.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
