package typings
package atTensorflowTfjsDashCoreLib.distTensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpHandler extends js.Object {
  var image: atTensorflowTfjsDashCoreLib.Anon_AlignCorners = js.native
  var spectral: atTensorflowTfjsDashCoreLib.Anon_Fft = js.native
  def abs[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def acos[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def acosh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def add[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def add[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def addStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def addStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def all[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): T = js.native
  def all[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double,
    keepDims: scala.Boolean
  ): T = js.native
  def any[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): T = js.native
  def any[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double,
    keepDims: scala.Boolean
  ): T = js.native
  def argMax[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], axis: scala.Double): T = js.native
  def argMin[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], axis: scala.Double): T = js.native
  def asin[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def asinh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def atan[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def atan2[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def atan2[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def atanh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def avgPool(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterSize: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def avgPool(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterSize: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def batchNorm[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: Tensor[R],
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[R] = js.native
  def batchNorm[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: Tensor[R],
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    offset: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[R] = js.native
  def batchNorm[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: Tensor[R],
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    offset: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    scale: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[R] = js.native
  def batchNorm[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: Tensor[R],
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    offset: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    scale: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    varianceEpsilon: scala.Double
  ): Tensor[R] = js.native
  def batchToSpaceND[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, blockShape: js.Array[scala.Double], crops: js.Array[js.Array[scala.Double]]): T = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool
  ): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool,
    values: stdLib.Uint8Array
  ): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64
  ): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64,
    values: stdLib.Float32Array
  ): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32
  ): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32,
    values: stdLib.Float32Array
  ): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32
  ): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32,
    values: stdLib.Int32Array
  ): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string
  ): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string,
    values: js.Array[java.lang.String]
  ): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string] = js.native
  def cast[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): T = js.native
  def ceil[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def clipByValue[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, clipValueMin: scala.Double, clipValueMax: scala.Double): T = js.native
  def clone[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def concat[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](tensors: js.Array[T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike], axis: scala.Double): T = js.native
  def conv1d(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D,
    stride: scala.Double,
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NWC,
    dilation: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def conv1d(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D,
    stride: scala.Double,
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NWC,
    dilation: scala.Double,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def conv2d(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC,
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double])
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def conv2d(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC,
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def conv2dTranspose(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    outputShape: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def conv2dTranspose(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    outputShape: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def cos[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def cosh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def cumsum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double,
    exclusive: scala.Boolean,
    reverse: scala.Boolean
  ): T = js.native
  def depthToSpace(x: Tensor4D, blockSize: scala.Double, dataFormat: java.lang.String): Tensor4D = js.native
  def depthwiseConv2d(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC,
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double])
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def depthwiseConv2d(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC,
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def div[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def div[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def divStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def divStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def dot(
    t1: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    t2: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def dot(
    t1: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    t2: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def elu[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def equal[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def equal[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def equalStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def equalStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def erf[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def exp[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def expandDims[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], axis: scala.Double): Tensor[R2] = js.native
  def expm1[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def floor[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def floorDiv[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def floorDiv[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def gather[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, indices: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], axis: scala.Double): T = js.native
  def gather[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, indices: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, axis: scala.Double): T = js.native
  def greater[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def greater[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def greaterEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def greaterEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def greaterEqualStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def greaterEqualStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def greaterStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def greaterStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def isFinite[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def isInf[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def isNaN[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def leakyRelu[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, alpha: scala.Double): T = js.native
  def less[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def less[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def lessEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def lessEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def lessEqualStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def lessEqualStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def lessStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def lessStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def localResponseNormalization(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    depthRadius: scala.Double,
    bias: scala.Double,
    alpha: scala.Double,
    beta: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def log[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def log1p[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def logSigmoid[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def logSoftmax[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](logits: T, axis: scala.Double): T = js.native
  def logSumExp[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): T = js.native
  def logSumExp[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double,
    keepDims: scala.Boolean
  ): T = js.native
  def logicalAnd[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def logicalAnd[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def logicalNot[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def logicalOr[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def logicalOr[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def logicalXor[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def logicalXor[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def matMul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T, transposeA: scala.Boolean, transposeB: scala.Boolean): T = js.native
  def matMul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: T,
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    transposeA: scala.Boolean,
    transposeB: scala.Boolean
  ): T = js.native
  def max[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): T = js.native
  def max[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double,
    keepDims: scala.Boolean
  ): T = js.native
  def maxPool(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterSize: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def maxPool(
    x: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterSize: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def maximum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def maximum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def maximumStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def maximumStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def mean[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): T = js.native
  def mean[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double,
    keepDims: scala.Boolean
  ): T = js.native
  def min[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): T = js.native
  def min[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double,
    keepDims: scala.Boolean
  ): T = js.native
  def minimum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def minimum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def minimumStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def minimumStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def mod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def mod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def modStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def modStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def mul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def mul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def mulStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def mulStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def neg[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def norm(
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    ord: scala.Double,
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def norm(
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    ord: scala.Double,
    axis: scala.Double,
    keepDims: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_euclidean(
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.euclidean,
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_euclidean(
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.euclidean,
    axis: scala.Double,
    keepDims: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_fro(
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.fro,
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_fro(
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.fro,
    axis: scala.Double,
    keepDims: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def notEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def notEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def notEqualStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def notEqualStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def oneHot(x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], depth: scala.Double): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def oneHot(
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    depth: scala.Double,
    onValue: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def oneHot(
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    depth: scala.Double,
    onValue: scala.Double,
    offValue: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def oneHot(x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, depth: scala.Double): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def oneHot(x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, depth: scala.Double, onValue: scala.Double): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def oneHot(
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    depth: scala.Double,
    onValue: scala.Double,
    offValue: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def onesLike[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def pad[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, paddings: js.Array[js.Tuple2[scala.Double, scala.Double]], constantValue: scala.Double): T = js.native
  def pool(
    input: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    windowShape: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    poolingType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.avg | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.max,
    padding: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def pool(
    input: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    windowShape: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    poolingType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.avg | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.max,
    padding: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    diationRate: scala.Double | (js.Tuple2[scala.Double, scala.Double])
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def pool(
    input: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    windowShape: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    poolingType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.avg | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.max,
    padding: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    diationRate: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double])
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def pow[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](base: T, exp: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def pow[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](base: T, exp: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def powStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](base: T, exp: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def powStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](base: T, exp: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def prelu[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, alpha: T): T = js.native
  def prelu[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, alpha: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def print[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, verbose: scala.Boolean): scala.Unit = js.native
  def prod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): T = js.native
  def prod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double,
    keepDims: scala.Boolean
  ): T = js.native
  def reciprocal[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def relu[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def reshape[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
  ): Tensor[R2] = js.native
  def reverse[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def reverse[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, axis: js.Array[scala.Double]): T = js.native
  def reverse[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, axis: scala.Double): T = js.native
  def round[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def rsqrt[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def selu[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    depthwiseFilter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    pointwiseFilter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    dilation: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW
  ): T = js.native
  def sigmoid[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def sign[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def sin[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def sinh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def slice[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[scala.Double]): T = js.native
  def slice[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[scala.Double], size: js.Array[scala.Double]): T = js.native
  def slice[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[scala.Double], size: scala.Double): T = js.native
  def slice[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: scala.Double): T = js.native
  def slice[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: scala.Double, size: js.Array[scala.Double]): T = js.native
  def slice[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: scala.Double, size: scala.Double): T = js.native
  def softmax[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](logits: T, dim: scala.Double): T = js.native
  def softplus[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def spaceToBatchND[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, blockShape: js.Array[scala.Double], paddings: js.Array[js.Array[scala.Double]]): T = js.native
  def split[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, numOrSizeSplits: js.Array[scala.Double]): js.Array[T] = js.native
  def split[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, numOrSizeSplits: js.Array[scala.Double], axis: scala.Double): js.Array[T] = js.native
  def split[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, numOrSizeSplits: scala.Double): js.Array[T] = js.native
  def split[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, numOrSizeSplits: scala.Double, axis: scala.Double): js.Array[T] = js.native
  def sqrt[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def square[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def squaredDifference[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def squaredDifference[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def squaredDifferenceStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def squaredDifferenceStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def squeeze[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def squeeze[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], axis: js.Array[scala.Double]): T = js.native
  def stack[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](tensors: js.Array[T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike], axis: scala.Double): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def step[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, alpha: scala.Double): T = js.native
  def stridedSlice(
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    begin: js.Array[scala.Double],
    end: js.Array[scala.Double],
    strides: js.Array[scala.Double],
    beginMask: scala.Double,
    endMask: scala.Double,
    ellipsisMask: scala.Double,
    newAxisMask: scala.Double,
    shrinkAxisMask: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def sub[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def sub[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def subStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def subStrict[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def sum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): T = js.native
  def sum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double,
    keepDims: scala.Boolean
  ): T = js.native
  def tan[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def tanh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def tile[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, reps: js.Array[scala.Double]): T = js.native
  def topk[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, k: scala.Double, sorted: scala.Boolean): atTensorflowTfjsDashCoreLib.Anon_Indices[T] = js.native
  def transpose[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def transpose[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, perm: js.Array[scala.Double]): T = js.native
  def unsortedSegmentSum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, segmentIds: Tensor1D, numSegments: scala.Double): T = js.native
  def unsortedSegmentSum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, segmentIds: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike1D, numSegments: scala.Double): T = js.native
  def unstack[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](value: T, axis: scala.Double): js.Array[Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]] = js.native
  def where[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](condition: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], a: T, b: T): T = js.native
  def where[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    condition: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    a: T,
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def where[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](condition: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, a: T, b: T): T = js.native
  def where[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    condition: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    a: T,
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): T = js.native
  def zerosLike[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
}

