package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Embedding
import typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object embeddingsSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/embeddings_serialization", "embeddingLayerClassNames")
  @js.native
  val embeddingLayerClassNames: js.Array[EmbeddingLayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/embeddings_serialization.EmbeddingLayerSerialization['class_name'] */
  type EmbeddingLayerClassName = Embedding
  
  trait EmbeddingLayerConfig
    extends StObject
       with LayerConfig {
    
    var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var embeddings_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var embeddings_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var embeddings_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var input_dim: Double
    
    var input_length: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var mask_zero: js.UndefOr[Boolean] = js.undefined
    
    var output_dim: Double
  }
  object EmbeddingLayerConfig {
    
    inline def apply(input_dim: Double, output_dim: Double): EmbeddingLayerConfig = {
      val __obj = js.Dynamic.literal(input_dim = input_dim.asInstanceOf[js.Any], output_dim = output_dim.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmbeddingLayerConfig]
    }
    
    extension [Self <: EmbeddingLayerConfig](x: Self) {
      
      inline def setActivity_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "activity_regularizer", value.asInstanceOf[js.Any])
      
      inline def setActivity_regularizerUndefined: Self = StObject.set(x, "activity_regularizer", js.undefined)
      
      inline def setEmbeddings_constraint(value: ConstraintSerialization): Self = StObject.set(x, "embeddings_constraint", value.asInstanceOf[js.Any])
      
      inline def setEmbeddings_constraintUndefined: Self = StObject.set(x, "embeddings_constraint", js.undefined)
      
      inline def setEmbeddings_initializer(value: InitializerSerialization): Self = StObject.set(x, "embeddings_initializer", value.asInstanceOf[js.Any])
      
      inline def setEmbeddings_initializerUndefined: Self = StObject.set(x, "embeddings_initializer", js.undefined)
      
      inline def setEmbeddings_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "embeddings_regularizer", value.asInstanceOf[js.Any])
      
      inline def setEmbeddings_regularizerUndefined: Self = StObject.set(x, "embeddings_regularizer", js.undefined)
      
      inline def setInput_dim(value: Double): Self = StObject.set(x, "input_dim", value.asInstanceOf[js.Any])
      
      inline def setInput_length(value: Double | js.Array[Double]): Self = StObject.set(x, "input_length", value.asInstanceOf[js.Any])
      
      inline def setInput_lengthUndefined: Self = StObject.set(x, "input_length", js.undefined)
      
      inline def setInput_lengthVarargs(value: Double*): Self = StObject.set(x, "input_length", js.Array(value :_*))
      
      inline def setMask_zero(value: Boolean): Self = StObject.set(x, "mask_zero", value.asInstanceOf[js.Any])
      
      inline def setMask_zeroUndefined: Self = StObject.set(x, "mask_zero", js.undefined)
      
      inline def setOutput_dim(value: Double): Self = StObject.set(x, "output_dim", value.asInstanceOf[js.Any])
    }
  }
  
  type EmbeddingLayerSerialization = BaseLayerSerialization[Embedding, EmbeddingLayerConfig]
}
