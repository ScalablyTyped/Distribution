package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.DataId
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "Tensor")
@js.native
class Tensor[R /* <: Rank */] protected ()
  extends typings.atTensorflowTfjs.atTensorflowTfjsMod.Tensor[R] {
  def this(
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    dataId: DataId,
    id: Double
  ) = this()
}

@JSImport("@tensorflow/tfjs-node", "tensor")
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

