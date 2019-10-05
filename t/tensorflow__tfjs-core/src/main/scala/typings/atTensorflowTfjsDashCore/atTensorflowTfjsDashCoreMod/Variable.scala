package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "Variable")
@js.native
/**
  * Private constructor since we cannot add logic before calling `super()`.
  * Instead, we expose static `Variable.variable` method below, which will be
  * added to global namespace.
  */
class Variable[R /* <: Rank */] protected ()
  extends typings.atTensorflowTfjsDashCore.distTensorMod.Variable[R]

/* static members */
@JSImport("@tensorflow/tfjs-core", "Variable")
@js.native
object Variable extends js.Object {
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
  def variable[R /* <: Rank */](initialValue: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R]): typings.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
  def variable[R /* <: Rank */](initialValue: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R], trainable: Boolean): typings.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
  def variable[R /* <: Rank */](
    initialValue: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R],
    trainable: Boolean,
    name: String
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
  def variable[R /* <: Rank */](
    initialValue: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R],
    trainable: Boolean,
    name: String,
    dtype: DataType
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
}

@JSImport("@tensorflow/tfjs-core", "variable")
@js.native
object variable
  extends TopLevel[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Variable.variable */ js.Any
    ]

