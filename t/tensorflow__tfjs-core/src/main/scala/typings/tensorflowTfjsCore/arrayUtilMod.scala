package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/array_util", "binaryInsert")
  @js.native
  def binaryInsert[T](arr: js.Array[T], element: T): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/backends/array_util", "binaryInsert")
  @js.native
  def binaryInsert[T](arr: js.Array[T], element: T, comparator: js.Function2[/* a */ T, /* b */ T, Double]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/array_util", "binarySearch")
  @js.native
  def binarySearch[T](arr: js.Array[T], target: T): Double = js.native
  @JSImport("@tensorflow/tfjs-core/dist/backends/array_util", "binarySearch")
  @js.native
  def binarySearch[T](arr: js.Array[T], target: T, comparator: js.Function2[/* a */ T, /* b */ T, Double]): Double = js.native
}
