package typings.tensorflowTfjsCore.distTensorMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/tensor", "Variable")
@js.native
class Variable[R /* <: Rank */] protected () extends Tensor[R] {
  def this(initialValue: Tensor[R], trainable: Boolean, name: String, tensorId: Double) = this()
  
  /**
    * Assign a new `tf.Tensor` to this variable. The new `tf.Tensor` must have
    * the same shape and dtype as the old `tf.Tensor`.
    *
    * @param newValue New tensor to be assigned to this variable.
    *
    * @doc {heading: 'Tensors', subheading: 'Classes'}
    */
  def assign(newValue: Tensor[R]): Unit = js.native
  
  var name: String = js.native
  
  var trainable: Boolean = js.native
}
