package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object poolingSerializationMod {
  type AveragePooling1DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D, 
    typings.tensorflowTfjsLayers.poolingSerializationMod.Pooling1DLayerConfig
  ]
  type AveragePooling2DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D, 
    typings.tensorflowTfjsLayers.poolingSerializationMod.Pooling2DLayerConfig
  ]
  type GlobalAveragePooling1DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D, 
    typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type GlobalAveragePooling2DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D, 
    typings.tensorflowTfjsLayers.poolingSerializationMod.GlobalPooling2DLayerConfig
  ]
  type GlobalMaxPooling1DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D, 
    typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type GlobalMaxPooling2DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D, 
    typings.tensorflowTfjsLayers.poolingSerializationMod.GlobalPooling2DLayerConfig
  ]
  type MaxPooling1DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D, 
    typings.tensorflowTfjsLayers.poolingSerializationMod.Pooling1DLayerConfig
  ]
  type MaxPooling2DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D, 
    typings.tensorflowTfjsLayers.poolingSerializationMod.Pooling2DLayerConfig
  ]
  type PoolingLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/pooling_serialization.PoolingLayerSerialization['class_name'] */ js.Any
  type PoolingLayerSerialization = typings.tensorflowTfjsLayers.poolingSerializationMod.MaxPooling1DLayerSerialization | typings.tensorflowTfjsLayers.poolingSerializationMod.AveragePooling1DLayerSerialization | typings.tensorflowTfjsLayers.poolingSerializationMod.MaxPooling2DLayerSerialization | typings.tensorflowTfjsLayers.poolingSerializationMod.AveragePooling2DLayerSerialization | typings.tensorflowTfjsLayers.poolingSerializationMod.GlobalAveragePooling1DLayerSerialization | typings.tensorflowTfjsLayers.poolingSerializationMod.GlobalMaxPooling1DLayerSerialization | typings.tensorflowTfjsLayers.poolingSerializationMod.GlobalAveragePooling2DLayerSerialization | typings.tensorflowTfjsLayers.poolingSerializationMod.GlobalMaxPooling2DLayerSerialization
}
