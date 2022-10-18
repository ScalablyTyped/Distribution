package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.avg
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.int32
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.max
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv3DInfo
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsPoolUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/pool_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxPool3dPositions(xBuf: TensorBuffer[Rank, DataType], convInfo: Conv3DInfo): TensorBuffer[Rank, DataType] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool3dPositions")(xBuf.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[Rank, DataType]]
  
  inline def maxPoolPositions(xValues: TypedArray, xShape: js.Array[Double], dtype: DataType, convInfo: Conv2DInfo): TensorBuffer[Rank, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolPositions")(xValues.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[Rank, int32]]
  inline def maxPoolPositions(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    convInfo: Conv2DInfo,
    flattenPositions: Boolean
  ): TensorBuffer[Rank, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolPositions")(xValues.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any], flattenPositions.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[Rank, int32]]
  inline def maxPoolPositions(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    convInfo: Conv2DInfo,
    flattenPositions: Boolean,
    includeBatchInIndex: Boolean
  ): TensorBuffer[Rank, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolPositions")(xValues.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any], flattenPositions.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[Rank, int32]]
  inline def maxPoolPositions(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    convInfo: Conv2DInfo,
    flattenPositions: Unit,
    includeBatchInIndex: Boolean
  ): TensorBuffer[Rank, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolPositions")(xValues.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any], flattenPositions.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[Rank, int32]]
  
  inline def pool(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    strides: js.Array[Double],
    convInfo: Conv2DInfo,
    poolType: max | avg
  ): TensorBuffer[Rank, DataType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool")(xValues.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any], poolType.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[Rank, DataType]]
  
  inline def pool3d(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    strides: js.Array[Double],
    convInfo: Conv3DInfo,
    poolType: max | avg
  ): TensorBuffer[Rank, DataType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(xValues.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any], poolType.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[Rank, DataType]]
}
