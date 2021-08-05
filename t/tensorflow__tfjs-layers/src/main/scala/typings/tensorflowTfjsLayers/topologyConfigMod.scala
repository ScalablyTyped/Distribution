package typings.tensorflowTfjsLayers

import typings.std.Extract
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.nodeConfigMod.NodeConfig
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.batch_input_shape
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.batch_size
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.dtype
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.input_dtype
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.input_shape
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.name
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.trainable
import typings.tensorflowTfjsLayers.typesMod.BaseSerialization
import typings.tensorflowTfjsLayers.typesMod.PyJson
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topologyConfigMod {
  
  trait BaseLayerSerialization[N /* <: String */, C /* <: LayerConfig */]
    extends StObject
       with BaseSerialization[N, JsonLayer[C]] {
    
    var inbound_nodes: js.UndefOr[js.Array[NodeConfig]] = js.undefined
    
    var name: String
  }
  object BaseLayerSerialization {
    
    inline def apply[N /* <: String */, C /* <: LayerConfig */](class_name: N, config: JsonLayer[C], name: String): BaseLayerSerialization[N, C] = {
      val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseLayerSerialization[N, C]]
    }
    
    extension [Self <: BaseLayerSerialization[?, ?], N /* <: String */, C /* <: LayerConfig */](x: Self & (BaseLayerSerialization[N, C])) {
      
      inline def setInbound_nodes(value: js.Array[NodeConfig]): Self = StObject.set(x, "inbound_nodes", value.asInstanceOf[js.Any])
      
      inline def setInbound_nodesUndefined: Self = StObject.set(x, "inbound_nodes", js.undefined)
      
      inline def setInbound_nodesVarargs(value: NodeConfig*): Self = StObject.set(x, "inbound_nodes", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type JsonLayer[C /* <: LayerConfig */] = C & LayerConfig & (PyJson[
    Extract[
      input_shape | batch_input_shape | batch_size | dtype | name | trainable | input_dtype | (/* keyof C */ String), 
      String
    ]
  ])
  
  trait LayerConfig
    extends StObject
       with PyJsonDict {
    
    var batch_input_shape: js.UndefOr[Shape] = js.undefined
    
    var batch_size: js.UndefOr[Double] = js.undefined
    
    var dtype: js.UndefOr[DataType] = js.undefined
    
    var input_dtype: js.UndefOr[DataType] = js.undefined
    
    var input_shape: js.UndefOr[Shape] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var trainable: js.UndefOr[Boolean] = js.undefined
  }
  object LayerConfig {
    
    inline def apply(): LayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerConfig]
    }
    
    extension [Self <: LayerConfig](x: Self) {
      
      inline def setBatch_input_shape(value: Shape): Self = StObject.set(x, "batch_input_shape", value.asInstanceOf[js.Any])
      
      inline def setBatch_input_shapeUndefined: Self = StObject.set(x, "batch_input_shape", js.undefined)
      
      inline def setBatch_input_shapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batch_input_shape", js.Array(value :_*))
      
      inline def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
      
      inline def setBatch_sizeUndefined: Self = StObject.set(x, "batch_size", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setInput_dtype(value: DataType): Self = StObject.set(x, "input_dtype", value.asInstanceOf[js.Any])
      
      inline def setInput_dtypeUndefined: Self = StObject.set(x, "input_dtype", js.undefined)
      
      inline def setInput_shape(value: Shape): Self = StObject.set(x, "input_shape", value.asInstanceOf[js.Any])
      
      inline def setInput_shapeUndefined: Self = StObject.set(x, "input_shape", js.undefined)
      
      inline def setInput_shapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "input_shape", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTrainable(value: Boolean): Self = StObject.set(x, "trainable", value.asInstanceOf[js.Any])
      
      inline def setTrainableUndefined: Self = StObject.set(x, "trainable", js.undefined)
    }
  }
}
