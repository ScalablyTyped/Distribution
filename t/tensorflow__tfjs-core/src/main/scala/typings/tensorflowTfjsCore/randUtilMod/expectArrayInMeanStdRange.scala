package typings.tensorflowTfjsCore.randUtilMod

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "expectArrayInMeanStdRange")
@js.native
object expectArrayInMeanStdRange extends js.Object {
  def apply(actual: js.Array[Double], expectedMean: Double, expectedStdDev: Double): Unit = js.native
  def apply(actual: js.Array[Double], expectedMean: Double, expectedStdDev: Double, epsilon: Double): Unit = js.native
  def apply(actual: TypedArray, expectedMean: Double, expectedStdDev: Double): Unit = js.native
  def apply(actual: TypedArray, expectedMean: Double, expectedStdDev: Double, epsilon: Double): Unit = js.native
}

