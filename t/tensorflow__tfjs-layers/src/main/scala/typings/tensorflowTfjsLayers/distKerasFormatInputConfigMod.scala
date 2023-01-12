package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatInputConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/input_config", "inputLayerClassNames")
  @js.native
  val inputLayerClassNames: js.Array[InputLayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/input_config.InputLayerSerialization['class_name'] */
  type InputLayerClassName = InputLayer
  
  trait InputLayerConfig extends StObject {
    
    var batch_input_shape: js.UndefOr[Shape] = js.undefined
    
    var batch_size: js.UndefOr[Double] = js.undefined
    
    var dtype: js.UndefOr[DataType] = js.undefined
    
    var input_shape: js.UndefOr[Shape] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var sparse: js.UndefOr[Boolean] = js.undefined
  }
  object InputLayerConfig {
    
    inline def apply(): InputLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setBatch_input_shape(value: Shape): Self = StObject.set(x, "batch_input_shape", value.asInstanceOf[js.Any])
      
      inline def setBatch_input_shapeUndefined: Self = StObject.set(x, "batch_input_shape", js.undefined)
      
      inline def setBatch_input_shapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batch_input_shape", js.Array(value*))
      
      inline def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
      
      inline def setBatch_sizeUndefined: Self = StObject.set(x, "batch_size", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setInput_shape(value: Shape): Self = StObject.set(x, "input_shape", value.asInstanceOf[js.Any])
      
      inline def setInput_shapeUndefined: Self = StObject.set(x, "input_shape", js.undefined)
      
      inline def setInput_shapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "input_shape", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      inline def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
    }
  }
  
  type InputLayerSerialization = BaseLayerSerialization[InputLayer, InputLayerConfig]
}
