package typings.tensorflowModelsUniversalSentenceEncoder.trieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer/trie", "Trie")
@js.native
class Trie () extends js.Object {
  var root: TrieNode = js.native
  /**
    * Returns an array of all tokens starting with ss.
    *
    * @param ss The prefix to match on.
    */
  def commonPrefixSearch(ss: js.Array[String]): js.Array[OutputNode] = js.native
  /**
    * Inserts a token into the trie.
    */
  def insert(word: String, score: Double, index: Double): Unit = js.native
}

