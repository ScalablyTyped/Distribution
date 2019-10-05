package typings.atTensorflowTfjsDashLayers.distModelsMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", "modelFromJSON")
@js.native
object modelFromJSON extends js.Object {
  def apply(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
}

