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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topologyConfigMod {
  
  @js.native
  trait BaseLayerSerialization[N /* <: String */, C /* <: LayerConfig */] extends BaseSerialization[N, JsonLayer[C]] {
    
    var inbound_nodes: js.UndefOr[js.Array[NodeConfig]] = js.native
    
    var name: String = js.native
  }
  object BaseLayerSerialization {
    
    @scala.inline
    def apply[N /* <: String */, C /* <: LayerConfig */](class_name: N, config: JsonLayer[C], name: String): BaseLayerSerialization[N, C] = {
      val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseLayerSerialization[N, C]]
    }
    
    @scala.inline
    implicit class BaseLayerSerializationMutableBuilder[Self <: BaseLayerSerialization[_, _], N /* <: String */, C /* <: LayerConfig */] (val x: Self with (BaseLayerSerialization[N, C])) extends AnyVal {
      
      @scala.inline
      def setInbound_nodes(value: js.Array[NodeConfig]): Self = StObject.set(x, "inbound_nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInbound_nodesUndefined: Self = StObject.set(x, "inbound_nodes", js.undefined)
      
      @scala.inline
      def setInbound_nodesVarargs(value: NodeConfig*): Self = StObject.set(x, "inbound_nodes", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type JsonLayer[C /* <: LayerConfig */] = C with LayerConfig with (PyJson[
    Extract[
      input_shape | batch_input_shape | batch_size | dtype | name | trainable | input_dtype | (/* keyof C */ String), 
      String
    ]
  ])
  
  @js.native
  trait LayerConfig extends PyJsonDict {
    
    var batch_input_shape: js.UndefOr[Shape] = js.native
    
    var batch_size: js.UndefOr[Double] = js.native
    
    var dtype: js.UndefOr[DataType] = js.native
    
    var input_dtype: js.UndefOr[DataType] = js.native
    
    var input_shape: js.UndefOr[Shape] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var trainable: js.UndefOr[Boolean] = js.native
  }
  object LayerConfig {
    
    @scala.inline
    def apply(): LayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerConfig]
    }
    
    @scala.inline
    implicit class LayerConfigMutableBuilder[Self <: LayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatch_input_shape(value: Shape): Self = StObject.set(x, "batch_input_shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_input_shapeUndefined: Self = StObject.set(x, "batch_input_shape", js.undefined)
      
      @scala.inline
      def setBatch_input_shapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batch_input_shape", js.Array(value :_*))
      
      @scala.inline
      def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_sizeUndefined: Self = StObject.set(x, "batch_size", js.undefined)
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      @scala.inline
      def setInput_dtype(value: DataType): Self = StObject.set(x, "input_dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_dtypeUndefined: Self = StObject.set(x, "input_dtype", js.undefined)
      
      @scala.inline
      def setInput_shape(value: Shape): Self = StObject.set(x, "input_shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_shapeUndefined: Self = StObject.set(x, "input_shape", js.undefined)
      
      @scala.inline
      def setInput_shapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "input_shape", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTrainable(value: Boolean): Self = StObject.set(x, "trainable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrainableUndefined: Self = StObject.set(x, "trainable", js.undefined)
    }
  }
}
