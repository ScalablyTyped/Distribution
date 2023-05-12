package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsBackendWebgl.distCumGpuMod.CumOpType
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsCumImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Cum_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cumImpl(
    op: CumOpType,
    x: TensorInfo,
    backend: MathBackendWebGL,
    axis: Double,
    exclusive: Boolean,
    reverse: Boolean
  ): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("cumImpl")(op.asInstanceOf[js.Any], x.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}
