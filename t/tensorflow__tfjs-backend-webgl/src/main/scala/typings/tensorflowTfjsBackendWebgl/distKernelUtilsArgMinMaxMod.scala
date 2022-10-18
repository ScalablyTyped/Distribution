package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelUtilsArgMinMaxMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/arg_min_max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argMinMaxReduce(backend: MathBackendWebGL, x: TensorInfo, axis: Double, reduceType: min | max): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("argMinMaxReduce")(backend.asInstanceOf[js.Any], x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], reduceType.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}
