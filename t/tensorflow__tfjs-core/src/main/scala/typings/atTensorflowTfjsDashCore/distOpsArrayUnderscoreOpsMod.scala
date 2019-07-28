package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCHW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NHWC
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.bool
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.complex64
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.float32
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.int32
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.string
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike4D
import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/array_ops", JSImport.Namespace)
@js.native
object distOpsArrayUnderscoreOpsMod extends js.Object {
  val depthToSpace: js.Function3[
    /* x */ Tensor4D | TensorLike4D, 
    /* blockSize */ Double, 
    /* dataFormat */ js.UndefOr[NHWC | NCHW], 
    Tensor4D
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
  val multinomial: js.Function4[
    /* logits */ Tensor1D | Tensor2D | TensorLike, 
    /* numSamples */ Double, 
    /* seed */ js.UndefOr[Double], 
    /* normalized */ js.UndefOr[Boolean], 
    Tensor1D | Tensor2D
  ] = js.native
  val oneHot: js.Function4[
    /* indices */ Tensor[Rank] | TensorLike, 
    /* depth */ Double, 
    /* onValue */ js.UndefOr[Double], 
    /* offValue */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
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
  val setdiff1dAsync: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* y */ Tensor[Rank] | TensorLike, 
    js.Promise[js.Tuple2[Tensor[Rank], Tensor[Rank]]]
  ] = js.native
  val unstack: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Array[Tensor[Rank]]
  ] = js.native
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
  @js.native
  object batchToSpaceND extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
  }
  
  @js.native
  object cast extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, dtype: DataType): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, dtype: DataType): T = js.native
  }
  
  @js.native
  object cumsum extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
  }
  
  @js.native
  object expandDims extends js.Object {
    def apply[R2 /* <: Rank */](x: Tensor[Rank]): Tensor[R2] = js.native
    def apply[R2 /* <: Rank */](x: Tensor[Rank], axis: Double): Tensor[R2] = js.native
    def apply[R2 /* <: Rank */](x: TensorLike): Tensor[R2] = js.native
    def apply[R2 /* <: Rank */](x: TensorLike, axis: Double): Tensor[R2] = js.native
  }
  
  @js.native
  object pad extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
  }
  
  @js.native
  object rand extends js.Object {
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      randFunction: js.Function0[Double]
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      randFunction: js.Function0[Double],
      dtype: DataType
    ): Tensor[R] = js.native
  }
  
  @js.native
  object randomNormal extends js.Object {
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double,
      stdDev: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double,
      stdDev: Double,
      dtype: float32
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double,
      stdDev: Double,
      dtype: float32,
      seed: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double,
      stdDev: Double,
      dtype: int32
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double,
      stdDev: Double,
      dtype: int32,
      seed: Double
    ): Tensor[R] = js.native
  }
  
  @js.native
  object randomUniform extends js.Object {
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      minval: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      minval: Double,
      maxval: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      minval: Double,
      maxval: Double,
      dtype: DataType
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      minval: Double,
      maxval: Double,
      dtype: DataType,
      seed: String
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      minval: Double,
      maxval: Double,
      dtype: DataType,
      seed: Double
    ): Tensor[R] = js.native
  }
  
  @js.native
  object reshape extends js.Object {
    def apply[R2 /* <: Rank */](
      x: Tensor[Rank],
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
    ): Tensor[R2] = js.native
    def apply[R2 /* <: Rank */](
      x: TensorLike,
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
    ): Tensor[R2] = js.native
  }
  
  @js.native
  object spaceToBatchND extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
  }
  
  @js.native
  object squeeze extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  }
  
  @js.native
  object stack extends js.Object {
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): Tensor[Rank] = js.native
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[Rank] = js.native
  }
  
  @js.native
  object tile extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, reps: js.Array[Double]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, reps: js.Array[Double]): T = js.native
  }
  
  @js.native
  object truncatedNormal extends js.Object {
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double,
      stdDev: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double,
      stdDev: Double,
      dtype: float32
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double,
      stdDev: Double,
      dtype: float32,
      seed: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double,
      stdDev: Double,
      dtype: int32
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: Double,
      stdDev: Double,
      dtype: int32,
      seed: Double
    ): Tensor[R] = js.native
  }
  
}

