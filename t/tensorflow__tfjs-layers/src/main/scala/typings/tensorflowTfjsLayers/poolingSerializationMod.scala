package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D
import typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolingSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/pooling_serialization", "poolingLayerClassNames")
  @js.native
  val poolingLayerClassNames: js.Array[PoolingLayerClassName] = js.native
  
  type AveragePooling1DLayerSerialization = BaseLayerSerialization[AveragePooling1D, Pooling1DLayerConfig]
  
  type AveragePooling2DLayerSerialization = BaseLayerSerialization[AveragePooling2D, Pooling2DLayerConfig]
  
  type GlobalAveragePooling1DLayerSerialization = BaseLayerSerialization[GlobalAveragePooling1D, LayerConfig]
  
  type GlobalAveragePooling2DLayerSerialization = BaseLayerSerialization[GlobalAveragePooling2D, GlobalPooling2DLayerConfig]
  
  type GlobalMaxPooling1DLayerSerialization = BaseLayerSerialization[GlobalMaxPooling1D, LayerConfig]
  
  type GlobalMaxPooling2DLayerSerialization = BaseLayerSerialization[GlobalMaxPooling2D, GlobalPooling2DLayerConfig]
  
  @js.native
  trait GlobalPooling2DLayerConfig extends LayerConfig {
    
    var data_format: js.UndefOr[DataFormatSerialization] = js.native
  }
  object GlobalPooling2DLayerConfig {
    
    @scala.inline
    def apply(): GlobalPooling2DLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalPooling2DLayerConfig]
    }
    
    @scala.inline
    implicit class GlobalPooling2DLayerConfigMutableBuilder[Self <: GlobalPooling2DLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData_format(value: DataFormatSerialization): Self = StObject.set(x, "data_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_formatUndefined: Self = StObject.set(x, "data_format", js.undefined)
    }
  }
  
  type MaxPooling1DLayerSerialization = BaseLayerSerialization[MaxPooling1D, Pooling1DLayerConfig]
  
  type MaxPooling2DLayerSerialization = BaseLayerSerialization[MaxPooling2D, Pooling2DLayerConfig]
  
  @js.native
  trait Pooling1DLayerConfig extends LayerConfig {
    
    var padding: js.UndefOr[PaddingMode] = js.native
    
    var pool_size: js.UndefOr[js.Array[Double]] = js.native
    
    var strides: js.UndefOr[js.Array[Double]] = js.native
  }
  object Pooling1DLayerConfig {
    
    @scala.inline
    def apply(): Pooling1DLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pooling1DLayerConfig]
    }
    
    @scala.inline
    implicit class Pooling1DLayerConfigMutableBuilder[Self <: Pooling1DLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPool_size(value: js.Array[Double]): Self = StObject.set(x, "pool_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPool_sizeUndefined: Self = StObject.set(x, "pool_size", js.undefined)
      
      @scala.inline
      def setPool_sizeVarargs(value: Double*): Self = StObject.set(x, "pool_size", js.Array(value :_*))
      
      @scala.inline
      def setStrides(value: js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      @scala.inline
      def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Pooling2DLayerConfig extends LayerConfig {
    
    var data_format: js.UndefOr[DataFormatSerialization] = js.native
    
    var padding: js.UndefOr[PaddingMode] = js.native
    
    var pool_size: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
    
    var strides: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
  }
  object Pooling2DLayerConfig {
    
    @scala.inline
    def apply(): Pooling2DLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pooling2DLayerConfig]
    }
    
    @scala.inline
    implicit class Pooling2DLayerConfigMutableBuilder[Self <: Pooling2DLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData_format(value: DataFormatSerialization): Self = StObject.set(x, "data_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_formatUndefined: Self = StObject.set(x, "data_format", js.undefined)
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPool_size(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "pool_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPool_sizeUndefined: Self = StObject.set(x, "pool_size", js.undefined)
      
      @scala.inline
      def setStrides(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
    }
  }
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/pooling_serialization.PoolingLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D
  */
  trait PoolingLayerClassName extends StObject
  object PoolingLayerClassName {
    
    @scala.inline
    def AveragePooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D = "AveragePooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D]
    
    @scala.inline
    def AveragePooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D = "AveragePooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D]
    
    @scala.inline
    def GlobalAveragePooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D = "GlobalAveragePooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D]
    
    @scala.inline
    def GlobalAveragePooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D = "GlobalAveragePooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D]
    
    @scala.inline
    def GlobalMaxPooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D = "GlobalMaxPooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D]
    
    @scala.inline
    def GlobalMaxPooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D = "GlobalMaxPooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D]
    
    @scala.inline
    def MaxPooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D = "MaxPooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D]
    
    @scala.inline
    def MaxPooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D = "MaxPooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D]
  }
  
  type PoolingLayerSerialization = MaxPooling1DLayerSerialization | AveragePooling1DLayerSerialization | MaxPooling2DLayerSerialization | AveragePooling2DLayerSerialization | GlobalAveragePooling1DLayerSerialization | GlobalMaxPooling1DLayerSerialization | GlobalAveragePooling2DLayerSerialization | GlobalMaxPooling2DLayerSerialization
}
