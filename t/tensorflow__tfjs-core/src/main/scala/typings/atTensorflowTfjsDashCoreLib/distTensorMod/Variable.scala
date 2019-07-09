package typings
package atTensorflowTfjsDashCoreLib.distTensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tensor", "Variable")
@js.native
/**
  * Private constructor since we cannot add logic before calling `super()`.
  * Instead, we expose static `Variable.variable` method below, which will be
  * added to global namespace.
  */
class Variable[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */] protected () extends Tensor[R] {
  var name: java.lang.String = js.native
  var trainable: scala.Boolean = js.native
  /**
    * Assign a new `tf.Tensor` to this variable. The new `tf.Tensor` must have
    * the same shape and dtype as the old `tf.Tensor`.
    *
    * @param newValue New tensor to be assigned to this variable.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def assign(newValue: Tensor[R]): scala.Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/tensor", "Variable")
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
  def variable[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](initialValue: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R]): atTensorflowTfjsDashCoreLib.distTensorMod.Variable[R] = js.native
  def variable[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](initialValue: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R], trainable: scala.Boolean): atTensorflowTfjsDashCoreLib.distTensorMod.Variable[R] = js.native
  def variable[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    initialValue: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R],
    trainable: scala.Boolean,
    name: java.lang.String
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Variable[R] = js.native
  def variable[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    initialValue: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R],
    trainable: scala.Boolean,
    name: java.lang.String,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Variable[R] = js.native
}

