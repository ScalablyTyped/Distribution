package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer
import typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/input_config", "inputLayerClassNames")
  @js.native
  val inputLayerClassNames: js.Array[InputLayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/input_config.InputLayerSerialization['class_name'] */
  type InputLayerClassName = InputLayer
  
  @js.native
  trait InputLayerConfig extends StObject {
    
    var batch_input_shape: js.UndefOr[Shape] = js.native
    
    var batch_size: js.UndefOr[Double] = js.native
    
    var dtype: js.UndefOr[DataType] = js.native
    
    var input_shape: js.UndefOr[Shape] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var sparse: js.UndefOr[Boolean] = js.native
  }
  object InputLayerConfig {
    
    @scala.inline
    def apply(): InputLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputLayerConfig]
    }
    
    @scala.inline
    implicit class InputLayerConfigMutableBuilder[Self <: InputLayerConfig] (val x: Self) extends AnyVal {
      
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
      def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
    }
  }
  
  type InputLayerSerialization = BaseLayerSerialization[InputLayer, InputLayerConfig]
}
