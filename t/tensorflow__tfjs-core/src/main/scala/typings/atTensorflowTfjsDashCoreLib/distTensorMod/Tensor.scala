package typings
package atTensorflowTfjsDashCoreLib.distTensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tensor", "Tensor")
@js.native
class Tensor[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */] protected () extends js.Object {
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues, dataId: DataId) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues, dataId: DataId, backend: Backend) = this()
  /**
    * Id of the bucket holding the data for this tensor. Multiple arrays can
    * point to the same bucket (e.g. when calling array.reshape()).
    */
  var dataId: DataId = js.native
  /** The data type for the array. */
  val dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = js.native
  /** Unique id of this tensor. */
  val id: scala.Double = js.native
  val isDisposed: scala.Boolean = js.native
  var isDisposedInternal: scala.Boolean = js.native
  /** Whether this tensor has been globally kept. */
  var kept: scala.Boolean = js.native
  val rank: scala.Double = js.native
  /** The rank type for the array (see `Rank` enum). */
  val rankType: R = js.native
  /** The id of the scope this tensor is being tracked in. */
  var scopeId: scala.Double = js.native
  /** The shape of the tensor. */
  val shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any = js.native
  /** Number of elements in the tensor. */
  val size: scala.Double = js.native
  /**
    * Number of elements to skip in each dimension when indexing. See
    * https://docs.scipy.org/doc/numpy/reference/generated/\
    * numpy.ndarray.strides.html
    */
  val strides: js.Array[scala.Double] = js.native
  var throwIfDisposed: js.Any = js.native
  def abs[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def acos[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def acosh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def add[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def add[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def addStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def addStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def all[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def all[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double]): T = js.native
  def all[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double], keepDims: scala.Boolean): T = js.native
  def all[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  def all[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double, keepDims: scala.Boolean): T = js.native
  def any[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def any[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double]): T = js.native
  def any[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double], keepDims: scala.Boolean): T = js.native
  def any[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  def any[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double, keepDims: scala.Boolean): T = js.native
  def argMax[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def argMax[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  def argMin[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def argMin[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  /**
    * Returns the tensor data as a nested array. The transfer of data is done
    * asynchronously.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def array(): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ArrayMap[R] */ js.Any
  ] = js.native
  /**
    * Returns the tensor data as a nested array. The transfer of data is done
    * synchronously.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def arraySync(): /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ArrayMap[R] */ js.Any = js.native
  /** Converts a `tf.Tensor` to a `tf.Tensor1D`. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as1D(): Tensor1D = js.native
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor2D`.
    *
    * @param rows Number of rows in `tf.Tensor2D`.
    * @param columns Number of columns in `tf.Tensor2D`.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as2D(rows: scala.Double, columns: scala.Double): Tensor2D = js.native
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor3D`.
    *
    * @param rows Number of rows in `tf.Tensor3D`.
    * @param columns Number of columns in `tf.Tensor3D`.
    * @param depth Depth of `tf.Tensor3D`.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as3D(rows: scala.Double, columns: scala.Double, depth: scala.Double): Tensor3D = js.native
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor4D`.
    *
    * @param rows Number of rows in `tf.Tensor4D`.
    * @param columns Number of columns in `tf.Tensor4D`.
    * @param depth Depth of `tf.Tensor4D`.
    * @param depth2 4th dimension of `tf.Tensor4D`.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as4D(rows: scala.Double, columns: scala.Double, depth: scala.Double, depth2: scala.Double): Tensor4D = js.native
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor5D`.
    *
    * @param rows Number of rows in `tf.Tensor5D`.
    * @param columns Number of columns in `tf.Tensor5D`.
    * @param depth Depth of `tf.Tensor5D`.
    * @param depth2 4th dimension of `tf.Tensor5D`.
    * @param depth3 5th dimension of 'tf.Tensor5D'
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as5D(
    rows: scala.Double,
    columns: scala.Double,
    depth: scala.Double,
    depth2: scala.Double,
    depth3: scala.Double
  ): Tensor5D = js.native
  /** Converts a size-1 `tf.Tensor` to a `tf.Scalar`. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def asScalar(): Scalar = js.native
  /**
    * Casts a `tf.Tensor` to a specified dtype.
    *
    * @param dtype Data-type to cast the tensor to.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def asType[T /* <: this.type */](`this`: T, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): T = js.native
  def asin[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def asinh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def atan[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def atan2[T /* <: this.type */](`this`: T, x: T): T = js.native
  def atan2[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def atanh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def avgPool(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterSize: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def avgPool(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterSize: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def batchNorm(
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[R] = js.native
  def batchNorm(
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    offset: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[R] = js.native
  def batchNorm(
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    offset: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    scale: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[R] = js.native
  def batchNorm(
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    offset: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    scale: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    varianceEpsilon: scala.Double
  ): Tensor[R] = js.native
  /**
    * @deprecated Use `tf.batchNorm` instead, and note the positional argument
    *     change of scale, offset, and varianceEpsilon.
    */
  def batchNormalization(
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[R] = js.native
  def batchNormalization(
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    varianceEpsilon: scala.Double
  ): Tensor[R] = js.native
  def batchNormalization(
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    varianceEpsilon: scala.Double,
    scale: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[R] = js.native
  def batchNormalization(
    mean: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    variance: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    varianceEpsilon: scala.Double,
    scale: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    offset: Tensor[R] | Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[R] = js.native
  def batchToSpaceND[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, blockShape: js.Array[scala.Double], crops: js.Array[js.Array[scala.Double]]): T = js.native
  /** Returns a promise of `tf.TensorBuffer` that holds the underlying data. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def buffer(): js.Promise[
    TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32]
  ] = js.native
  /** Returns a `tf.TensorBuffer` that holds the underlying data. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def bufferSync(): TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32] = js.native
  /** Returns the underlying bytes of the tensor's data. */
  def bytes(): js.Promise[js.Array[stdLib.Uint8Array] | stdLib.Uint8Array] = js.native
  def cast[T /* <: this.type */](dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): T = js.native
  def ceil[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def clipByValue(min: scala.Double, max: scala.Double): Tensor[R] = js.native
  /** Returns a copy of the tensor. See `tf.clone` for details. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def clone[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def concat[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, x: T): T = js.native
  def concat[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, x: T, axis: scala.Double): T = js.native
  def concat[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, x: js.Array[T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike]): T = js.native
  def concat[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    `this`: T,
    x: js.Array[T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike],
    axis: scala.Double
  ): T = js.native
  def conv1d(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D,
    stride: scala.Double,
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def conv1d(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D,
    stride: scala.Double,
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NWC
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def conv1d(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D,
    stride: scala.Double,
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NWC,
    dilation: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def conv1d(
    `this`: Tensor[
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
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def conv2d(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def conv2d(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC,
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double])
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def conv2d(
    `this`: Tensor[
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
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    outputShape: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def conv2dTranspose(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    outputShape: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def cos[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def cosh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  /**
    * Returns the cumulative sum of the `tf.Tensor` along `axis`.
    *
    * @param axis The axis along which to sum. Optional. Defaults to 0.
    * @param exclusive Whether to perform exclusive cumulative sum. Defaults to
    *    false. If set to true then the sum of each tensor entry does not include
    *    its own value, but only the values previous to it along the specified
    *    axis.
    * @param reverse Whether to sum in the opposite direction. Defaults to
    *    false.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def cumsum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def cumsum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  def cumsum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double, exclusive: scala.Boolean): T = js.native
  def cumsum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double, exclusive: scala.Boolean, reverse: scala.Boolean): T = js.native
  /**
    * Asynchronously downloads the values from the `tf.Tensor`. Returns a promise
    * of `TypedArray` that resolves when the computation has finished.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def data(): js.Promise[stdLib.Float32Array] = js.native
  def dataSync(): js.Array[java.lang.String] = js.native
  /**
    * Synchronously downloads the values from the `tf.Tensor`. This blocks the UI
    * thread until the values are ready, which can cause performance issues.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  @JSName("dataSync")
  def dataSync_Float32Array(): stdLib.Float32Array = js.native
  @JSName("dataSync")
  def dataSync_Int32Array(): stdLib.Int32Array = js.native
  @JSName("dataSync")
  def dataSync_Uint8Array(): stdLib.Uint8Array = js.native
  @JSName("depthToSpace")
  def depthToSpace_NCHW(
    `this`: Tensor4D,
    blockSize: scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW
  ): Tensor4D = js.native
  @JSName("depthToSpace")
  def depthToSpace_NHWC(
    `this`: Tensor4D,
    blockSize: scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC
  ): Tensor4D = js.native
  def depthwiseConv2D(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def depthwiseConv2D(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def depthwiseConv2D(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC,
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double])
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def depthwiseConv2D(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC,
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  /**
    * Disposes `tf.Tensor` from memory.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def dispose(): scala.Unit = js.native
  def div[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def div[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def divStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def divStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def dot(b: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def dot(b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def elu[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def equal[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def equal[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def equalStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def equalStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def erf[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def exp[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  /**
    * Returns a `tf.Tensor` that has expanded rank, by inserting a dimension
    * into the tensor's shape. See `tf.expandDims` for details.
    *
    * @param axis The dimension index at which to insert shape of 1. Defaults to
    *    0 (the first dimension).
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def expandDims[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](): Tensor[R2] = js.native
  def expandDims[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](axis: scala.Double): Tensor[R2] = js.native
  def expm1[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def fft(`this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  /** Flatten a Tensor to a 1D array. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def flatten(): Tensor1D = js.native
  def floor[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def floorDiv[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def floorDiv[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def gather[T /* <: this.type */](`this`: T, indices: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def gather[T /* <: this.type */](`this`: T, indices: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], axis: scala.Double): T = js.native
  def gather[T /* <: this.type */](`this`: T, indices: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def gather[T /* <: this.type */](`this`: T, indices: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, axis: scala.Double): T = js.native
  def greater[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def greater[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def greaterEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def greaterEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def greaterEqualStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def greaterEqualStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def greaterStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def greaterStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def ifft(`this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def irfft(`this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def isFinite[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def isInf[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def isNaN[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def leakyRelu(): Tensor[R] = js.native
  def leakyRelu(alpha: scala.Double): Tensor[R] = js.native
  def less[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def less[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def lessEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def lessEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def lessEqualStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def lessEqualStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def lessStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def lessStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def localResponseNormalization(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ]
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def localResponseNormalization(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    radius: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def localResponseNormalization(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    radius: scala.Double,
    bias: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def localResponseNormalization(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    radius: scala.Double,
    bias: scala.Double,
    alpha: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def localResponseNormalization(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    radius: scala.Double,
    bias: scala.Double,
    alpha: scala.Double,
    beta: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def log[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def log1p[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def logSigmoid[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def logSoftmax[T /* <: this.type */](`this`: T): T = js.native
  def logSoftmax[T /* <: this.type */](`this`: T, axis: scala.Double): T = js.native
  def logSumExp[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def logSumExp[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double]): T = js.native
  def logSumExp[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double], keepDims: scala.Boolean): T = js.native
  def logSumExp[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  def logSumExp[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double, keepDims: scala.Boolean): T = js.native
  def logicalAnd(x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def logicalAnd(x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def logicalNot[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def logicalOr(x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def logicalOr(x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def logicalXor(x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def logicalXor(x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def matMul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, b: T): T = js.native
  def matMul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, b: T, transposeA: scala.Boolean): T = js.native
  def matMul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, b: T, transposeA: scala.Boolean, transposeB: scala.Boolean): T = js.native
  def matMul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def matMul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, transposeA: scala.Boolean): T = js.native
  def matMul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    `this`: T,
    b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    transposeA: scala.Boolean,
    transposeB: scala.Boolean
  ): T = js.native
  def max[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def max[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double]): T = js.native
  def max[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double], keepDims: scala.Boolean): T = js.native
  def max[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  def max[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double, keepDims: scala.Boolean): T = js.native
  def maxPool(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterSize: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def maxPool(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterSize: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def maximum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def maximum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def maximumStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def maximumStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def mean[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def mean[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double]): T = js.native
  def mean[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double], keepDims: scala.Boolean): T = js.native
  def mean[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  def mean[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double, keepDims: scala.Boolean): T = js.native
  def min[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def min[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double]): T = js.native
  def min[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double], keepDims: scala.Boolean): T = js.native
  def min[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  def min[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double, keepDims: scala.Boolean): T = js.native
  def minimum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def minimum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def minimumStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def minimumStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def mod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def mod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def modStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def modStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def mul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def mul[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def mulStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def mulStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def neg[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def norm(): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def norm(ord: scala.Double): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def norm(ord: scala.Double, axis: js.Array[scala.Double]): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def norm(ord: scala.Double, axis: js.Array[scala.Double], keepDims: scala.Boolean): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def norm(ord: scala.Double, axis: scala.Double): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def norm(ord: scala.Double, axis: scala.Double, keepDims: scala.Boolean): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.euclidean): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_euclidean(
    ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.euclidean,
    axis: js.Array[scala.Double]
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_euclidean(
    ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.euclidean,
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.euclidean, axis: scala.Double): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_euclidean(
    ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.euclidean,
    axis: scala.Double,
    keepDims: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.fro): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_fro(
    ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.fro,
    axis: js.Array[scala.Double]
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_fro(
    ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.fro,
    axis: js.Array[scala.Double],
    keepDims: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.fro, axis: scala.Double): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("norm")
  def norm_fro(
    ord: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.fro,
    axis: scala.Double,
    keepDims: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def notEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def notEqual[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def notEqualStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def notEqualStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def oneHot(`this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], depth: scala.Double): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def oneHot(
    `this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    depth: scala.Double,
    onValue: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def oneHot(
    `this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    depth: scala.Double,
    onValue: scala.Double,
    offValue: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def onesLike[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def pad[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, paddings: js.Array[js.Tuple2[scala.Double, scala.Double]]): T = js.native
  def pad[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, paddings: js.Array[js.Tuple2[scala.Double, scala.Double]], constantValue: scala.Double): T = js.native
  def pool(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    windowShape: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    poolingType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.avg | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.max,
    padding: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def pool(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    windowShape: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    poolingType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.avg | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.max,
    padding: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dilationRate: scala.Double | (js.Tuple2[scala.Double, scala.Double])
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def pool(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    windowShape: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    poolingType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.avg | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.max,
    padding: scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dilationRate: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double])
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def pow[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, exp: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def pow[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, exp: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def powStrict(exp: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): Tensor[R] = js.native
  def powStrict(exp: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): Tensor[R] = js.native
  def prelu(alpha: Tensor[R]): Tensor[R] = js.native
  def prelu(alpha: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): Tensor[R] = js.native
  /**
    * Prints the `tf.Tensor`. See `tf.print` for details.
    *
    * @param verbose Whether to print verbose information about the tensor,
    *    including dtype and size.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def print(): scala.Unit = js.native
  def print(verbose: scala.Boolean): scala.Unit = js.native
  def prod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def prod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double]): T = js.native
  def prod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double], keepDims: scala.Boolean): T = js.native
  def prod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  def prod[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double, keepDims: scala.Boolean): T = js.native
  def reciprocal[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def relu[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  /**
    * Reshapes the tensor into the provided shape.
    * See `tf.reshape` for more details.
    *
    * @param newShape An array of integers defining the output tensor shape.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def reshape[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    newShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
  ): Tensor[R2] = js.native
  /**
    * Reshapes the tensor into the shape of the provided tensor.
    *
    * @param x The tensor of required shape.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def reshapeAs[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def resizeBilinear(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    newShape2D: js.Tuple2[scala.Double, scala.Double]
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def resizeBilinear(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    newShape2D: js.Tuple2[scala.Double, scala.Double],
    alignCorners: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def resizeNearestNeighbor(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    newShape2D: js.Tuple2[scala.Double, scala.Double]
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def resizeNearestNeighbor(
    `this`: Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    newShape2D: js.Tuple2[scala.Double, scala.Double],
    alignCorners: scala.Boolean
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def reverse[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def reverse[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, axis: js.Array[scala.Double]): T = js.native
  def reverse[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, axis: scala.Double): T = js.native
  def rfft(`this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def round[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def rsqrt[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def selu[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    `this`: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    depthwiseFilter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    pointwiseFilter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same
  ): T = js.native
  def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    `this`: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    depthwiseFilter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    pointwiseFilter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    dilation: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
  ): T = js.native
  def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    `this`: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    depthwiseFilter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    pointwiseFilter: Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    dilation: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW
  ): T = js.native
  def sigmoid[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def sign[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def sin[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def sinh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def slice[T /* <: Tensor[R] */](`this`: T, begin: js.Array[scala.Double]): T = js.native
  def slice[T /* <: Tensor[R] */](`this`: T, begin: js.Array[scala.Double], size: js.Array[scala.Double]): T = js.native
  def slice[T /* <: Tensor[R] */](`this`: T, begin: js.Array[scala.Double], size: scala.Double): T = js.native
  def slice[T /* <: Tensor[R] */](`this`: T, begin: scala.Double): T = js.native
  def slice[T /* <: Tensor[R] */](`this`: T, begin: scala.Double, size: js.Array[scala.Double]): T = js.native
  def slice[T /* <: Tensor[R] */](`this`: T, begin: scala.Double, size: scala.Double): T = js.native
  def softmax[T /* <: this.type */](`this`: T): T = js.native
  def softmax[T /* <: this.type */](`this`: T, dim: scala.Double): T = js.native
  def softplus[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def spaceToBatchND[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, blockShape: js.Array[scala.Double], paddings: js.Array[js.Array[scala.Double]]): T = js.native
  def split[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, numOrSizeSplits: js.Array[scala.Double]): js.Array[T] = js.native
  def split[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, numOrSizeSplits: js.Array[scala.Double], axis: scala.Double): js.Array[T] = js.native
  def split[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, numOrSizeSplits: scala.Double): js.Array[T] = js.native
  def split[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, numOrSizeSplits: scala.Double, axis: scala.Double): js.Array[T] = js.native
  def sqrt[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def square[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def squaredDifference[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def squaredDifference[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def squaredDifferenceStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def squaredDifferenceStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  /**
    * Returns a `tf.Tensor` with dimensions of size 1 removed from the shape.
    * See `tf.squeeze` for more details.
    *
    * @param axis A list of numbers. If specified, only squeezes the
    *    dimensions listed. The dimension index starts at 0. It is an error to
    *    squeeze a dimension that is not 1.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def squeeze[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def squeeze[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double]): T = js.native
  def stack(x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def stack(x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], axis: scala.Double): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def step[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def step[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, alpha: scala.Double): T = js.native
  def stridedSlice(
    `this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    begin: js.Array[scala.Double],
    end: js.Array[scala.Double],
    strides: js.Array[scala.Double]
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def stridedSlice(
    `this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    begin: js.Array[scala.Double],
    end: js.Array[scala.Double],
    strides: js.Array[scala.Double],
    beginMask: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def stridedSlice(
    `this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    begin: js.Array[scala.Double],
    end: js.Array[scala.Double],
    strides: js.Array[scala.Double],
    beginMask: scala.Double,
    endMask: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def stridedSlice(
    `this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    begin: js.Array[scala.Double],
    end: js.Array[scala.Double],
    strides: js.Array[scala.Double],
    beginMask: scala.Double,
    endMask: scala.Double,
    ellipsisMask: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def stridedSlice(
    `this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    begin: js.Array[scala.Double],
    end: js.Array[scala.Double],
    strides: js.Array[scala.Double],
    beginMask: scala.Double,
    endMask: scala.Double,
    ellipsisMask: scala.Double,
    newAxisMask: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def stridedSlice(
    `this`: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    begin: js.Array[scala.Double],
    end: js.Array[scala.Double],
    strides: js.Array[scala.Double],
    beginMask: scala.Double,
    endMask: scala.Double,
    ellipsisMask: scala.Double,
    newAxisMask: scala.Double,
    shrinkAxisMask: scala.Double
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def sub[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): T = js.native
  def sub[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def subStrict[T /* <: this.type */](`this`: T, x: T): T = js.native
  def subStrict[T /* <: this.type */](`this`: T, x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def sum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](): T = js.native
  def sum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double]): T = js.native
  def sum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: js.Array[scala.Double], keepDims: scala.Boolean): T = js.native
  def sum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double): T = js.native
  def sum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](axis: scala.Double, keepDims: scala.Boolean): T = js.native
  def tan[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def tanh[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def tile[T /* <: this.type */](`this`: T, reps: js.Array[scala.Double]): T = js.native
  /** Casts the array to type `bool` */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def toBool(): this.type = js.native
  /** Casts the array to type `float32` */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def toFloat[T /* <: this.type */](`this`: T): T = js.native
  /** Casts the array to type `int32` */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def toInt(): this.type = js.native
  def toString(verbose: scala.Boolean): java.lang.String = js.native
  def topk[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): atTensorflowTfjsDashCoreLib.Anon_Indices[T] = js.native
  def topk[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, k: scala.Double): atTensorflowTfjsDashCoreLib.Anon_Indices[T] = js.native
  def topk[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, k: scala.Double, sorted: scala.Boolean): atTensorflowTfjsDashCoreLib.Anon_Indices[T] = js.native
  def transpose[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
  def transpose[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, perm: js.Array[scala.Double]): T = js.native
  def unsortedSegmentSum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T, segmentIds: Tensor1D, numSegments: scala.Double): T = js.native
  def unsortedSegmentSum[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    `this`: T,
    segmentIds: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike1D,
    numSegments: scala.Double
  ): T = js.native
  def unstack(): js.Array[Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]] = js.native
  def unstack(axis: scala.Double): js.Array[Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]] = js.native
  def variable(): Variable[R] = js.native
  def variable(trainable: scala.Boolean): Variable[R] = js.native
  def variable(trainable: scala.Boolean, name: java.lang.String): Variable[R] = js.native
  def variable(
    trainable: scala.Boolean,
    name: java.lang.String,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): Variable[R] = js.native
  def where(
    condition: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def where(
    condition: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def where(
    condition: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    x: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def where(
    condition: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def zerosLike[T /* <: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](`this`: T): T = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/tensor", "Tensor")
@js.native
object Tensor extends js.Object {
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool]
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64]
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  /**
    * Makes a new tensor with the provided shape and values. Values should be in
    * a flat array.
    */
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32]
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32]
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string]
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
}

