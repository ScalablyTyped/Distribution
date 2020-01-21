package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object convolutionalSerializationMod {
  type Conv1DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D, 
    typings.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type Conv2DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D, 
    typings.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type Conv2DTransposeLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose, 
    typings.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type ConvolutionalLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/convolutional_serialization.ConvolutionalLayerSerialization['class_name'] */ js.Any
  type ConvolutionalLayerSerialization = typings.tensorflowTfjsLayers.convolutionalSerializationMod.Conv1DLayerSerialization | typings.tensorflowTfjsLayers.convolutionalSerializationMod.Conv2DLayerSerialization | typings.tensorflowTfjsLayers.convolutionalSerializationMod.Conv2DTransposeLayerSerialization | typings.tensorflowTfjsLayers.convolutionalSerializationMod.SeparableConv2DLayerSerialization | typings.tensorflowTfjsLayers.convolutionalSerializationMod.Cropping2DLayerSerialization | typings.tensorflowTfjsLayers.convolutionalSerializationMod.UpSampling2DLayerSerialization
  type Cropping2DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D, 
    typings.tensorflowTfjsLayers.convolutionalSerializationMod.Cropping2DLayerConfig
  ]
  type SeparableConv2DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D, 
    typings.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type UpSampling2DLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D, 
    typings.tensorflowTfjsLayers.convolutionalSerializationMod.UpSampling2DLayerConfig
  ]
}
