package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", JSImport.Namespace)
@js.native
object randUtilMod extends js.Object {
  def expectArrayInMeanStdRange(actual: js.Array[Double], expectedMean: Double, expectedStdDev: Double): Unit = js.native
  def expectArrayInMeanStdRange(actual: js.Array[Double], expectedMean: Double, expectedStdDev: Double, epsilon: Double): Unit = js.native
  def expectArrayInMeanStdRange(actual: TypedArray, expectedMean: Double, expectedStdDev: Double): Unit = js.native
  def expectArrayInMeanStdRange(actual: TypedArray, expectedMean: Double, expectedStdDev: Double, epsilon: Double): Unit = js.native
  def jarqueBeraNormalityTest(values: js.Array[Double]): Unit = js.native
  def jarqueBeraNormalityTest(values: TypedArray): Unit = js.native
}

