package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
