package typings.tensorflowModelsUniversalSentenceEncoder

import typings.tensorflowModelsUniversalSentenceEncoder.trieMod.Trie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizerMod {
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer", "Tokenizer")
  @js.native
  class Tokenizer protected () extends StObject {
    def this(vocabulary: Vocabulary) = this()
    def this(vocabulary: Vocabulary, reservedSymbolsCount: Double) = this()
    
    def encode(input: String): js.Array[Double] = js.native
    
    var reservedSymbolsCount: js.Any = js.native
    
    var trie: Trie = js.native
    
    var vocabulary: js.Any = js.native
  }
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer", "loadTokenizer")
  @js.native
  def loadTokenizer(): js.Promise[Tokenizer] = js.native
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer", "loadTokenizer")
  @js.native
  def loadTokenizer(pathToVocabulary: String): js.Promise[Tokenizer] = js.native
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer", "loadVocabulary")
  @js.native
  def loadVocabulary(pathToVocabulary: String): js.Promise[_] = js.native
  
  type Vocabulary = js.Array[js.Tuple2[String, Double]]
}
