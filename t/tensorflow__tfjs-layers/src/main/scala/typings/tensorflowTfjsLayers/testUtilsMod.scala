package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", JSImport.Namespace)
@js.native
object testUtilsMod extends js.Object {
  def describeMathCPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  def describeMathCPUAndGPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  def describeMathGPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  def expectNoLeakedTensors(testFunc: js.Function0[_], numNewTensors: Double): Unit = js.native
  def expectTensorsClose(actual: js.Array[Double], expected: js.Array[Double]): Unit = js.native
  def expectTensorsClose(actual: js.Array[Double], expected: js.Array[Double], epsilon: Double): Unit = js.native
  def expectTensorsClose(actual: js.Array[Double], expected: Tensor_[Rank]): Unit = js.native
  def expectTensorsClose(actual: js.Array[Double], expected: Tensor_[Rank], epsilon: Double): Unit = js.native
  def expectTensorsClose(actual: Tensor_[Rank], expected: js.Array[Double]): Unit = js.native
  def expectTensorsClose(actual: Tensor_[Rank], expected: js.Array[Double], epsilon: Double): Unit = js.native
  def expectTensorsClose(actual: Tensor_[Rank], expected: Tensor_[Rank]): Unit = js.native
  def expectTensorsClose(actual: Tensor_[Rank], expected: Tensor_[Rank], epsilon: Double): Unit = js.native
  def expectTensorsValuesInRange(actual: Tensor_[Rank], low: Double, high: Double): Unit = js.native
}

