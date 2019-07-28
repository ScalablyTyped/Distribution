package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.Anon_Mean
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCHW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NHWC
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.bool
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.complex64
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.euclidean
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.float32
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.fro
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.int32
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.string
import typings.atTensorflowTfjsDashCore.distOpsLstmMod.LSTMCellFunc
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor6D
import typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike1D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike2D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike3D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike5D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike6D
import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val basicLSTMCell: js.Function6[
    /* forgetBias */ Scalar | TensorLike, 
    /* lstmKernel */ Tensor2D | TensorLike, 
    /* lstmBias */ Tensor1D | TensorLike, 
    /* data */ Tensor2D | TensorLike, 
    /* c */ Tensor2D | TensorLike, 
    /* h */ Tensor2D | TensorLike, 
    js.Tuple2[Tensor2D, Tensor2D]
  ] = js.native
  val batchNorm2d: js.Function6[
    /* x */ Tensor2D | TensorLike, 
    /* mean */ Tensor2D | Tensor1D | TensorLike, 
    /* variance */ Tensor2D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
  val batchNorm3d: js.Function6[
    /* x */ Tensor3D | TensorLike, 
    /* mean */ Tensor3D | Tensor1D | TensorLike, 
    /* variance */ Tensor3D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  val batchNorm4d: js.Function6[
    /* x */ Tensor4D | TensorLike, 
    /* mean */ Tensor4D | Tensor1D | TensorLike, 
    /* variance */ Tensor4D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
  val batchNormalization2d: js.Function6[
    /* x */ Tensor2D | TensorLike, 
    /* mean */ Tensor2D | Tensor1D | TensorLike, 
    /* variance */ Tensor2D | Tensor1D | TensorLike, 
    /* varianceEpsilon */ js.UndefOr[Double], 
    /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    Tensor2D
  ] = js.native
  val batchNormalization3d: js.Function6[
    /* x */ Tensor3D | TensorLike, 
    /* mean */ Tensor3D | Tensor1D | TensorLike, 
    /* variance */ Tensor3D | Tensor1D | TensorLike, 
    /* varianceEpsilon */ js.UndefOr[Double], 
    /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    Tensor3D
  ] = js.native
  val batchNormalization4d: js.Function6[
    /* x */ Tensor4D | TensorLike, 
    /* mean */ Tensor4D | Tensor1D | TensorLike, 
    /* variance */ Tensor4D | Tensor1D | TensorLike, 
    /* varianceEpsilon */ js.UndefOr[Double], 
    /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    Tensor4D
  ] = js.native
  val concat1d: js.Function1[/* tensors */ js.Array[Tensor1D | TensorLike], Tensor1D] = js.native
  val concat2d: js.Function2[/* tensors */ js.Array[Tensor2D | TensorLike], /* axis */ Double, Tensor2D] = js.native
  val concat3d: js.Function2[/* tensors */ js.Array[Tensor3D | TensorLike], /* axis */ Double, Tensor3D] = js.native
  val concat4d: js.Function2[/* tensors */ js.Array[Tensor4D | TensorLike], /* axis */ Double, Tensor4D] = js.native
  val depthToSpace: js.Function3[
    /* x */ Tensor4D | TensorLike4D, 
    /* blockSize */ Double, 
    /* dataFormat */ js.UndefOr[NHWC | NCHW], 
    Tensor4D
  ] = js.native
  val dot: js.Function2[/* t1 */ Tensor[Rank] | TensorLike, /* t2 */ Tensor[Rank] | TensorLike, Tensor[Rank]] = js.native
  val dropout: js.Function4[
    /* x */ Tensor[Rank], 
    /* rate */ Scalar | Double, 
    /* noiseShape */ js.UndefOr[js.Array[Double]], 
    /* seed */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
  val eye: js.Function4[
    /* numRows */ Double, 
    /* numColumns */ js.UndefOr[Double], 
    /* batchShape */ js.UndefOr[
      js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ], 
    /* dtype */ js.UndefOr[DataType], 
    Tensor2D
  ] = js.native
  val fft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  val frame: js.Function5[
    /* signal */ Tensor1D, 
    /* frameLength */ Double, 
    /* frameStep */ Double, 
    /* padEnd */ js.UndefOr[Boolean], 
    /* padValue */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
  val gatherND: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* indices */ Tensor[Rank] | TensorLike, 
    Tensor[Rank]
  ] = js.native
  val hammingWindow: js.Function1[/* windowLength */ Double, Tensor1D] = js.native
  val hannWindow: js.Function1[/* windowLength */ Double, Tensor1D] = js.native
  val ifft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  val irfft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  val moments: js.Function3[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Anon_Mean
  ] = js.native
  val multiRNNCell: js.Function4[
    /* lstmCells */ js.Array[LSTMCellFunc], 
    /* data */ Tensor2D | TensorLike, 
    /* c */ js.Array[Tensor2D | TensorLike], 
    /* h */ js.Array[Tensor2D | TensorLike], 
    js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]]
  ] = js.native
  val multinomial: js.Function4[
    /* logits */ Tensor1D | Tensor2D | TensorLike, 
    /* numSamples */ Double, 
    /* seed */ js.UndefOr[Double], 
    /* normalized */ js.UndefOr[Boolean], 
    Tensor1D | Tensor2D
  ] = js.native
  val norm: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* ord */ js.UndefOr[Double | euclidean | fro], 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
  val oneHot: js.Function4[
    /* indices */ Tensor[Rank] | TensorLike, 
    /* depth */ Double, 
    /* onValue */ js.UndefOr[Double], 
    /* offValue */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
  val outerProduct: js.Function2[/* v1 */ Tensor1D | TensorLike, /* v2 */ Tensor1D | TensorLike, Tensor2D] = js.native
  val pad1d: js.Function3[
    /* x */ Tensor1D | TensorLike, 
    /* paddings */ js.Tuple2[Double, Double], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor1D
  ] = js.native
  val pad2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* paddings */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
  val pad3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* paddings */ js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  val pad4d: js.Function3[
    /* x */ Tensor4D | TensorLike, 
    /* paddings */ js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
  val reverse1d: js.Function1[/* x */ Tensor1D | TensorLike, Tensor1D] = js.native
  val reverse2d: js.Function2[
    /* x */ Tensor2D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor2D
  ] = js.native
  val reverse3d: js.Function2[
    /* x */ Tensor3D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor3D
  ] = js.native
  val reverse4d: js.Function2[
    /* x */ Tensor4D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor4D
  ] = js.native
  val rfft: js.Function2[/* input */ Tensor[Rank], /* fftLength */ js.UndefOr[Double], Tensor[Rank]] = js.native
  val setdiff1dAsync: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* y */ Tensor[Rank] | TensorLike, 
    js.Promise[js.Tuple2[Tensor[Rank], Tensor[Rank]]]
  ] = js.native
  val slice1d: js.Function3[/* x */ Tensor1D | TensorLike, /* begin */ Double, /* size */ Double, Tensor1D] = js.native
  val slice2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* begin */ js.Tuple2[Double, Double], 
    /* size */ js.Tuple2[Double, Double], 
    Tensor2D
  ] = js.native
  val slice3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* begin */ js.Tuple3[Double, Double, Double], 
    /* size */ js.Tuple3[Double, Double, Double], 
    Tensor3D
  ] = js.native
  val slice4d: js.Function3[
    /* x */ Tensor4D | TensorLike, 
    /* begin */ js.Tuple4[Double, Double, Double, Double], 
    /* size */ js.Tuple4[Double, Double, Double, Double], 
    Tensor4D
  ] = js.native
  val stridedSlice: js.Function9[
    /* x */ Tensor[Rank] | TensorLike, 
    /* begin */ js.Array[Double], 
    /* end */ js.Array[Double], 
    /* strides */ js.Array[Double], 
    /* beginMask */ js.UndefOr[Double], 
    /* endMask */ js.UndefOr[Double], 
    /* ellipsisMask */ js.UndefOr[Double], 
    /* newAxisMask */ js.UndefOr[Double], 
    /* shrinkAxisMask */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
  val unstack: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Array[Tensor[Rank]]
  ] = js.native
  val whereAsync: js.Function1[/* condition */ Tensor[Rank] | TensorLike, js.Promise[Tensor2D]] = js.native
  /**
    * Creates an empty `tf.TensorBuffer` with the specified `shape` and `dtype`.
    *
    * The values are stored in CPU as `TypedArray`. Fill the buffer using
    * `buffer.set()`, or by modifying directly `buffer.values`.
    *
    * When done, call `buffer.toTensor()` to get an immutable `tf.Tensor` with
    * those values.
    *
    * ```js
    * // Create a buffer and set values at particular indices.
    * const buffer = tf.buffer([2, 2]);
    * buffer.set(3, 0, 0);
    * buffer.set(5, 1, 0);
    *
    * // Convert the buffer back to a tensor.
    * buffer.toTensor().print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param dtype The dtype of the buffer. Defaults to 'float32'.
    * @param values The values of the buffer as `TypedArray`. Defaults to
    * zeros.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def buffer[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): TensorBuffer[R, float32] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): TensorBuffer[R, bool] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: Uint8Array
  ): TensorBuffer[R, bool] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): TensorBuffer[R, complex64] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: Float32Array
  ): TensorBuffer[R, complex64] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32
  ): TensorBuffer[R, float32] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32,
    values: Float32Array
  ): TensorBuffer[R, float32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): TensorBuffer[R, int32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: Int32Array
  ): TensorBuffer[R, int32] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string
  ): TensorBuffer[R, string] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string,
    values: js.Array[String]
  ): TensorBuffer[R, string] = js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String
  ): Tensor[R] = js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String,
    dtype: DataType
  ): Tensor[R] = js.native
  /**
    * Creates a `tf.Tensor` filled with a scalar value.
    *
    * ```js
    * tf.fill([2, 2], 4).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param value The scalar value to fill the tensor with.
    * @param dtype The type of an element in the resulting tensor. Defaults to
    * 'float'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def fill[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double
  ): Tensor[R] = js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double,
    dtype: DataType
  ): Tensor[R] = js.native
  /**
    * Return an evenly spaced sequence of numbers over the given interval.
    *
    * ```js
    * tf.linspace(0, 9, 10).print();
    * ```
    * @param start The start value of the sequence.
    * @param stop The end value of the sequence.
    * @param num The number of values to generate.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def linspace(start: Double, stop: Double, num: Double): Tensor1D = js.native
  /**
    * Creates a `tf.Tensor` with all elements set to 1.
    *
    * ```js
    * tf.ones([2, 2]).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param dtype The type of an element in the resulting tensor. Defaults to
    *     'float'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def ones[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def ones[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = js.native
  def op[T /* <: js.Function */](f: StringDictionary[T]): T = js.native
  /**
    * Prints information about the `tf.Tensor` including its data.
    *
    * ```js
    * const verbose = true;
    * tf.tensor2d([1, 2, 3, 4], [2, 2]).print(verbose);
    * ```
    * @param x The tensor to be printed.
    * @param verbose Whether to print verbose information about the ` Tensor`,
    * including dtype and size.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def print[T /* <: Tensor[Rank] */](x: T): Unit = js.native
  def print[T /* <: Tensor[Rank] */](x: T, verbose: Boolean): Unit = js.native
  /**
    * Creates a new `tf.Tensor1D` filled with the numbers in the range provided.
    *
    * The tensor is a is half-open interval meaning it includes start, but
    * excludes stop. Decrementing ranges and negative step values are also
    * supported.
    *
    * ```js
    * tf.range(0, 9, 2).print();
    * ```
    *
    * @param start An integer start value
    * @param stop An integer stop value
    * @param step An integer increment (will default to 1 or -1)
    * @param dtype The data type of the output tensor. Defaults to 'float32'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def range(start: Double, stop: Double): Tensor1D = js.native
  def range(start: Double, stop: Double, step: Double): Tensor1D = js.native
  @JSName("range")
  def range_float32(start: Double, stop: Double, step: Double, dtype: float32): Tensor1D = js.native
  @JSName("range")
  def range_int32(start: Double, stop: Double, step: Double, dtype: int32): Tensor1D = js.native
  def scalar(value: String): Scalar = js.native
  def scalar(value: String, dtype: DataType): Scalar = js.native
  def scalar(value: Boolean): Scalar = js.native
  def scalar(value: Boolean, dtype: DataType): Scalar = js.native
  /**
    * Creates rank-0 `tf.Tensor` (scalar) with the provided value and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.scalar` as it makes the code more readable.
    *
    * ```js
    * tf.scalar(3.14).print();
    * ```
    *
    * @param value The value of the scalar.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def scalar(value: Double): Scalar = js.native
  def scalar(value: Double, dtype: DataType): Scalar = js.native
  def scalar(value: Uint8Array): Scalar = js.native
  def scalar(value: Uint8Array, dtype: DataType): Scalar = js.native
  /**
    * Creates a `tf.Tensor` with the provided values, shape and dtype.
    *
    * ```js
    * // Pass an array of values to create a vector.
    * tf.tensor([1, 2, 3, 4]).print();
    * ```
    *
    * ```js
    * // Pass a nested array of values to make a matrix or a higher
    * // dimensional tensor.
    * tf.tensor([[1, 2], [3, 4]]).print();
    * ```
    *
    * ```js
    * // Pass a flat array and specify a shape yourself.
    * tf.tensor([1, 2, 3, 4], [2, 2]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`. If the values are strings,
    *     they will be encoded as utf-8 and kept as `Uint8Array[]`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor[R /* <: Rank */](values: TensorLike): Tensor[R] = js.native
  def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = js.native
  /**
    * Creates rank-1 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor1d` as it makes the code more readable.
    *
    * ```js
    * tf.tensor1d([1, 2, 3]).print();
    * ```
    *
    * @param values The values of the tensor. Can be array of numbers,
    *     or a `TypedArray`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor1d(values: TensorLike1D): Tensor1D = js.native
  def tensor1d(values: TensorLike1D, dtype: DataType): Tensor1D = js.native
  /**
    * Creates rank-2 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor2d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor2d([[1, 2], [3, 4]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor2d([1, 2, 3, 4], [2, 2]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. If not provided, it is inferred from
    *     `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor2d(values: TensorLike2D): Tensor2D = js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double]): Tensor2D = js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = js.native
  /**
    * Creates rank-3 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor3d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor3d([[[1], [2]], [[3], [4]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor3d([1, 2, 3, 4], [2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. If not provided,  it is inferred from
    *     `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor3d(values: TensorLike3D): Tensor3D = js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double]): Tensor3D = js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor3D = js.native
  /**
    * Creates rank-4 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor4d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor4d([[[[1], [2]], [[3], [4]]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor4d([1, 2, 3, 4], [1, 2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor4d(values: TensorLike4D): Tensor4D = js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double]): Tensor4D = js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double], dtype: DataType): Tensor4D = js.native
  /**
    * Creates rank-5 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor5d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor5d([[[[[1], [2]], [[3], [4]]]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor5d([1, 2, 3, 4, 5, 6, 7, 8], [1, 2, 2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor5d(values: TensorLike5D): Tensor5D = js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double]): Tensor5D = js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double], dtype: DataType): Tensor5D = js.native
  /**
    * Creates rank-6 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor6d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor6d([[[[[[1],[2]],[[3],[4]]],[[[5],[6]],[[7],[8]]]]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor6d([1, 2, 3, 4, 5, 6, 7, 8], [1, 1, 2, 2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor6d(values: TensorLike6D): Tensor6D = js.native
  def tensor6d(values: TensorLike6D, shape: js.Tuple6[Double, Double, Double, Double, Double, Double]): Tensor6D = js.native
  def tensor6d(
    values: TensorLike6D,
    shape: js.Tuple6[Double, Double, Double, Double, Double, Double],
    dtype: DataType
  ): Tensor6D = js.native
  /**
    * Creates a `tf.Tensor` with all elements set to 0.
    *
    * ```js
    * tf.zeros([2, 2]).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param dtype The type of an element in the resulting tensor. Can
    *     be 'float32', 'int32' or 'bool'. Defaults to 'float'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def zeros[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def zeros[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = js.native
}

