package typings.tensorflowTfjs.distIndexWithPolyfillsMod

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsLayers.distKerasFormatTypesMod.PyJsonDict
import typings.tensorflowTfjsLayers.distModelsMod.ModelAndWeightsConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object models {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "models")
  @js.native
  val ^ : js.Any = js.native
  
  inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
}
