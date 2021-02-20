package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsLayers.modelsMod.ModelAndWeightsConfig
import typings.tensorflowTfjsLayers.trainingMod.LayersModel
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportsModelsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_models", "modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/exports_models", "modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/exports_models", "modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/exports_models", "modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
}
