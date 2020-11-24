package typings.tensorflowModelsUniversalSentenceEncoder

import typings.tensorflowModelsUniversalSentenceEncoder.tokenizerMod.Vocabulary
import typings.tensorflowModelsUniversalSentenceEncoder.useQnaMod.UniversalSentenceEncoderQnA
import typings.tensorflowTfjsConverter.mod.GraphModel
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow-models/universal-sentence-encoder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def load(): js.Promise[UniversalSentenceEncoder] = js.native
  
  def loadQnA(): js.Promise[UniversalSentenceEncoderQnA] = js.native
  
  val version: /* "1.3.2" */ String = js.native
  
  @js.native
  class Tokenizer protected ()
    extends typings.tensorflowModelsUniversalSentenceEncoder.tokenizerMod.Tokenizer {
    def this(vocabulary: Vocabulary) = this()
    def this(vocabulary: Vocabulary, reservedSymbolsCount: Double) = this()
  }
  
  @js.native
  class UniversalSentenceEncoder () extends js.Object {
    
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
    
    def loadModel(): js.Promise[GraphModel] = js.native
    
    var model: js.Any = js.native
    
    var tokenizer: js.Any = js.native
  }
}
