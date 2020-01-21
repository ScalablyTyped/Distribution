package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "variable")
@js.native
object variable extends js.Object {
  /**
    * Creates a new variable with the provided initial value.
    * ```js
    * const x = tf.variable(tf.tensor([1, 2, 3]));
    * x.assign(tf.tensor([4, 5, 6]));
    *
    * x.print();
    * ```
    *
    * @param initialValue Initial value for the tensor.
    * @param trainable If true, optimizers are allowed to update it.
    * @param name Name of the variable. Defaults to a unique id.
    * @param dtype If set, initialValue will be converted to the given type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R]): Variable[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R], trainable: Boolean): Variable[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R], trainable: Boolean, name: String): Variable[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R], trainable: Boolean, name: String, dtype: DataType): Variable[R] = js.native
}

