package typings.atTensorflowTfjsDashCore.distTensorMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tensor", "Variable")
@js.native
class Variable[R /* <: Rank */] protected () extends Tensor[R] {
  def this(initialValue: Tensor[R], trainable: Boolean, name: String, tensorId: Double) = this()
  var name: String = js.native
  var trainable: Boolean = js.native
  /**
    * Assign a new `tf.Tensor` to this variable. The new `tf.Tensor` must have
    * the same shape and dtype as the old `tf.Tensor`.
    *
    * @param newValue New tensor to be assigned to this variable.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def assign(newValue: Tensor[R]): Unit = js.native
}

