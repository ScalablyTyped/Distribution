package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object embeddingsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/embeddings", "Embedding")
  @js.native
  open class Embedding protected () extends Layer {
    def this(args: EmbeddingLayerArgs) = this()
    
    val DEFAULT_EMBEDDINGS_INITIALIZER: InitializerIdentifier = js.native
    
    /* private */ var embeddings: Any = js.native
    
    /* private */ val embeddingsConstraint: Any = js.native
    
    /* private */ var embeddingsInitializer: Any = js.native
    
    /* private */ val embeddingsRegularizer: Any = js.native
    
    /* private */ var inputDim: Any = js.native
    
    /* private */ var inputLength: Any = js.native
    
    /* private */ var maskZero: Any = js.native
    
    /* private */ var outputDim: Any = js.native
  }
  /* static members */
  object Embedding {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/embeddings", "Embedding")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/embeddings", "Embedding.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  trait EmbeddingLayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * Regularizer function applied to the activation.
      */
    var activityRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * Constraint function applied to the `embeddings` matrix.
      */
    var embeddingsConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    /**
      * Initializer for the `embeddings` matrix.
      */
    var embeddingsInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /**
      * Regularizer function applied to the `embeddings` matrix.
      */
    var embeddingsRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * Integer > 0. Size of the vocabulary, i.e. maximum integer index + 1.
      */
    var inputDim: Double
    
    /**
      * Length of input sequences, when it is constant.
      *
      * This argument is required if you are going to connect `flatten` then
      * `dense` layers upstream (without it, the shape of the dense outputs cannot
      * be computed).
      */
    var inputLength: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Whether the input value 0 is a special "padding" value that should be
      * masked out. This is useful when using recurrent layers which may take
      * variable length input.
      *
      * If this is `True` then all subsequent layers in the model need to support
      * masking or an exception will be raised. If maskZero is set to `True`, as a
      * consequence, index 0 cannot be used in the vocabulary (inputDim should
      * equal size of vocabulary + 1).
      */
    var maskZero: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Integer >= 0. Dimension of the dense embedding.
      */
    var outputDim: Double
  }
  object EmbeddingLayerArgs {
    
    inline def apply(inputDim: Double, outputDim: Double): EmbeddingLayerArgs = {
      val __obj = js.Dynamic.literal(inputDim = inputDim.asInstanceOf[js.Any], outputDim = outputDim.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmbeddingLayerArgs]
    }
    
    extension [Self <: EmbeddingLayerArgs](x: Self) {
      
      inline def setActivityRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "activityRegularizer", value.asInstanceOf[js.Any])
      
      inline def setActivityRegularizerUndefined: Self = StObject.set(x, "activityRegularizer", js.undefined)
      
      inline def setEmbeddingsConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "embeddingsConstraint", value.asInstanceOf[js.Any])
      
      inline def setEmbeddingsConstraintUndefined: Self = StObject.set(x, "embeddingsConstraint", js.undefined)
      
      inline def setEmbeddingsInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "embeddingsInitializer", value.asInstanceOf[js.Any])
      
      inline def setEmbeddingsInitializerUndefined: Self = StObject.set(x, "embeddingsInitializer", js.undefined)
      
      inline def setEmbeddingsRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "embeddingsRegularizer", value.asInstanceOf[js.Any])
      
      inline def setEmbeddingsRegularizerUndefined: Self = StObject.set(x, "embeddingsRegularizer", js.undefined)
      
      inline def setInputDim(value: Double): Self = StObject.set(x, "inputDim", value.asInstanceOf[js.Any])
      
      inline def setInputLength(value: Double | js.Array[Double]): Self = StObject.set(x, "inputLength", value.asInstanceOf[js.Any])
      
      inline def setInputLengthUndefined: Self = StObject.set(x, "inputLength", js.undefined)
      
      inline def setInputLengthVarargs(value: Double*): Self = StObject.set(x, "inputLength", js.Array(value*))
      
      inline def setMaskZero(value: Boolean): Self = StObject.set(x, "maskZero", value.asInstanceOf[js.Any])
      
      inline def setMaskZeroUndefined: Self = StObject.set(x, "maskZero", js.undefined)
      
      inline def setOutputDim(value: Double): Self = StObject.set(x, "outputDim", value.asInstanceOf[js.Any])
    }
  }
}
