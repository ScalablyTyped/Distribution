package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsLayers.modelsMod.ModelAndWeightsConfig
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object models {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "models")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
  @scala.inline
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
  @scala.inline
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
  @scala.inline
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
}
