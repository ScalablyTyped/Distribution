package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsBackendWebgl.cumGpuMod.CumOpType
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cumImplMod {
  
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
