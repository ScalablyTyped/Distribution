package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel
import typings.tensorflowTfjsLayers.distKerasFormatTypesMod.PyJsonDict
import typings.tensorflowTfjsLayers.distModelsMod.ModelAndWeightsConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExportsModelsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
}
