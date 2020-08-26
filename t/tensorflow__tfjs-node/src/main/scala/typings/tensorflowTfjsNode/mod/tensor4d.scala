package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "tensor4d")
@js.native
object tensor4d extends js.Object {
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
  def apply(values: TensorLike4D): Tensor4D = js.native
  def apply(values: TensorLike4D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor4D = js.native
  def apply(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double]): Tensor4D = js.native
  def apply(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double], dtype: DataType): Tensor4D = js.native
}

