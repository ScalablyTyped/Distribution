package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "models")
@js.native
object modelsNs extends js.Object {
  def modelFromJSON(modelAndWeightsConfig: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.PyJsonDict): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(
    modelAndWeightsConfig: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.PyJsonDict,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: atTensorflowTfjsDashLayersLib.distModelsMod.ModelAndWeightsConfig): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(
    modelAndWeightsConfig: atTensorflowTfjsDashLayersLib.distModelsMod.ModelAndWeightsConfig,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
}

