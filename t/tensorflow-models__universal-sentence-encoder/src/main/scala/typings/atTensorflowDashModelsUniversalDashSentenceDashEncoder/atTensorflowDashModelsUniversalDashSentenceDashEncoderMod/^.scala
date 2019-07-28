package typings.atTensorflowDashModelsUniversalDashSentenceDashEncoder.atTensorflowDashModelsUniversalDashSentenceDashEncoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow-models/universal-sentence-encoder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def load(): js.Promise[UniversalSentenceEncoder] = js.native
  def loadTokenizer(): js.Promise[
    typings.atTensorflowDashModelsUniversalDashSentenceDashEncoder.distTokenizerMod.Tokenizer
  ] = js.native
  def loadTokenizer(pathToVocabulary: String): js.Promise[
    typings.atTensorflowDashModelsUniversalDashSentenceDashEncoder.distTokenizerMod.Tokenizer
  ] = js.native
}

