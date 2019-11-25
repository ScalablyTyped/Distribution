package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "Variable")
@js.native
class Variable[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */] protected ()
  extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Variable[R] {
  def this(
    initialValue: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R],
    trainable: Boolean,
    name: String,
    tensorId: Double
  ) = this()
}

@JSImport("@tensorflow/tfjs", "variable")
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
  def apply[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](initialValue: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R]): typings.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
  def apply[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](initialValue: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R], trainable: Boolean): typings.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
  def apply[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    initialValue: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R],
    trainable: Boolean,
    name: String
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
  def apply[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    initialValue: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R],
    trainable: Boolean,
    name: String,
    dtype: DataType
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
}

