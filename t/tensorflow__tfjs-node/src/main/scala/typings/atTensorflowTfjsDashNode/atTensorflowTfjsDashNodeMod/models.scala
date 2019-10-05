package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
import typings.atTensorflowTfjsDashLayers.distModelsMod.ModelAndWeightsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "models")
@js.native
object models extends js.Object {
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
}

