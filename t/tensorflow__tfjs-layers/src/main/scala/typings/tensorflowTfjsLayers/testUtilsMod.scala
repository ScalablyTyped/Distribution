package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def describeMathCPU(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeMathCPU")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def describeMathCPUAndGPU(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeMathCPUAndGPU")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def describeMathCPUAndWebGL2(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeMathCPUAndWebGL2")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def describeMathGPU(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeMathGPU")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def describeMathWebGL2(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeMathWebGL2")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectNoLeakedTensors(testFunc: js.Function0[Any], numNewTensors: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNoLeakedTensors")(testFunc.asInstanceOf[js.Any], numNewTensors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectTensorsClose(actual: js.Array[Double], expected: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectTensorsClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectTensorsClose(actual: js.Array[Double], expected: js.Array[Double], epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectTensorsClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectTensorsClose(actual: js.Array[Double], expected: Tensor[Rank]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectTensorsClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectTensorsClose(actual: js.Array[Double], expected: Tensor[Rank], epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectTensorsClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectTensorsClose(actual: Tensor[Rank], expected: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectTensorsClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectTensorsClose(actual: Tensor[Rank], expected: js.Array[Double], epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectTensorsClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectTensorsClose(actual: Tensor[Rank], expected: Tensor[Rank]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectTensorsClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectTensorsClose(actual: Tensor[Rank], expected: Tensor[Rank], epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectTensorsClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectTensorsValuesInRange(actual: Tensor[Rank], low: Double, high: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectTensorsValuesInRange")(actual.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
