package typings
package atTensorflowDashModelsUniversalDashSentenceDashEncoderLib.distTokenizerTrieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer/trie", "Trie")
@js.native
class Trie () extends js.Object {
  var root: TrieNode = js.native
  def commonPrefixSearch(ss: js.Array[java.lang.String]): js.Array[OutputNode] = js.native
  def findAllCommonPrefixes(ss: js.Array[java.lang.String], node: TrieNode, arr: js.Array[OutputNode]): scala.Unit = js.native
  def insert(word: java.lang.String, score: scala.Double, index: scala.Double): scala.Unit = js.native
}

