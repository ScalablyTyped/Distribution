package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.BidirectionalMergeMode
import typings.tensorflowTfjsLayers.distKerasFormatLayersLayerSerializationMod.LayerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatLayersRecurrentSerializationMod.RecurrentLayerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.LayerConfig
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersWrappersSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/wrappers_serialization", "wrapperLayerClassNames")
  @js.native
  val wrapperLayerClassNames: js.Array[WrapperLayerClassName] = js.native
  
  trait BidirectionalLayerConfig
    extends StObject
       with LayerConfig {
    
    var layer: RecurrentLayerSerialization
    
    var merge_mode: js.UndefOr[BidirectionalMergeMode] = js.undefined
  }
  object BidirectionalLayerConfig {
    
    inline def apply(layer: RecurrentLayerSerialization): BidirectionalLayerConfig = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BidirectionalLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BidirectionalLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setLayer(value: RecurrentLayerSerialization): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setMerge_mode(value: BidirectionalMergeMode): Self = StObject.set(x, "merge_mode", value.asInstanceOf[js.Any])
      
      inline def setMerge_modeUndefined: Self = StObject.set(x, "merge_mode", js.undefined)
    }
  }
  
  type BidirectionalLayerSerialization = BaseLayerSerialization[Bidirectional, BidirectionalLayerConfig]
  
  trait TimeDistributedLayerConfig
    extends StObject
       with LayerConfig {
    
    var layer: LayerSerialization
  }
  object TimeDistributedLayerConfig {
    
    inline def apply(layer: LayerSerialization): TimeDistributedLayerConfig = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeDistributedLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeDistributedLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setLayer(value: LayerSerialization): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  type TimeDistributedLayerSerialization = BaseLayerSerialization[TimeDistributed, TimeDistributedLayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/wrappers_serialization.WrapperLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional
  */
  trait WrapperLayerClassName extends StObject
  object WrapperLayerClassName {
    
    inline def Bidirectional: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional = "Bidirectional".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional]
    
    inline def TimeDistributed: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed = "TimeDistributed".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed]
  }
  
  type WrapperLayerSerialization = TimeDistributedLayerSerialization | BidirectionalLayerSerialization
}
