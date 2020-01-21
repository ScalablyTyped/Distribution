package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mergeSerializationMod {
  type AddLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add, 
    typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type AverageLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average, 
    typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type ConcatenateLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate, 
    typings.tensorflowTfjsLayers.mergeSerializationMod.ConcatenateLayerConfig
  ]
  type DotLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot, 
    typings.tensorflowTfjsLayers.mergeSerializationMod.DotLayerConfig
  ]
  type MaximumLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum, 
    typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type MergeLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/merge_serialization.MergeLayerSerialization['class_name'] */ js.Any
  type MergeLayerSerialization = typings.tensorflowTfjsLayers.mergeSerializationMod.AddLayerSerialization | typings.tensorflowTfjsLayers.mergeSerializationMod.MultiplyLayerSerialization | typings.tensorflowTfjsLayers.mergeSerializationMod.AverageLayerSerialization | typings.tensorflowTfjsLayers.mergeSerializationMod.MaximumLayerSerialization | typings.tensorflowTfjsLayers.mergeSerializationMod.MinimumLayerSerialization | typings.tensorflowTfjsLayers.mergeSerializationMod.ConcatenateLayerSerialization | typings.tensorflowTfjsLayers.mergeSerializationMod.DotLayerSerialization
  type MinimumLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum, 
    typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type MultiplyLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply, 
    typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
}
