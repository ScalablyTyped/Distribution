package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.float32
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsGatherNdImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/GatherNd_Impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gatherNdImpl_float32[R /* <: Rank */](
    indicesData: TypedArray,
    paramsBuf: TensorBuffer[R, float32],
    dtype: DataType,
    numSlices: Double,
    sliceRank: Double,
    sliceSize: Double,
    strides: js.Array[Double],
    paramsShape: js.Array[Double],
    paramsSize: Double
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatherNdImpl")(indicesData.asInstanceOf[js.Any], paramsBuf.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], numSlices.asInstanceOf[js.Any], sliceRank.asInstanceOf[js.Any], sliceSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], paramsShape.asInstanceOf[js.Any], paramsSize.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
}
