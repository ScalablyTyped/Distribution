package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object coreSerializationMod {
  
  type ActivationLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation, 
    typings.tensorflowTfjsLayers.coreSerializationMod.ActivationLayerConfig
  ]
  
  type CoreLayerSerialization = typings.tensorflowTfjsLayers.coreSerializationMod.DropoutLayerSerialization | typings.tensorflowTfjsLayers.coreSerializationMod.DenseLayerSerialization | typings.tensorflowTfjsLayers.coreSerializationMod.FlattenLayerSerialization | typings.tensorflowTfjsLayers.coreSerializationMod.ActivationLayerSerialization | typings.tensorflowTfjsLayers.coreSerializationMod.RepeatVectorLayerSerialization | typings.tensorflowTfjsLayers.coreSerializationMod.ReshapeLayerSerialization | typings.tensorflowTfjsLayers.coreSerializationMod.PermuteLayerSerialization | typings.tensorflowTfjsLayers.coreSerializationMod.MaskingLayerSerialization
  
  type DenseLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense, 
    typings.tensorflowTfjsLayers.coreSerializationMod.DenseLayerConfig
  ]
  
  type DropoutLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout, 
    typings.tensorflowTfjsLayers.coreSerializationMod.DropoutLayerConfig
  ]
  
  type FlattenLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten, 
    typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  
  type MaskingLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking, 
    typings.tensorflowTfjsLayers.coreSerializationMod.MaskingLayerConfig
  ]
  
  type PermuteLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute, 
    typings.tensorflowTfjsLayers.coreSerializationMod.PermuteLayerConfig
  ]
  
  type RepeatVectorLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector, 
    typings.tensorflowTfjsLayers.coreSerializationMod.RepeatVectorLayerConfig
  ]
  
  type ReshapeLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape, 
    typings.tensorflowTfjsLayers.coreSerializationMod.ReshapeLayerConfig
  ]
}
