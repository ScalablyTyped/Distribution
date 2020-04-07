package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object advancedActivationSerializationMod {
  type AdvancedActivationLayerSerialization = typings.tensorflowTfjsLayers.advancedActivationSerializationMod.ReLULayerSerialization | typings.tensorflowTfjsLayers.advancedActivationSerializationMod.LeakyReLULayerSerialization | typings.tensorflowTfjsLayers.advancedActivationSerializationMod.PReLULayerSerialization | typings.tensorflowTfjsLayers.advancedActivationSerializationMod.ELULayerSerialization | typings.tensorflowTfjsLayers.advancedActivationSerializationMod.ThresholdedReLULayerSerialization | typings.tensorflowTfjsLayers.advancedActivationSerializationMod.SoftmaxLayerSerialization
  type ELULayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU, 
    typings.tensorflowTfjsLayers.advancedActivationSerializationMod.ELULayerConfig
  ]
  type LeakyReLULayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU, 
    typings.tensorflowTfjsLayers.advancedActivationSerializationMod.LeakyReLULayerConfig
  ]
  type PReLULayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU, 
    typings.tensorflowTfjsLayers.advancedActivationSerializationMod.PReLULayerConfig
  ]
  type ReLULayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU, 
    typings.tensorflowTfjsLayers.advancedActivationSerializationMod.ReLULayerConfig
  ]
  type SoftmaxLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax, 
    typings.tensorflowTfjsLayers.advancedActivationSerializationMod.SoftmaxLayerConfig
  ]
  type ThresholdedReLULayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU, 
    typings.tensorflowTfjsLayers.advancedActivationSerializationMod.ThresholdedReLULayerConfig
  ]
}
