package typings.tensorflowModelsUniversalSentenceEncoder

import typings.tensorflowModelsUniversalSentenceEncoder.distTokenizerMod.Vocabulary
import typings.tensorflowModelsUniversalSentenceEncoder.distUseQnaMod.UniversalSentenceEncoderQnA
import typings.tensorflowTfjsConverter.mod.GraphModel
import typings.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow-models/universal-sentence-encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow-models/universal-sentence-encoder", "Tokenizer")
  @js.native
  open class Tokenizer protected ()
    extends typings.tensorflowModelsUniversalSentenceEncoder.distTokenizerMod.Tokenizer {
    def this(vocabulary: Vocabulary) = this()
    def this(vocabulary: Vocabulary, reservedSymbolsCount: Double) = this()
  }
  
  @JSImport("@tensorflow-models/universal-sentence-encoder", "UniversalSentenceEncoder")
  @js.native
  open class UniversalSentenceEncoder () extends StObject {
    
    def embed(inputs: String): js.Promise[Tensor2D] = js.native
    /**
      *
      * Returns a 2D Tensor of shape [input.length, 512] that contains the
      * Universal Sentence Encoder embeddings for each input.
      *
      * @param inputs A string or an array of strings to embed.
      */
    def embed(inputs: js.Array[String]): js.Promise[Tensor2D] = js.native
    
    def load(): js.Promise[Unit] = js.native
    def load(config: LoadConfig): js.Promise[Unit] = js.native
    
    def loadModel(): js.Promise[GraphModel[String | IOHandler]] = js.native
    def loadModel(modelUrl: String): js.Promise[GraphModel[String | IOHandler]] = js.native
    
    /* private */ var model: Any = js.native
    
    /* private */ var tokenizer: Any = js.native
  }
  
  inline def load(): js.Promise[UniversalSentenceEncoder] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[js.Promise[UniversalSentenceEncoder]]
  inline def load(config: LoadConfig): js.Promise[UniversalSentenceEncoder] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UniversalSentenceEncoder]]
  
  inline def loadQnA(): js.Promise[UniversalSentenceEncoderQnA] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadQnA")().asInstanceOf[js.Promise[UniversalSentenceEncoderQnA]]
  
  inline def loadTokenizer(): js.Promise[typings.tensorflowModelsUniversalSentenceEncoder.distTokenizerMod.Tokenizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTokenizer")().asInstanceOf[js.Promise[typings.tensorflowModelsUniversalSentenceEncoder.distTokenizerMod.Tokenizer]]
  inline def loadTokenizer(pathToVocabulary: String): js.Promise[typings.tensorflowModelsUniversalSentenceEncoder.distTokenizerMod.Tokenizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTokenizer")(pathToVocabulary.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tensorflowModelsUniversalSentenceEncoder.distTokenizerMod.Tokenizer]]
  
  @JSImport("@tensorflow-models/universal-sentence-encoder", "version")
  @js.native
  val version: /* "1.3.3" */ String = js.native
  
  trait LoadConfig extends StObject {
    
    var modelUrl: js.UndefOr[String] = js.undefined
    
    var vocabUrl: js.UndefOr[String] = js.undefined
  }
  object LoadConfig {
    
    inline def apply(): LoadConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadConfig]
    }
    
    extension [Self <: LoadConfig](x: Self) {
      
      inline def setModelUrl(value: String): Self = StObject.set(x, "modelUrl", value.asInstanceOf[js.Any])
      
      inline def setModelUrlUndefined: Self = StObject.set(x, "modelUrl", js.undefined)
      
      inline def setVocabUrl(value: String): Self = StObject.set(x, "vocabUrl", value.asInstanceOf[js.Any])
      
      inline def setVocabUrlUndefined: Self = StObject.set(x, "vocabUrl", js.undefined)
    }
  }
}
