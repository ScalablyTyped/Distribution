package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
import typings.atTensorflowTfjsDashLayers.distModelsMod.ModelAndWeightsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports_models", JSImport.Namespace)
@js.native
object distExportsUnderscoreModelsMod extends js.Object {
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
}

