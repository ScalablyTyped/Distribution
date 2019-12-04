package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatLayersRecurrentUnderscoreSerializationMod {
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.GRU
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.GRUCell
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.LSTM
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.LSTMCell
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.SimpleRNN
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.SimpleRNNCell
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.StackedRNNCells
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.BaseLayerSerialization
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.BaseSerialization

  type GRUCellSerialization = BaseSerialization[GRUCell, GRUCellConfig]
  type GRULayerSerialization = BaseLayerSerialization[GRU, GRULayerConfig]
  type LSTMCellSerialization = BaseSerialization[LSTMCell, LSTMCellConfig]
  type LSTMLayerSerialization = BaseLayerSerialization[LSTM, LSTMLayerConfig]
  type RNNCellSerialization = SimpleRNNCellSerialization | GRUCellSerialization | LSTMCellSerialization | StackedRNNCellsSerialization
  type RecurrentLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/recurrent_serialization.RecurrentLayerSerialization['class_name'] */ js.Any
  type RecurrentLayerSerialization = SimpleRNNLayerSerialization | LSTMLayerSerialization | GRULayerSerialization
  type SimpleRNNCellSerialization = BaseSerialization[SimpleRNNCell, SimpleRNNCellConfig]
  type SimpleRNNLayerSerialization = BaseLayerSerialization[SimpleRNN, SimpleRNNLayerConfig]
  type StackedRNNCellsSerialization = BaseSerialization[StackedRNNCells, StackedRNNCellsConfig]
}
