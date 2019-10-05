package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "tensor1d")
@js.native
object tensor1d extends js.Object {
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
  def apply(values: TensorLike1D): Tensor1D = js.native
  def apply(values: TensorLike1D, dtype: DataType): Tensor1D = js.native
}

