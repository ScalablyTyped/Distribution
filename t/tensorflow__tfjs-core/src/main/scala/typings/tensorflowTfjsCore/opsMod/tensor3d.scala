package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike3D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "tensor3d")
@js.native
object tensor3d extends js.Object {
  /**
    * Creates rank-3 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor3d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor3d([[[1], [2]], [[3], [4]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor3d([1, 2, 3, 4], [2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. If not provided,  it is inferred from
    *     `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def apply(values: TensorLike3D): Tensor3D = js.native
  def apply(values: TensorLike3D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor3D = js.native
  def apply(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double]): Tensor3D = js.native
  def apply(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor3D = js.native
}

