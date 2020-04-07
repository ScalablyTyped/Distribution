package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/optimizer_config.OptimizerSerialization['class_name'] */
/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp
*/
trait OptimizerClassName extends js.Object

object OptimizerClassName {
  @scala.inline
  def Adadelta: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta = this.cast("Adadelta")
  @scala.inline
  def Adagrad: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad = this.cast("Adagrad")
  @scala.inline
  def Adam: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam = this.cast("Adam")
  @scala.inline
  def Adamax: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax = this.cast("Adamax")
  @scala.inline
  def Momentum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum = this.cast("Momentum")
  @scala.inline
  def RMSProp: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp = this.cast("RMSProp")
  @scala.inline
  def SGD: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD = this.cast("SGD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

