package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.Indices
import typings.tensorflowTfjsBackendCpu.anon.OutDtype
import typings.tensorflowTfjsBackendCpu.anon.Shape
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.bool
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.float32
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.int32
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.string
import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.NumericDataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "addImpl")
  @js.native
  val addImpl: SimpleBinaryKernelImpl = js.native
  
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
  
  inline def castImpl(values: TypedArray, shape: js.Array[Double], inputType: DataType, dtype: DataType): js.Tuple3[js.Array[Double], DataType, TypedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("castImpl")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], inputType.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[js.Array[Double], DataType, TypedArray]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "ceilImpl")
  @js.native
  val ceilImpl: SimpleUnaryImpl = js.native
  
  inline def concatImpl(inputs: js.Array[Shape], outShape: js.Array[Double], dtype: DataType, simplyConcat: Boolean): TypedArray | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatImpl")(inputs.asInstanceOf[js.Any], outShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], simplyConcat.asInstanceOf[js.Any])).asInstanceOf[TypedArray | js.Array[String]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "equalImpl")
  @js.native
  val equalImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "expImpl")
  @js.native
  val expImpl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "expm1Impl")
  @js.native
  val expm1Impl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "floorImpl")
  @js.native
  val floorImpl: SimpleUnaryImpl = js.native
  
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
  
  inline def gatherV2Impl[R /* <: Rank */, D /* <: DataType */](xBuf: TensorBuffer[R, D], indicesBuf: TensorBuffer[R, D], flattenOutputShape: js.Array[Double]): TensorBuffer[R, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatherV2Impl")(xBuf.asInstanceOf[js.Any], indicesBuf.asInstanceOf[js.Any], flattenOutputShape.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, D]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "greaterEqualImpl")
  @js.native
  val greaterEqualImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "greaterImpl")
  @js.native
  val greaterImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "lessEqualImpl")
  @js.native
  val lessEqualImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "lessImpl")
  @js.native
  val lessImpl: SimpleBinaryKernelImpl = js.native
  
  inline def linSpaceImpl(start: Double, stop: Double, num: Double): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("linSpaceImpl")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "logImpl")
  @js.native
  val logImpl: SimpleUnaryImpl = js.native
  
  inline def maxImpl(aVals: TypedArray, reduceSize: Double, outShape: js.Array[Double], dtype: DataType): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("maxImpl")(aVals.asInstanceOf[js.Any], reduceSize.asInstanceOf[js.Any], outShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "maximumImpl")
  @js.native
  val maximumImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "minimumImpl")
  @js.native
  val minimumImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "multiplyImpl")
  @js.native
  val multiplyImpl: SimpleBinaryKernelImpl = js.native
  
  inline def negImpl(xVals: TypedArray, xShape: js.Array[Double], xDtype: DataType): js.Tuple2[TypedArray, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("negImpl")(xVals.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], xDtype.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TypedArray, js.Array[Double]]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "notEqualImpl")
  @js.native
  val notEqualImpl: SimpleBinaryKernelImpl = js.native
  
  inline def prodImpl(xShape: js.Array[Double], xDtype: DataType, xVals: TypedArray, reductionAxes: js.Array[Double]): OutDtype = (^.asInstanceOf[js.Dynamic].applyDynamic("prodImpl")(xShape.asInstanceOf[js.Any], xDtype.asInstanceOf[js.Any], xVals.asInstanceOf[js.Any], reductionAxes.asInstanceOf[js.Any])).asInstanceOf[OutDtype]
  
  inline def raggedTensorToTensorImpl(
    shape: TypedArray,
    shapesShape: js.Array[Double],
    values: TypedArray,
    valuesShape: js.Array[Double],
    valuesDType: DataType,
    defaultValue: TypedArray,
    defaultValueShape: js.Array[Double],
    rowPartitionValues: js.Array[TypedArray],
    rowPartitionValuesShapes: js.Array[js.Array[Double]],
    rowPartitionTypes: js.Array[String]
  ): js.Tuple2[js.Array[Double], TypedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("raggedTensorToTensorImpl")(shape.asInstanceOf[js.Any], shapesShape.asInstanceOf[js.Any], values.asInstanceOf[js.Any], valuesShape.asInstanceOf[js.Any], valuesDType.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], defaultValueShape.asInstanceOf[js.Any], rowPartitionValues.asInstanceOf[js.Any], rowPartitionValuesShapes.asInstanceOf[js.Any], rowPartitionTypes.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Double], TypedArray]]
  
  inline def rangeImpl(start: Double, stop: Double, step: Double, dtype: float32 | int32): js.typedarray.Float32Array | js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeImpl")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array | js.typedarray.Int32Array]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "rsqrtImpl")
  @js.native
  val rsqrtImpl: SimpleUnaryImpl = js.native
  
  inline def scatterImpl_int32[R /* <: Rank */, D /* <: float32 | int32 | bool | string */](
    indices: TensorBuffer[R, int32],
    updates: TensorBuffer[R, D],
    shape: js.Array[Double],
    outputSize: Double,
    sliceSize: Double,
    numUpdates: Double,
    sliceRank: Double,
    strides: js.Array[Double],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-backend-cpu.@tensorflow/tfjs-backend-cpu/dist/kernels/Scatter_impl.DefaultValueTypeMap[D] */ js.Any,
    sumDupeIndices: Boolean
  ): TensorBuffer[R, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterImpl")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], outputSize.asInstanceOf[js.Any], sliceSize.asInstanceOf[js.Any], numUpdates.asInstanceOf[js.Any], sliceRank.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], sumDupeIndices.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, D]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "sigmoidImpl")
  @js.native
  val sigmoidImpl: SimpleUnaryImpl = js.native
  
  inline def simpleAbsImpl(vals: TypedArray): js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleAbsImpl")(vals.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array]
  
  inline def sliceImpl(
    vals: BackendValues,
    begin: js.Array[Double],
    size: js.Array[Double],
    shape: js.Array[Double],
    dtype: DataType
  ): BackendValues = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceImpl")(vals.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[BackendValues]
  
  inline def sparseFillEmptyRowsImpl(
    indices: TypedArray,
    indicesShape: js.Array[Double],
    indicesDType: DataType,
    values: TypedArray,
    valuesDType: DataType,
    denseShape: TypedArray,
    defaultValue: Double
  ): js.Tuple5[TypedArray, js.Array[Double], TypedArray, js.Array[Boolean], js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRowsImpl")(indices.asInstanceOf[js.Any], indicesShape.asInstanceOf[js.Any], indicesDType.asInstanceOf[js.Any], values.asInstanceOf[js.Any], valuesDType.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple5[TypedArray, js.Array[Double], TypedArray, js.Array[Boolean], js.Array[Double]]]
  
  inline def sparseReshapeImpl(
    inputIndices: TypedArray,
    inputIndicesShape: js.Array[Double],
    inputDType: DataType,
    inputShape: js.Array[Double],
    targetShape: js.Array[Double]
  ): js.Tuple3[TypedArray, js.Array[Double], js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshapeImpl")(inputIndices.asInstanceOf[js.Any], inputIndicesShape.asInstanceOf[js.Any], inputDType.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], targetShape.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[TypedArray, js.Array[Double], js.Array[Double]]]
  
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
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "sqrtImpl")
  @js.native
  val sqrtImpl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "squaredDifferenceImpl")
  @js.native
  val squaredDifferenceImpl: SimpleBinaryKernelImpl = js.native
  
  inline def stridedSliceImpl_float32[R /* <: Rank */](
    outShape: js.Array[Double],
    xBuf: TensorBuffer[R, float32],
    strides: js.Array[Double],
    begin: js.Array[Double]
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("stridedSliceImpl")(outShape.asInstanceOf[js.Any], xBuf.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  
  inline def stringNGramsImpl(
    data: js.Array[js.typedarray.Uint8Array],
    dataSplits: js.typedarray.Int32Array,
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): js.Tuple2[js.Array[js.typedarray.Uint8Array], js.typedarray.Int32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGramsImpl")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[js.typedarray.Uint8Array], js.typedarray.Int32Array]]
  
  inline def stringSplitImpl(input: js.Array[js.typedarray.Uint8Array], delimiter: js.typedarray.Uint8Array, skipEmpty: Boolean): js.Tuple3[TypedArray, js.Array[js.typedarray.Uint8Array], js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplitImpl")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[TypedArray, js.Array[js.typedarray.Uint8Array], js.Tuple2[Double, Double]]]
  
  inline def stringToHashBucketFastImpl(input: js.Array[js.typedarray.Uint8Array], numBuckets: Double): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFastImpl")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "subImpl")
  @js.native
  val subImpl: SimpleBinaryKernelImpl = js.native
  
  inline def tileImpl[R /* <: Rank */](xBuf: TensorBuffer[R, DataType], reps: js.Array[Double]): TensorBuffer[R, DataType] = (^.asInstanceOf[js.Dynamic].applyDynamic("tileImpl")(xBuf.asInstanceOf[js.Any], reps.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, DataType]]
  
  inline def topKImpl[T /* <: Tensor[Rank] */, R /* <: Rank */](x: TypedArray, xShape: js.Array[Double], xDtype: NumericDataType, k: Double, sorted: Boolean): js.Tuple2[TensorBuffer[R, NumericDataType], TensorBuffer[R, int32]] = (^.asInstanceOf[js.Dynamic].applyDynamic("topKImpl")(x.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], xDtype.asInstanceOf[js.Any], k.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TensorBuffer[R, NumericDataType], TensorBuffer[R, int32]]]
  
  inline def transposeImpl(
    xVals: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    perm: js.Array[Double],
    newShape: js.Array[Double]
  ): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("transposeImpl")(xVals.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], perm.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
  
  inline def uniqueImpl(values: BackendValues, axis: Double, shape: js.Array[Double], dtype: DataType): Indices = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueImpl")(values.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Indices]
}
