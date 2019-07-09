package typings
package atTensorflowDashModelsUniversalDashSentenceDashEncoderLib.distTokenizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer", "Tokenizer")
@js.native
class Tokenizer protected () extends js.Object {
  def this(vocabulary: Vocabulary) = this()
  var trie: atTensorflowDashModelsUniversalDashSentenceDashEncoderLib.distTokenizerTrieMod.Trie = js.native
  var vocabulary: Vocabulary = js.native
  def encode(input: java.lang.String): js.Array[scala.Double] = js.native
}

