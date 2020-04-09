package typings.tensorflowTfjsCore

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorMod.TensorBuffer
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/array_ops", JSImport.Namespace)
@js.native
object arrayOpsMod extends js.Object {
  val depthToSpace: js.Function3[
    /* x */ Tensor4D | TensorLike4D, 
    /* blockSize */ Double, 
    /* dataFormat */ js.UndefOr[NHWC | NCHW], 
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
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): TensorBuffer[R, float32] = js.native
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
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
  }
  
  @js.native
  object expandDims extends js.Object {
    def apply[R2 /* <: Rank */](x: TensorLike): Tensor[R2] = js.native
    def apply[R2 /* <: Rank */](x: TensorLike, axis: Double): Tensor[R2] = js.native
    def apply[R2 /* <: Rank */](x: Tensor[Rank]): Tensor[R2] = js.native
    def apply[R2 /* <: Rank */](x: Tensor[Rank], axis: Double): Tensor[R2] = js.native
  }
  
  @js.native
  object reshape extends js.Object {
    def apply[R2 /* <: Rank */](
      x: TensorLike,
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
    ): Tensor[R2] = js.native
    def apply[R2 /* <: Rank */](
      x: Tensor[Rank],
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
    ): Tensor[R2] = js.native
  }
  
  @js.native
  object spaceToBatchND extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
  }
  
  @js.native
  object squeeze extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  }
  
  @js.native
  object stack extends js.Object {
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): Tensor[Rank] = js.native
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[Rank] = js.native
  }
  
}

