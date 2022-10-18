package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatLayersLayerSerializationMod.LayerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatNodeConfigMod.TensorKeyArray
import typings.tensorflowTfjsLayers.distKerasFormatTrainingConfigMod.TrainingConfig
import typings.tensorflowTfjsLayers.distKerasFormatTypesMod.BaseSerialization
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Model
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Sequential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatModelSerializationMod {
  
  trait KerasFileSerialization extends StObject {
    
    var model_config: ModelSerialization | SequentialSerialization | LegacySequentialSerialization
    
    var training_config: TrainingConfig
  }
  object KerasFileSerialization {
    
    inline def apply(
      model_config: ModelSerialization | SequentialSerialization | LegacySequentialSerialization,
      training_config: TrainingConfig
    ): KerasFileSerialization = {
      val __obj = js.Dynamic.literal(model_config = model_config.asInstanceOf[js.Any], training_config = training_config.asInstanceOf[js.Any])
      __obj.asInstanceOf[KerasFileSerialization]
    }
    
    extension [Self <: KerasFileSerialization](x: Self) {
      
      inline def setModel_config(value: ModelSerialization | SequentialSerialization | LegacySequentialSerialization): Self = StObject.set(x, "model_config", value.asInstanceOf[js.Any])
      
      inline def setTraining_config(value: TrainingConfig): Self = StObject.set(x, "training_config", value.asInstanceOf[js.Any])
    }
  }
  
  trait LegacySequentialSerialization extends StObject {
    
    var backend: js.UndefOr[String] = js.undefined
    
    var class_name: Sequential
    
    var config: js.Array[LayerSerialization]
    
    var keras_version: js.UndefOr[String] = js.undefined
  }
  object LegacySequentialSerialization {
    
    inline def apply(config: js.Array[LayerSerialization]): LegacySequentialSerialization = {
      val __obj = js.Dynamic.literal(class_name = "Sequential", config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacySequentialSerialization]
    }
    
    extension [Self <: LegacySequentialSerialization](x: Self) {
      
      inline def setBackend(value: String): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      inline def setClass_name(value: Sequential): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: js.Array[LayerSerialization]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigVarargs(value: LayerSerialization*): Self = StObject.set(x, "config", js.Array(value*))
      
      inline def setKeras_version(value: String): Self = StObject.set(x, "keras_version", value.asInstanceOf[js.Any])
      
      inline def setKeras_versionUndefined: Self = StObject.set(x, "keras_version", js.undefined)
    }
  }
  
  trait ModelConfig extends StObject {
    
    var input_layers: js.Array[TensorKeyArray]
    
    var layers: js.Array[LayerSerialization]
    
    var name: String
    
    var output_layers: js.Array[TensorKeyArray]
  }
  object ModelConfig {
    
    inline def apply(
      input_layers: js.Array[TensorKeyArray],
      layers: js.Array[LayerSerialization],
      name: String,
      output_layers: js.Array[TensorKeyArray]
    ): ModelConfig = {
      val __obj = js.Dynamic.literal(input_layers = input_layers.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output_layers = output_layers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelConfig]
    }
    
    extension [Self <: ModelConfig](x: Self) {
      
      inline def setInput_layers(value: js.Array[TensorKeyArray]): Self = StObject.set(x, "input_layers", value.asInstanceOf[js.Any])
      
      inline def setInput_layersVarargs(value: TensorKeyArray*): Self = StObject.set(x, "input_layers", js.Array(value*))
      
      inline def setLayers(value: js.Array[LayerSerialization]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: LayerSerialization*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOutput_layers(value: js.Array[TensorKeyArray]): Self = StObject.set(x, "output_layers", value.asInstanceOf[js.Any])
      
      inline def setOutput_layersVarargs(value: TensorKeyArray*): Self = StObject.set(x, "output_layers", js.Array(value*))
    }
  }
  
  trait ModelSerialization
    extends StObject
       with BaseSerialization[Model, ModelConfig] {
    
    var backend: js.UndefOr[String] = js.undefined
    
    var keras_version: js.UndefOr[String] = js.undefined
  }
  object ModelSerialization {
    
    inline def apply(config: ModelConfig): ModelSerialization = {
      val __obj = js.Dynamic.literal(class_name = "Model", config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelSerialization]
    }
    
    extension [Self <: ModelSerialization](x: Self) {
      
      inline def setBackend(value: String): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      inline def setKeras_version(value: String): Self = StObject.set(x, "keras_version", value.asInstanceOf[js.Any])
      
      inline def setKeras_versionUndefined: Self = StObject.set(x, "keras_version", js.undefined)
    }
  }
  
  trait SequentialConfig extends StObject {
    
    var layers: js.Array[LayerSerialization]
  }
  object SequentialConfig {
    
    inline def apply(layers: js.Array[LayerSerialization]): SequentialConfig = {
      val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequentialConfig]
    }
    
    extension [Self <: SequentialConfig](x: Self) {
      
      inline def setLayers(value: js.Array[LayerSerialization]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: LayerSerialization*): Self = StObject.set(x, "layers", js.Array(value*))
    }
  }
  
  trait SequentialSerialization
    extends StObject
       with BaseSerialization[Sequential, SequentialConfig] {
    
    var backend: js.UndefOr[String] = js.undefined
    
    var keras_version: js.UndefOr[String] = js.undefined
  }
  object SequentialSerialization {
    
    inline def apply(config: SequentialConfig): SequentialSerialization = {
      val __obj = js.Dynamic.literal(class_name = "Sequential", config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequentialSerialization]
    }
    
    extension [Self <: SequentialSerialization](x: Self) {
      
      inline def setBackend(value: String): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      inline def setKeras_version(value: String): Self = StObject.set(x, "keras_version", value.asInstanceOf[js.Any])
      
      inline def setKeras_versionUndefined: Self = StObject.set(x, "keras_version", js.undefined)
    }
  }
}
