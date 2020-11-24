package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wrappersSerializationMod {
  
  type BidirectionalLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional, 
    typings.tensorflowTfjsLayers.wrappersSerializationMod.BidirectionalLayerConfig
  ]
  
  type TimeDistributedLayerSerialization = typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed, 
    typings.tensorflowTfjsLayers.wrappersSerializationMod.TimeDistributedLayerConfig
  ]
  
  type WrapperLayerSerialization = typings.tensorflowTfjsLayers.wrappersSerializationMod.TimeDistributedLayerSerialization | typings.tensorflowTfjsLayers.wrappersSerializationMod.BidirectionalLayerSerialization
}
