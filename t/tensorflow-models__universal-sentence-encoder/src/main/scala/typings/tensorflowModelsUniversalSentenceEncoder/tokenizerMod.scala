package typings.tensorflowModelsUniversalSentenceEncoder

import typings.tensorflowModelsUniversalSentenceEncoder.trieMod.Trie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer", JSImport.Namespace)
@js.native
object tokenizerMod extends js.Object {
  
  def loadTokenizer(): js.Promise[Tokenizer] = js.native
  def loadTokenizer(pathToVocabulary: String): js.Promise[Tokenizer] = js.native
  
  def loadVocabulary(pathToVocabulary: String): js.Promise[_] = js.native
  
  @js.native
  class Tokenizer protected () extends js.Object {
    def this(vocabulary: Vocabulary) = this()
    def this(vocabulary: Vocabulary, reservedSymbolsCount: Double) = this()
    
    def encode(input: String): js.Array[Double] = js.native
    
    var reservedSymbolsCount: js.Any = js.native
    
    var trie: Trie = js.native
    
    var vocabulary: js.Any = js.native
  }
  
  type Vocabulary = js.Array[js.Tuple2[String, Double]]
}
