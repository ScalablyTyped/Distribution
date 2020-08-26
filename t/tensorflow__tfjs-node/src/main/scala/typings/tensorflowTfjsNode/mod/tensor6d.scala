package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike6D
import typings.tensorflowTfjsCore.tensorMod.Tensor6D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "tensor6d")
@js.native
object tensor6d extends js.Object {
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
  def apply(values: TensorLike6D): Tensor6D = js.native
  def apply(values: TensorLike6D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor6D = js.native
  def apply(values: TensorLike6D, shape: js.Tuple6[Double, Double, Double, Double, Double, Double]): Tensor6D = js.native
  def apply(
    values: TensorLike6D,
    shape: js.Tuple6[Double, Double, Double, Double, Double, Double],
    dtype: DataType
  ): Tensor6D = js.native
}

