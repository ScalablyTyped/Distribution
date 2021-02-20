package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsLayers.modelsMod.ModelAndWeightsConfig
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object models {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "models.modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "models.modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "models.modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "models.modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
}
