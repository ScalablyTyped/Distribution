package typings.tensorflowModelsUniversalSentenceEncoder

import typings.tensorflowModelsUniversalSentenceEncoder.trieMod.Trie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizerMod {
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer", "Tokenizer")
  @js.native
  open class Tokenizer protected () extends StObject {
    def this(vocabulary: Vocabulary) = this()
    def this(vocabulary: Vocabulary, reservedSymbolsCount: Double) = this()
    
    def encode(input: String): js.Array[Double] = js.native
    
    /* private */ var reservedSymbolsCount: Any = js.native
    
    var trie: Trie = js.native
    
    /* private */ var vocabulary: Any = js.native
  }
  
  inline def loadTokenizer(): js.Promise[Tokenizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTokenizer")().asInstanceOf[js.Promise[Tokenizer]]
  inline def loadTokenizer(pathToVocabulary: String): js.Promise[Tokenizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTokenizer")(pathToVocabulary.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tokenizer]]
  
  inline def loadVocabulary(pathToVocabulary: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadVocabulary")(pathToVocabulary.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  type Vocabulary = js.Array[js.Tuple2[String, Double]]
}
