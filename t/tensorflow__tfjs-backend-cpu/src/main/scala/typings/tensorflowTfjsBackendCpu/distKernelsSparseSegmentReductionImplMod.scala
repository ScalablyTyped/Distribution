package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSparseSegmentReductionImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SparseSegmentReduction_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseSegmentReductionImpl(
    input: TypedArray,
    inputShape: js.Array[Double],
    inputDType: DataType,
    indices: TypedArray,
    segmentIds: TypedArray
  ): js.Tuple2[TypedArray, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentReductionImpl")(input.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], inputDType.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TypedArray, js.Array[Double]]]
  inline def sparseSegmentReductionImpl(
    input: TypedArray,
    inputShape: js.Array[Double],
    inputDType: DataType,
    indices: TypedArray,
    segmentIds: TypedArray,
    isMean: Boolean
  ): js.Tuple2[TypedArray, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentReductionImpl")(input.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], inputDType.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], isMean.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TypedArray, js.Array[Double]]]
  inline def sparseSegmentReductionImpl(
    input: TypedArray,
    inputShape: js.Array[Double],
    inputDType: DataType,
    indices: TypedArray,
    segmentIds: TypedArray,
    isMean: Boolean,
    defaultValue: Double
  ): js.Tuple2[TypedArray, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentReductionImpl")(input.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], inputDType.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], isMean.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TypedArray, js.Array[Double]]]
  inline def sparseSegmentReductionImpl(
    input: TypedArray,
    inputShape: js.Array[Double],
    inputDType: DataType,
    indices: TypedArray,
    segmentIds: TypedArray,
    isMean: Unit,
    defaultValue: Double
  ): js.Tuple2[TypedArray, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentReductionImpl")(input.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], inputDType.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], isMean.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TypedArray, js.Array[Double]]]
}
