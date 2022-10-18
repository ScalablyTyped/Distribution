package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSumImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Sum_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sumImpl(x: TensorInfo, axis: js.Array[Double], keepDims: Boolean, backend: MathBackendWebGL): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("sumImpl")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
  inline def sumImpl(x: TensorInfo, axis: Double, keepDims: Boolean, backend: MathBackendWebGL): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("sumImpl")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}
