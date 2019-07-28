package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTestUnderscoreUtilMod.DoneFn
import typings.atTensorflowTfjsDashCore.distTypesMod.RecursiveArray
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typings.atTensorflowTfjsDashCore.distTypesMod.TypedArray
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeNumbers.`0DOT001`
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeNumbers.`0DOT1`
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "test_util")
@js.native
object testUnderscoreUtilNs extends js.Object {
  val TEST_EPSILON_FLOAT16: `0DOT1` = js.native
  def expectArrayBuffersEqual(actual: ArrayBuffer, expected: ArrayBuffer): Unit = js.native
  def expectArraysClose(actual: Double, expected: Double): Unit = js.native
  def expectArraysClose(actual: Double, expected: Double, epsilon: Double): Unit = js.native
  def expectArraysClose(actual: Double, expected: RecursiveArray[Double]): Unit = js.native
  def expectArraysClose(actual: Double, expected: RecursiveArray[Double], epsilon: Double): Unit = js.native
  def expectArraysClose(actual: Double, expected: TypedArray): Unit = js.native
  def expectArraysClose(actual: Double, expected: TypedArray, epsilon: Double): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: Double): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: Double, epsilon: Double): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: RecursiveArray[Double]): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: RecursiveArray[Double], epsilon: Double): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: TypedArray): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: TypedArray, epsilon: Double): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: Double): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: Double, epsilon: Double): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: RecursiveArray[Double]): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: RecursiveArray[Double], epsilon: Double): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: TypedArray): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: TypedArray, epsilon: Double): Unit = js.native
  def expectArraysEqual(actual: TensorLike, expected: TensorLike): Unit = js.native
  def expectNumbersClose(a: Double, e: Double): Unit = js.native
  def expectNumbersClose(a: Double, e: Double, epsilon: Double): Unit = js.native
  def expectPromiseToFail(fn: js.Function0[js.Promise[js.Object]], done: DoneFn): Unit = js.native
  def expectValuesInRange(actual: js.Array[Double], low: Double, high: Double): Unit = js.native
  def expectValuesInRange(actual: TypedArray, low: Double, high: Double): Unit = js.native
  def testEpsilon(): `0DOT001` | `0DOT1` = js.native
}

