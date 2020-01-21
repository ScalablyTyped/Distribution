package typings.tensorflowTfjsLayers.activationConfigMod

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh
*/
trait ActivationIdentifier extends js.Object

object ActivationIdentifier {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elu: elu_ = this.cast("elu")
  @scala.inline
  def hardSigmoid: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid = this.cast("hardSigmoid")
  @scala.inline
  def linear: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear = this.cast("linear")
  @scala.inline
  def relu: relu_ = this.cast("relu")
  @scala.inline
  def relu6: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6 = this.cast("relu6")
  @scala.inline
  def selu: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu = this.cast("selu")
  @scala.inline
  def sigmoid: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid = this.cast("sigmoid")
  @scala.inline
  def softmax: softmax_ = this.cast("softmax")
  @scala.inline
  def softplus: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus = this.cast("softplus")
  @scala.inline
  def softsign: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign = this.cast("softsign")
  @scala.inline
  def tanh: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh = this.cast("tanh")
}

