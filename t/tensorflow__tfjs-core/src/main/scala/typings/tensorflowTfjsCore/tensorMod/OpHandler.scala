package typings.tensorflowTfjsCore.tensorMod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.anon.Fft
import typings.tensorflowTfjsCore.anon.Indices
import typings.tensorflowTfjsCore.anon.ResizeBilinear
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike1D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpHandler extends js.Object {
  var image: ResizeBilinear = js.native
  var spectral: Fft = js.native
  def abs[T /* <: Tensor[Rank] */](x: T): T = js.native
  def acos[T /* <: Tensor[Rank] */](x: T): T = js.native
  def acosh[T /* <: Tensor[Rank] */](x: T): T = js.native
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
  def atanh[T /* <: Tensor[Rank] */](x: T): T = js.native
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
  def cos[T /* <: Tensor[Rank] */](x: T): T = js.native
  def cosh[T /* <: Tensor[Rank] */](x: T): T = js.native
  def divStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def divStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def equalStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def equalStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def erf[T /* <: Tensor[Rank] */](x: T): T = js.native
  def exp[T /* <: Tensor[Rank] */](x: T): T = js.native
  def expandDims[R2 /* <: Rank */](x: Tensor[Rank], axis: Double): Tensor[R2] = js.native
  def expm1[T /* <: Tensor[Rank] */](x: T): T = js.native
  def floor[T /* <: Tensor[Rank] */](x: T): T = js.native
  def gather[T /* <: Tensor[Rank] */](x: T, indices: TensorLike, axis: Double): T = js.native
  def gather[T /* <: Tensor[Rank] */](x: T, indices: Tensor[Rank], axis: Double): T = js.native
  def greaterEqualStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def greaterEqualStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def greaterStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def greaterStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def isFinite[T /* <: Tensor[Rank] */](x: T): T = js.native
  def isInf[T /* <: Tensor[Rank] */](x: T): T = js.native
  def isNaN[T /* <: Tensor[Rank] */](x: T): T = js.native
  def lessEqualStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def lessEqualStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def lessStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def lessStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
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
  def maximumStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def maximumStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def minimumStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def minimumStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def modStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def modStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
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
  def notEqualStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def notEqualStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def onesLike[T /* <: Tensor[Rank] */](x: T): T = js.native
  def powStrict[T /* <: Tensor[Rank] */](base: T, exp: TensorLike): T = js.native
  def powStrict[T /* <: Tensor[Rank] */](base: T, exp: Tensor[Rank]): T = js.native
  def print[T /* <: Tensor[Rank] */](x: T, verbose: Boolean): Unit = js.native
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def reciprocal[T /* <: Tensor[Rank] */](x: T): T = js.native
  def reshape[R2 /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
  ): Tensor[R2] = js.native
  def reverse[T /* <: Tensor[Rank] */](x: T): T = js.native
  def reverse[T /* <: Tensor[Rank] */](x: T, axis: js.Array[Double]): T = js.native
  def reverse[T /* <: Tensor[Rank] */](x: T, axis: Double): T = js.native
  def round[T /* <: Tensor[Rank] */](x: T): T = js.native
  def rsqrt[T /* <: Tensor[Rank] */](x: T): T = js.native
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
  def sqrt[T /* <: Tensor[Rank] */](x: T): T = js.native
  def square[T /* <: Tensor[Rank] */](x: T): T = js.native
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
  def subStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def subStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  def tan[T /* <: Tensor[Rank] */](x: T): T = js.native
  def tanh[T /* <: Tensor[Rank] */](x: T): T = js.native
  def topk[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): Indices[T] = js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T, segmentIds: TensorLike1D, numSegments: Double): T = js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T, segmentIds: Tensor1D, numSegments: Double): T = js.native
  def unstack[T /* <: Tensor[Rank] */](value: T, axis: Double): js.Array[Tensor[Rank]] = js.native
  def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: T): T = js.native
  def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: TensorLike): T = js.native
  def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: T): T = js.native
  def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: TensorLike): T = js.native
  def zerosLike[T /* <: Tensor[Rank] */](x: T): T = js.native
}

