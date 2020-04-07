package typings.tensorflowTfjsLayers.recurrentSerializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/recurrent_serialization.RecurrentLayerSerialization['class_name'] */
/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU
*/
trait RecurrentLayerClassName extends js.Object

object RecurrentLayerClassName {
  @scala.inline
  def GRU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU = this.cast("GRU")
  @scala.inline
  def LSTM: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM = this.cast("LSTM")
  @scala.inline
  def SimpleRNN: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN = this.cast("SimpleRNN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

