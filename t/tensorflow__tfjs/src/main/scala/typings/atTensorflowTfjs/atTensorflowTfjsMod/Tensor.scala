package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsStrings.bool
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.complex64
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.float32
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.int32
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.string
import typings.atTensorflowTfjsDashCore.distTensorMod.Backend
import typings.atTensorflowTfjsDashCore.distTensorMod.DataId
import typings.atTensorflowTfjsDashCore.distTensorMod.TensorData
import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "Tensor")
@js.native
class Tensor[R /* <: Rank */] protected ()
  extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor[R] {
  protected def this(
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ) = this()
  protected def this(
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    values: BackendValues
  ) = this()
  protected def this(
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    values: BackendValues,
    dataId: DataId
  ) = this()
  protected def this(
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    values: BackendValues,
    dataId: DataId,
    backend: Backend
  ) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "Tensor")
@js.native
object Tensor extends js.Object {
  @JSName("make")
  def make_bool[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[bool]
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[bool],
    dtype: bool
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[bool],
    dtype: bool,
    backend: Backend
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[complex64]
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[complex64],
    dtype: complex64
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[complex64],
    dtype: complex64,
    backend: Backend
  ): T = js.native
  /**
    * Makes a new tensor with the provided shape and values. Values should be in
    * a flat array.
    */
  @JSName("make")
  def make_float32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[float32]
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[float32],
    dtype: float32
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[float32],
    dtype: float32,
    backend: Backend
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[int32]
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[int32],
    dtype: int32
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[int32],
    dtype: int32,
    backend: Backend
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[string]
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[string],
    dtype: string
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[string],
    dtype: string,
    backend: Backend
  ): T = js.native
}

@JSImport("@tensorflow/tfjs", "tensor")
@js.native
object tensor extends js.Object {
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
  def apply[R /* <: Rank */](values: TensorLike): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
}

