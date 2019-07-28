package typings.atTensorflowDashModelsUniversalDashSentenceDashEncoder.atTensorflowDashModelsUniversalDashSentenceDashEncoderMod

import typings.atTensorflowTfjsDashConverter.atTensorflowTfjsDashConverterMod.GraphModel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow-models/universal-sentence-encoder", "UniversalSentenceEncoder")
@js.native
class UniversalSentenceEncoder () extends js.Object {
  var model: js.Any = js.native
  var tokenizer: js.Any = js.native
  def embed(inputs: String): js.Promise[Tensor2D] = js.native
  def embed(inputs: js.Array[String]): js.Promise[Tensor2D] = js.native
  def load(): js.Promise[Unit] = js.native
  def loadModel(): js.Promise[GraphModel] = js.native
}

