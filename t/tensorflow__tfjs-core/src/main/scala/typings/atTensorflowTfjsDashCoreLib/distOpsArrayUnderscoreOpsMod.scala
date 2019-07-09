package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/array_ops", JSImport.Namespace)
@js.native
object distOpsArrayUnderscoreOpsMod extends js.Object {
  val depthToSpace: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D, 
    /* blockSize */ scala.Double, 
    /* dataFormat */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val eye: js.Function4[
    /* numRows */ scala.Double, 
    /* numColumns */ js.UndefOr[scala.Double], 
    /* batchShape */ js.UndefOr[
      js.Array[scala.Double] | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
    ], 
    /* dtype */ js.UndefOr[atTensorflowTfjsDashCoreLib.distTypesMod.DataType], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val multinomial: js.Function4[
    /* logits */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* numSamples */ scala.Double, 
    /* seed */ js.UndefOr[scala.Double], 
    /* normalized */ js.UndefOr[scala.Boolean], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val oneHot: js.Function4[
    /* indices */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* depth */ scala.Double, 
    /* onValue */ js.UndefOr[scala.Double], 
    /* offValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val pad1d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* paddings */ js.Tuple2[scala.Double, scala.Double], 
    /* constantValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val pad2d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* paddings */ js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]], 
    /* constantValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val pad3d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* paddings */ js.Tuple3[
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double]
    ], 
    /* constantValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val pad4d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* paddings */ js.Tuple4[
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double]
    ], 
    /* constantValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val setdiff1dAsync: js.Function2[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* y */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    js.Promise[
      js.Tuple2[
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]
    ]
  ] = js.native
  val unstack: js.Function2[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* axis */ js.UndefOr[scala.Double], 
    js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
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
  def buffer[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool,
    values: stdLib.Uint8Array
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64,
    values: stdLib.Float32Array
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32,
    values: stdLib.Float32Array
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32,
    values: stdLib.Int32Array
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string,
    values: js.Array[java.lang.String]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string] = js.native
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
  def print[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): scala.Unit = js.native
  def print[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, verbose: scala.Boolean): scala.Unit = js.native
  @js.native
  object batchToSpaceND extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, blockShape: js.Array[scala.Double], crops: js.Array[js.Array[scala.Double]]): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      blockShape: js.Array[scala.Double],
      crops: js.Array[js.Array[scala.Double]]
    ): T = js.native
  }
  
  @js.native
  object cast extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
    ): T = js.native
  }
  
  @js.native
  object cumsum extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      axis: scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      axis: scala.Double,
      exclusive: scala.Boolean
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      axis: scala.Double,
      exclusive: scala.Boolean,
      reverse: scala.Boolean
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, axis: scala.Double): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double,
      exclusive: scala.Boolean
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double,
      exclusive: scala.Boolean,
      reverse: scala.Boolean
    ): T = js.native
  }
  
  @js.native
  object expandDims extends js.Object {
    def apply[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R2] = js.native
    def apply[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      axis: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R2] = js.native
    def apply[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R2] = js.native
    def apply[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, axis: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R2] = js.native
  }
  
  @js.native
  object pad extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, paddings: js.Array[js.Tuple2[scala.Double, scala.Double]]): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, paddings: js.Array[js.Tuple2[scala.Double, scala.Double]], constantValue: scala.Double): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      paddings: js.Array[js.Tuple2[scala.Double, scala.Double]]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      paddings: js.Array[js.Tuple2[scala.Double, scala.Double]],
      constantValue: scala.Double
    ): T = js.native
  }
  
  @js.native
  object rand extends js.Object {
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      randFunction: js.Function0[scala.Double]
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      randFunction: js.Function0[scala.Double],
      dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  }
  
  @js.native
  object randomNormal extends js.Object {
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double,
      stdDev: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double,
      stdDev: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double,
      stdDev: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32,
      seed: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double,
      stdDev: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double,
      stdDev: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32,
      seed: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  }
  
  @js.native
  object randomUniform extends js.Object {
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      minval: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      minval: scala.Double,
      maxval: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      minval: scala.Double,
      maxval: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      minval: scala.Double,
      maxval: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
      seed: java.lang.String
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      minval: scala.Double,
      maxval: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
      seed: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  }
  
  @js.native
  object reshape extends js.Object {
    def apply[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R2] = js.native
    def apply[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R2] = js.native
  }
  
  @js.native
  object spaceToBatchND extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, blockShape: js.Array[scala.Double], paddings: js.Array[js.Array[scala.Double]]): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      blockShape: js.Array[scala.Double],
      paddings: js.Array[js.Array[scala.Double]]
    ): T = js.native
  }
  
  @js.native
  object squeeze extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      axis: js.Array[scala.Double]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, axis: js.Array[scala.Double]): T = js.native
  }
  
  @js.native
  object stack extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](tensors: js.Array[T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike]): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](tensors: js.Array[T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike], axis: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  }
  
  @js.native
  object tile extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, reps: js.Array[scala.Double]): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, reps: js.Array[scala.Double]): T = js.native
  }
  
  @js.native
  object truncatedNormal extends js.Object {
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double,
      stdDev: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double,
      stdDev: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double,
      stdDev: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32,
      seed: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double,
      stdDev: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      mean: scala.Double,
      stdDev: scala.Double,
      dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32,
      seed: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  }
  
}

