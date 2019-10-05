package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike5D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "tensor5d")
@js.native
object tensor5d extends js.Object {
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
  def apply(values: TensorLike5D): Tensor5D = js.native
  def apply(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double]): Tensor5D = js.native
  def apply(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double], dtype: DataType): Tensor5D = js.native
}

