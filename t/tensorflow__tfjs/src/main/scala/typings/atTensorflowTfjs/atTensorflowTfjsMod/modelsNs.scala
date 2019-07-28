package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
import typings.atTensorflowTfjsDashLayers.distModelsMod.ModelAndWeightsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "models")
@js.native
object modelsNs extends js.Object {
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
}

