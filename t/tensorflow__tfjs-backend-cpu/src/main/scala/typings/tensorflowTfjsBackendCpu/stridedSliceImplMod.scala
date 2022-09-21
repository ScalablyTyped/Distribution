package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.float32
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stridedSliceImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StridedSlice_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stridedSliceImpl_float32[R /* <: Rank */](
    outShape: js.Array[Double],
    xBuf: TensorBuffer[R, float32],
    strides: js.Array[Double],
    begin: js.Array[Double]
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("stridedSliceImpl")(outShape.asInstanceOf[js.Any], xBuf.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
}
