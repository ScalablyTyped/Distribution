package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object recurrentSerializationMod {
  type GRUCellSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRUCell, 
    typings.tensorflowTfjsLayers.recurrentSerializationMod.GRUCellConfig
  ]
  type GRULayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU, 
    typings.tensorflowTfjsLayers.recurrentSerializationMod.GRULayerConfig
  ]
  type LSTMCellSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTMCell, 
    typings.tensorflowTfjsLayers.recurrentSerializationMod.LSTMCellConfig
  ]
  type LSTMLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM, 
    typings.tensorflowTfjsLayers.recurrentSerializationMod.LSTMLayerConfig
  ]
  type RNNCellSerialization = typings.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNCellSerialization | typings.tensorflowTfjsLayers.recurrentSerializationMod.GRUCellSerialization | typings.tensorflowTfjsLayers.recurrentSerializationMod.LSTMCellSerialization | typings.tensorflowTfjsLayers.recurrentSerializationMod.StackedRNNCellsSerialization
  type RecurrentLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/recurrent_serialization.RecurrentLayerSerialization['class_name'] */ js.Any
  type RecurrentLayerSerialization = typings.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNLayerSerialization | typings.tensorflowTfjsLayers.recurrentSerializationMod.LSTMLayerSerialization | typings.tensorflowTfjsLayers.recurrentSerializationMod.GRULayerSerialization
  type SimpleRNNCellSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNNCell, 
    typings.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNCellConfig
  ]
  type SimpleRNNLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN, 
    typings.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNLayerConfig
  ]
  type StackedRNNCellsSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.StackedRNNCells, 
    typings.tensorflowTfjsLayers.recurrentSerializationMod.StackedRNNCellsConfig
  ]
}
