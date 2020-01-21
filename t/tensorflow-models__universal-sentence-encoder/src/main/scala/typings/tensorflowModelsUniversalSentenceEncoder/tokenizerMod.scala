package typings.tensorflowModelsUniversalSentenceEncoder

import typings.tensorflowModelsUniversalSentenceEncoder.trieMod.Trie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer", JSImport.Namespace)
@js.native
object tokenizerMod extends js.Object {
  @js.native
  class Tokenizer protected () extends js.Object {
    def this(vocabulary: Vocabulary) = this()
    var trie: Trie = js.native
    var vocabulary: Vocabulary = js.native
    def encode(input: String): js.Array[Double] = js.native
  }
  
  type Vocabulary = js.Array[js.Tuple2[String, Double]]
}

