package typings.tensorflowTfjsCore.tensorMod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.AnonFft
import typings.tensorflowTfjsCore.AnonIndices
import typings.tensorflowTfjsCore.AnonResizeBilinear
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike1D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike3D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpHandler extends js.Object {
  var image: AnonResizeBilinear = js.native
  var spectral: AnonFft = js.native
  def abs[T /* <: Tensor[Rank] */](x: T): T = js.native
  def acos[T /* <: Tensor[Rank] */](x: T): T = js.native
  def acosh[T /* <: Tensor[Rank] */](x: T): T = js.native
  def add[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def add[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def addStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def addStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  def argMin[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  def asin[T /* <: Tensor[Rank] */](x: T): T = js.native
  def asinh[T /* <: Tensor[Rank] */](x: T): T = js.native
  def atan[T /* <: Tensor[Rank] */](x: T): T = js.native
  def atan2[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def atan2[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def atanh[T /* <: Tensor[Rank] */](x: T): T = js.native
  def avgPool(
    x: Tensor[R3 | R4],
    filterSize: Double | (js.Tuple2[Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_
  ): Tensor[R3] = js.native
  def avgPool(
    x: Tensor[R3 | R4],
    filterSize: Double | (js.Tuple2[Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = js.native
  def batchNorm[R /* <: Rank */](x: Tensor[R], mean: Tensor[R] | Tensor1D | TensorLike, variance: Tensor[R] | Tensor1D | TensorLike): Tensor[R] = js.native
  def batchNorm[R /* <: Rank */](
    x: Tensor[R],
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def batchNorm[R /* <: Rank */](
    x: Tensor[R],
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike,
    scale: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def batchNorm[R /* <: Rank */](
    x: Tensor[R],
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike,
    scale: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double
  ): Tensor[R] = js.native
  def batchToSpaceND[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): TensorBuffer[R, bool] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: Uint8Array
  ): TensorBuffer[R, bool] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): TensorBuffer[R, complex64] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: Float32Array
  ): TensorBuffer[R, complex64] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32
  ): TensorBuffer[R, float32] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32,
    values: Float32Array
  ): TensorBuffer[R, float32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): TensorBuffer[R, int32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: Int32Array
  ): TensorBuffer[R, int32] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string
  ): TensorBuffer[R, string] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string,
    values: js.Array[String]
  ): TensorBuffer[R, string] = js.native
  def cast[T /* <: Tensor[Rank] */](x: T, dtype: DataType): T = js.native
  def ceil[T /* <: Tensor[Rank] */](x: T): T = js.native
  def clipByValue[T /* <: Tensor[Rank] */](x: T, clipValueMin: Double, clipValueMax: Double): T = js.native
  def clone[T /* <: Tensor[Rank] */](x: T): T = js.native
  def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = js.native
  def conv1d(
    x: Tensor[R2 | R3],
    filter: Tensor3D | TensorLike3D,
    stride: Double,
    pad: Double | same_ | valid_,
    dataFormat: NCW | NWC,
    dilation: Double
  ): Tensor[R2] = js.native
  def conv1d(
    x: Tensor[R2 | R3],
    filter: Tensor3D | TensorLike3D,
    stride: Double,
    pad: Double | same_ | valid_,
    dataFormat: NCW | NWC,
    dilation: Double,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R2] = js.native
  def conv2d(
    x: Tensor[R3 | R4],
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dataFormat: NCHW | NHWC,
    dilations: Double | (js.Tuple2[Double, Double])
  ): Tensor[R3] = js.native
  def conv2d(
    x: Tensor[R3 | R4],
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dataFormat: NCHW | NHWC,
    dilations: Double | (js.Tuple2[Double, Double]),
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = js.native
  def conv2dTranspose(
    x: Tensor[R3 | R4],
    filter: Tensor4D | TensorLike4D,
    outputShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_
  ): Tensor[R3] = js.native
  def conv2dTranspose(
    x: Tensor[R3 | R4],
    filter: Tensor4D | TensorLike4D,
    outputShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = js.native
  def cos[T /* <: Tensor[Rank] */](x: T): T = js.native
  def cosh[T /* <: Tensor[Rank] */](x: T): T = js.native
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
  def depthToSpace(x: Tensor4D, blockSize: Double, dataFormat: String): Tensor4D = js.native
  def depthwiseConv2d(
    x: Tensor[R3 | R4],
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dataFormat: NCHW | NHWC,
    dilations: Double | (js.Tuple2[Double, Double])
  ): Tensor[R3] = js.native
  def depthwiseConv2d(
    x: Tensor[R3 | R4],
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dataFormat: NCHW | NHWC,
    dilations: Double | (js.Tuple2[Double, Double]),
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = js.native
  def div[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def div[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def divNoNan[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def divNoNan[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def divStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def divStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def dot(t1: Tensor[Rank], t2: TensorLike): Tensor[Rank] = js.native
  def dot(t1: Tensor[Rank], t2: Tensor[Rank]): Tensor[Rank] = js.native
  def elu[T /* <: Tensor[Rank] */](x: T): T = js.native
  def equal[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def equal[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def equalStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def equalStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def erf[T /* <: Tensor[Rank] */](x: T): T = js.native
  def exp[T /* <: Tensor[Rank] */](x: T): T = js.native
  def expandDims[R2 /* <: Rank */](x: Tensor[Rank], axis: Double): Tensor[R2] = js.native
  def expm1[T /* <: Tensor[Rank] */](x: T): T = js.native
  def floor[T /* <: Tensor[Rank] */](x: T): T = js.native
  def floorDiv[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def floorDiv[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def gather[T /* <: Tensor[Rank] */](x: T, indices: TensorLike, axis: Double): T = js.native
  def gather[T /* <: Tensor[Rank] */](x: T, indices: Tensor[Rank], axis: Double): T = js.native
  def greater[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def greater[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def greaterEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def greaterEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def greaterEqualStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def greaterEqualStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def greaterStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def greaterStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def isFinite[T /* <: Tensor[Rank] */](x: T): T = js.native
  def isInf[T /* <: Tensor[Rank] */](x: T): T = js.native
  def isNaN[T /* <: Tensor[Rank] */](x: T): T = js.native
  def leakyRelu[T /* <: Tensor[Rank] */](x: T, alpha: Double): T = js.native
  def less[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def less[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def lessEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def lessEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def lessEqualStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def lessEqualStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def lessStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def lessStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def localResponseNormalization(x: Tensor[R3 | R4], depthRadius: Double, bias: Double, alpha: Double, beta: Double): Tensor[R3] = js.native
  def log[T /* <: Tensor[Rank] */](x: T): T = js.native
  def log1p[T /* <: Tensor[Rank] */](x: T): T = js.native
  def logSigmoid[T /* <: Tensor[Rank] */](x: T): T = js.native
  def logSoftmax[T /* <: Tensor[Rank] */](logits: T, axis: Double): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def logicalAnd[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def logicalAnd[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def logicalNot[T /* <: Tensor[Rank] */](x: T): T = js.native
  def logicalOr[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def logicalOr[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def logicalXor[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def logicalXor[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def matMul[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean, transposeB: Boolean): T = js.native
  def matMul[T /* <: Tensor[Rank] */](a: T, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def maxPool(
    x: Tensor[R3 | R4],
    filterSize: Double | (js.Tuple2[Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_
  ): Tensor[R3] = js.native
  def maxPool(
    x: Tensor[R3 | R4],
    filterSize: Double | (js.Tuple2[Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = js.native
  def maximum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def maximum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def maximumStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def maximumStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def minimum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def minimum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def minimumStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def minimumStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def mod[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def mod[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def modStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def modStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def mul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def mul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def mulStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def mulStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def neg[T /* <: Tensor[Rank] */](x: T): T = js.native
  def norm(x: Tensor[Rank], ord: Double, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
  def norm(x: Tensor[Rank], ord: Double, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(x: Tensor[Rank], ord: euclidean, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(x: Tensor[Rank], ord: euclidean, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(x: Tensor[Rank], ord: fro, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(x: Tensor[Rank], ord: fro, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
  def notEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def notEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def notEqualStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def notEqualStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def oneHot(x: TensorLike, depth: Double): Tensor[Rank] = js.native
  def oneHot(x: TensorLike, depth: Double, onValue: Double): Tensor[Rank] = js.native
  def oneHot(x: TensorLike, depth: Double, onValue: Double, offValue: Double): Tensor[Rank] = js.native
  def oneHot(x: Tensor[Rank], depth: Double): Tensor[Rank] = js.native
  def oneHot(x: Tensor[Rank], depth: Double, onValue: Double): Tensor[Rank] = js.native
  def oneHot(x: Tensor[Rank], depth: Double, onValue: Double, offValue: Double): Tensor[Rank] = js.native
  def onesLike[T /* <: Tensor[Rank] */](x: T): T = js.native
  def pad[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
  def pool(
    input: Tensor[R3 | R4],
    windowShape: Double | (js.Tuple2[Double, Double]),
    poolingType: avg | max,
    padding: Double | same_ | valid_
  ): Tensor[R3] = js.native
  def pool(
    input: Tensor[R3 | R4],
    windowShape: Double | (js.Tuple2[Double, Double]),
    poolingType: avg | max,
    padding: Double | same_ | valid_,
    diationRate: Double | (js.Tuple2[Double, Double])
  ): Tensor[R3] = js.native
  def pool(
    input: Tensor[R3 | R4],
    windowShape: Double | (js.Tuple2[Double, Double]),
    poolingType: avg | max,
    padding: Double | same_ | valid_,
    diationRate: Double | (js.Tuple2[Double, Double]),
    strides: Double | (js.Tuple2[Double, Double])
  ): Tensor[R3] = js.native
  def pow[T /* <: Tensor[Rank] */](base: T, exp: TensorLike): T = js.native
  def pow[T /* <: Tensor[Rank] */](base: T, exp: Tensor[Rank]): T = js.native
  def powStrict[T /* <: Tensor[Rank] */](base: T, exp: TensorLike): T = js.native
  def powStrict[T /* <: Tensor[Rank] */](base: T, exp: Tensor[Rank]): T = js.native
  def prelu[T /* <: Tensor[Rank] */](x: T, alpha: T): T = js.native
  def prelu[T /* <: Tensor[Rank] */](x: T, alpha: TensorLike): T = js.native
  def print[T /* <: Tensor[Rank] */](x: T, verbose: Boolean): Unit = js.native
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def reciprocal[T /* <: Tensor[Rank] */](x: T): T = js.native
  def relu[T /* <: Tensor[Rank] */](x: T): T = js.native
  def relu6[T /* <: Tensor[Rank] */](x: T): T = js.native
  def reshape[R2 /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
  ): Tensor[R2] = js.native
  def reverse[T /* <: Tensor[Rank] */](x: T): T = js.native
  def reverse[T /* <: Tensor[Rank] */](x: T, axis: js.Array[Double]): T = js.native
  def reverse[T /* <: Tensor[Rank] */](x: T, axis: Double): T = js.native
  def round[T /* <: Tensor[Rank] */](x: T): T = js.native
  def rsqrt[T /* <: Tensor[Rank] */](x: T): T = js.native
  def selu[T /* <: Tensor[Rank] */](x: T): T = js.native
  def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike4D,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_,
    dilation: (js.Tuple2[Double, Double]) | Double,
    dataFormat: NHWC | NCHW
  ): T = js.native
  def sigmoid[T /* <: Tensor[Rank] */](x: T): T = js.native
  def sign[T /* <: Tensor[Rank] */](x: T): T = js.native
  def sin[T /* <: Tensor[Rank] */](x: T): T = js.native
  def sinh[T /* <: Tensor[Rank] */](x: T): T = js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double]): T = js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double], size: js.Array[Double]): T = js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double], size: Double): T = js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double): T = js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double, size: js.Array[Double]): T = js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double, size: Double): T = js.native
  def softmax[T /* <: Tensor[Rank] */](logits: T, dim: Double): T = js.native
  def softplus[T /* <: Tensor[Rank] */](x: T): T = js.native
  def spaceToBatchND[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
  def split[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  def split[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  def split[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: Double): js.Array[T] = js.native
  def split[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  def sqrt[T /* <: Tensor[Rank] */](x: T): T = js.native
  def square[T /* <: Tensor[Rank] */](x: T): T = js.native
  def squaredDifference[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def squaredDifference[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def squaredDifferenceStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def squaredDifferenceStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[Rank] = js.native
  def step[T /* <: Tensor[Rank] */](x: T, alpha: Double): T = js.native
  def stridedSlice(
    x: Tensor[Rank],
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: Double,
    newAxisMask: Double,
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def sub[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def sub[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def subStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def subStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def tan[T /* <: Tensor[Rank] */](x: T): T = js.native
  def tanh[T /* <: Tensor[Rank] */](x: T): T = js.native
  def tile[T /* <: Tensor[Rank] */](x: T, reps: js.Array[Double]): T = js.native
  def topk[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): AnonIndices[T] = js.native
  def transpose[T /* <: Tensor[Rank] */](x: T): T = js.native
  def transpose[T /* <: Tensor[Rank] */](x: T, perm: js.Array[Double]): T = js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T, segmentIds: TensorLike1D, numSegments: Double): T = js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T, segmentIds: Tensor1D, numSegments: Double): T = js.native
  def unstack[T /* <: Tensor[Rank] */](value: T, axis: Double): js.Array[Tensor[Rank]] = js.native
  def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: T): T = js.native
  def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: TensorLike): T = js.native
  def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: T): T = js.native
  def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: TensorLike): T = js.native
  def zerosLike[T /* <: Tensor[Rank] */](x: T): T = js.native
}

