package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typings.tensorflowTfjsLayers.nodeConfigMod.TensorKeyArray
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Model
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Sequential
import typings.tensorflowTfjsLayers.trainingConfigMod.TrainingConfig
import typings.tensorflowTfjsLayers.typesMod.BaseSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelSerializationMod {
  
  @js.native
  trait KerasFileSerialization extends StObject {
    
    var model_config: ModelSerialization | SequentialSerialization | LegacySequentialSerialization = js.native
    
    var training_config: TrainingConfig = js.native
  }
  object KerasFileSerialization {
    
    @scala.inline
    def apply(
      model_config: ModelSerialization | SequentialSerialization | LegacySequentialSerialization,
      training_config: TrainingConfig
    ): KerasFileSerialization = {
      val __obj = js.Dynamic.literal(model_config = model_config.asInstanceOf[js.Any], training_config = training_config.asInstanceOf[js.Any])
      __obj.asInstanceOf[KerasFileSerialization]
    }
    
    @scala.inline
    implicit class KerasFileSerializationMutableBuilder[Self <: KerasFileSerialization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel_config(value: ModelSerialization | SequentialSerialization | LegacySequentialSerialization): Self = StObject.set(x, "model_config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraining_config(value: TrainingConfig): Self = StObject.set(x, "training_config", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LegacySequentialSerialization extends StObject {
    
    var backend: js.UndefOr[String] = js.native
    
    var class_name: Sequential = js.native
    
    var config: js.Array[LayerSerialization] = js.native
    
    var keras_version: js.UndefOr[String] = js.native
  }
  object LegacySequentialSerialization {
    
    @scala.inline
    def apply(class_name: Sequential, config: js.Array[LayerSerialization]): LegacySequentialSerialization = {
      val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacySequentialSerialization]
    }
    
    @scala.inline
    implicit class LegacySequentialSerializationMutableBuilder[Self <: LegacySequentialSerialization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackend(value: String): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      @scala.inline
      def setClass_name(value: Sequential): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: js.Array[LayerSerialization]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigVarargs(value: LayerSerialization*): Self = StObject.set(x, "config", js.Array(value :_*))
      
      @scala.inline
      def setKeras_version(value: String): Self = StObject.set(x, "keras_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeras_versionUndefined: Self = StObject.set(x, "keras_version", js.undefined)
    }
  }
  
  @js.native
  trait ModelConfig extends StObject {
    
    var input_layers: js.Array[TensorKeyArray] = js.native
    
    var layers: js.Array[LayerSerialization] = js.native
    
    var name: String = js.native
    
    var output_layers: js.Array[TensorKeyArray] = js.native
  }
  object ModelConfig {
    
    @scala.inline
    def apply(
      input_layers: js.Array[TensorKeyArray],
      layers: js.Array[LayerSerialization],
      name: String,
      output_layers: js.Array[TensorKeyArray]
    ): ModelConfig = {
      val __obj = js.Dynamic.literal(input_layers = input_layers.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output_layers = output_layers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelConfig]
    }
    
    @scala.inline
    implicit class ModelConfigMutableBuilder[Self <: ModelConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput_layers(value: js.Array[TensorKeyArray]): Self = StObject.set(x, "input_layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_layersVarargs(value: TensorKeyArray*): Self = StObject.set(x, "input_layers", js.Array(value :_*))
      
      @scala.inline
      def setLayers(value: js.Array[LayerSerialization]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersVarargs(value: LayerSerialization*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput_layers(value: js.Array[TensorKeyArray]): Self = StObject.set(x, "output_layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput_layersVarargs(value: TensorKeyArray*): Self = StObject.set(x, "output_layers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ModelSerialization extends BaseSerialization[Model, ModelConfig] {
    
    var backend: js.UndefOr[String] = js.native
    
    var keras_version: js.UndefOr[String] = js.native
  }
  object ModelSerialization {
    
    @scala.inline
    def apply(class_name: Model, config: ModelConfig): ModelSerialization = {
      val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelSerialization]
    }
    
    @scala.inline
    implicit class ModelSerializationMutableBuilder[Self <: ModelSerialization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackend(value: String): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      @scala.inline
      def setKeras_version(value: String): Self = StObject.set(x, "keras_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeras_versionUndefined: Self = StObject.set(x, "keras_version", js.undefined)
    }
  }
  
  @js.native
  trait SequentialConfig extends StObject {
    
    var layers: js.Array[LayerSerialization] = js.native
  }
  object SequentialConfig {
    
    @scala.inline
    def apply(layers: js.Array[LayerSerialization]): SequentialConfig = {
      val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequentialConfig]
    }
    
    @scala.inline
    implicit class SequentialConfigMutableBuilder[Self <: SequentialConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayers(value: js.Array[LayerSerialization]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersVarargs(value: LayerSerialization*): Self = StObject.set(x, "layers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SequentialSerialization extends BaseSerialization[Sequential, SequentialConfig] {
    
    var backend: js.UndefOr[String] = js.native
    
    var keras_version: js.UndefOr[String] = js.native
  }
  object SequentialSerialization {
    
    @scala.inline
    def apply(class_name: Sequential, config: SequentialConfig): SequentialSerialization = {
      val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequentialSerialization]
    }
    
    @scala.inline
    implicit class SequentialSerializationMutableBuilder[Self <: SequentialSerialization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackend(value: String): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      @scala.inline
      def setKeras_version(value: String): Self = StObject.set(x, "keras_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeras_versionUndefined: Self = StObject.set(x, "keras_version", js.undefined)
    }
  }
}
