package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "describeMathCPU")
  @js.native
  def describeMathCPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "describeMathCPUAndGPU")
  @js.native
  def describeMathCPUAndGPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "describeMathGPU")
  @js.native
  def describeMathGPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "expectNoLeakedTensors")
  @js.native
  def expectNoLeakedTensors(testFunc: js.Function0[_], numNewTensors: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "expectTensorsClose")
  @js.native
  def expectTensorsClose(actual: js.Array[Double], expected: js.Array[Double]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "expectTensorsClose")
  @js.native
  def expectTensorsClose(actual: js.Array[Double], expected: js.Array[Double], epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "expectTensorsClose")
  @js.native
  def expectTensorsClose(actual: js.Array[Double], expected: Tensor[Rank]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "expectTensorsClose")
  @js.native
  def expectTensorsClose(actual: js.Array[Double], expected: Tensor[Rank], epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "expectTensorsClose")
  @js.native
  def expectTensorsClose(actual: Tensor[Rank], expected: js.Array[Double]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "expectTensorsClose")
  @js.native
  def expectTensorsClose(actual: Tensor[Rank], expected: js.Array[Double], epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "expectTensorsClose")
  @js.native
  def expectTensorsClose(actual: Tensor[Rank], expected: Tensor[Rank]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "expectTensorsClose")
  @js.native
  def expectTensorsClose(actual: Tensor[Rank], expected: Tensor[Rank], epsilon: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", "expectTensorsValuesInRange")
  @js.native
  def expectTensorsValuesInRange(actual: Tensor[Rank], low: Double, high: Double): Unit = js.native
}
