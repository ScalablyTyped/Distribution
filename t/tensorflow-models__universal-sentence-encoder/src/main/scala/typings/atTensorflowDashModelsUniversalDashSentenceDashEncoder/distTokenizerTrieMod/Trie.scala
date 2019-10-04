package typings.atTensorflowDashModelsUniversalDashSentenceDashEncoder.distTokenizerTrieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer/trie", "Trie")
@js.native
class Trie () extends js.Object {
  var root: TrieNode = js.native
  def commonPrefixSearch(ss: js.Array[String]): js.Array[OutputNode] = js.native
  def insert(word: String, score: Double, index: Double): Unit = js.native
}

