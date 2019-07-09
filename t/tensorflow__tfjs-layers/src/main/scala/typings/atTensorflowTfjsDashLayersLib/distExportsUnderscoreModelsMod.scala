package typings
package atTensorflowTfjsDashLayersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports_models", JSImport.Namespace)
@js.native
object distExportsUnderscoreModelsMod extends js.Object {
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

