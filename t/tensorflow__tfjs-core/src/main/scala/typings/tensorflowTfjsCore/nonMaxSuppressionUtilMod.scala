package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonMaxSuppressionUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/non_max_suppression_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def binaryInsert[T](arr: js.Array[T], element: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryInsert")(arr.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def binaryInsert[T](arr: js.Array[T], element: T, comparator: js.Function2[/* a */ T, /* b */ T, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryInsert")(arr.asInstanceOf[js.Any], element.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def binarySearch[T](arr: js.Array[T], target: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(arr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def binarySearch[T](arr: js.Array[T], target: T, comparator: js.Function2[/* a */ T, /* b */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(arr.asInstanceOf[js.Any], target.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Double]
}
