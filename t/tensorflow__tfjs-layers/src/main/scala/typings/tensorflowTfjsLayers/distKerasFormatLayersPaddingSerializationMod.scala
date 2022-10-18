package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.DataFormatSerialization
import typings.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.LayerConfig
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersPaddingSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/padding_serialization", "paddingLayerClassNames")
  @js.native
  val paddingLayerClassNames: js.Array[PaddingLayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/padding_serialization.PaddingLayerSerialization['class_name'] */
  type PaddingLayerClassName = ZeroPadding2D
  
  type PaddingLayerSerialization = ZeroPadding2DLayerSerialization
  
  trait ZeroPadding2DLayerConfig
    extends StObject
       with LayerConfig {
    
    var data_format: js.UndefOr[DataFormatSerialization] = js.undefined
    
    var padding: js.UndefOr[
        Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ] = js.undefined
  }
  object ZeroPadding2DLayerConfig {
    
    inline def apply(): ZeroPadding2DLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZeroPadding2DLayerConfig]
    }
    
    extension [Self <: ZeroPadding2DLayerConfig](x: Self) {
      
      inline def setData_format(value: DataFormatSerialization): Self = StObject.set(x, "data_format", value.asInstanceOf[js.Any])
      
      inline def setData_formatUndefined: Self = StObject.set(x, "data_format", js.undefined)
      
      inline def setPadding(
        value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  type ZeroPadding2DLayerSerialization = BaseLayerSerialization[ZeroPadding2D, ZeroPadding2DLayerConfig]
}
