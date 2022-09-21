package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.float32
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bincountImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Bincount_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bincountImpl(
    xVals: TypedArray,
    weightsVals: TypedArray,
    weightsDtype: DataType,
    weightsShape: js.Array[Double],
    size: Double
  ): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("bincountImpl")(xVals.asInstanceOf[js.Any], weightsVals.asInstanceOf[js.Any], weightsDtype.asInstanceOf[js.Any], weightsShape.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
  
  inline def bincountReduceImpl_float32[R /* <: Rank */](xBuf: TensorBuffer[R, float32], weightsBuf: TensorBuffer[R, float32], size: Double): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("bincountReduceImpl")(xBuf.asInstanceOf[js.Any], weightsBuf.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  inline def bincountReduceImpl_float32[R /* <: Rank */](
    xBuf: TensorBuffer[R, float32],
    weightsBuf: TensorBuffer[R, float32],
    size: Double,
    binaryOutput: Boolean
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("bincountReduceImpl")(xBuf.asInstanceOf[js.Any], weightsBuf.asInstanceOf[js.Any], size.asInstanceOf[js.Any], binaryOutput.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
}
