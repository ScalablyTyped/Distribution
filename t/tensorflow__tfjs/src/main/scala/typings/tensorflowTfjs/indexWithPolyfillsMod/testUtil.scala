package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.std.ArrayBuffer
import typings.tensorflowTfjs.tensorflowTfjsNumbers.`0.001`
import typings.tensorflowTfjs.tensorflowTfjsNumbers.`0.1`
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.testUtilMod.DoneFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtil {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "test_util")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "test_util.TEST_EPSILON_FLOAT16")
  @js.native
  val TEST_EPSILON_FLOAT16: /* 0.1 */ Double = js.native
  
  inline def expectArrayBuffersEqual(actual: ArrayBuffer, expected: ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArrayBuffersEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectArraysClose(actual: Double, expected: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: Double, expected: Double, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: Double, expected: RecursiveArray[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: Double, expected: RecursiveArray[Double], epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: Double, expected: TypedArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: Double, expected: TypedArray, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: RecursiveArray[Double], expected: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: RecursiveArray[Double], expected: Double, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: RecursiveArray[Double], expected: RecursiveArray[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: RecursiveArray[Double], expected: RecursiveArray[Double], epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: RecursiveArray[Double], expected: TypedArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: RecursiveArray[Double], expected: TypedArray, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: TypedArray, expected: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: TypedArray, expected: Double, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: TypedArray, expected: RecursiveArray[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: TypedArray, expected: RecursiveArray[Double], epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: TypedArray, expected: TypedArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArraysClose(actual: TypedArray, expected: TypedArray, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysClose")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectArraysEqual(actual: TensorLike, expected: TensorLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArraysEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectNumbersClose(a: Double, e: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNumbersClose")(a.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectNumbersClose(a: Double, e: Double, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNumbersClose")(a.asInstanceOf[js.Any], e.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectPromiseToFail(fn: js.Function0[js.Promise[js.Object]], done: DoneFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectPromiseToFail")(fn.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectValuesInRange(actual: js.Array[Double], low: Double, high: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectValuesInRange")(actual.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectValuesInRange(actual: TypedArray, low: Double, high: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectValuesInRange")(actual.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testEpsilon(): `0.001` | `0.1` = ^.asInstanceOf[js.Dynamic].applyDynamic("testEpsilon")().asInstanceOf[`0.001` | `0.1`]
}
