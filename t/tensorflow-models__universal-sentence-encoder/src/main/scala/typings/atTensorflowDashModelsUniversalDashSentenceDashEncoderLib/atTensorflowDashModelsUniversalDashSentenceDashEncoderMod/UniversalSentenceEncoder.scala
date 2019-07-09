package typings
package atTensorflowDashModelsUniversalDashSentenceDashEncoderLib.atTensorflowDashModelsUniversalDashSentenceDashEncoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow-models/universal-sentence-encoder", "UniversalSentenceEncoder")
@js.native
class UniversalSentenceEncoder () extends js.Object {
  var model: js.Any = js.native
  var tokenizer: js.Any = js.native
  def embed(inputs: java.lang.String): js.Promise[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D] = js.native
  def embed(inputs: js.Array[java.lang.String]): js.Promise[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D] = js.native
  def load(): js.Promise[scala.Unit] = js.native
  def loadModel(): js.Promise[atTensorflowTfjsDashConverterLib.atTensorflowTfjsDashConverterMod.GraphModel] = js.native
}

