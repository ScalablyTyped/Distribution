package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wrappersSerializationMod {
  type BidirectionalLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional, 
    typings.tensorflowTfjsLayers.wrappersSerializationMod.BidirectionalLayerConfig
  ]
  type TimeDistributedLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed, 
    typings.tensorflowTfjsLayers.wrappersSerializationMod.TimeDistributedLayerConfig
  ]
  type WrapperLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/wrappers_serialization.WrapperLayerSerialization['class_name'] */ js.Any
  type WrapperLayerSerialization = typings.tensorflowTfjsLayers.wrappersSerializationMod.TimeDistributedLayerSerialization | typings.tensorflowTfjsLayers.wrappersSerializationMod.BidirectionalLayerSerialization
}
