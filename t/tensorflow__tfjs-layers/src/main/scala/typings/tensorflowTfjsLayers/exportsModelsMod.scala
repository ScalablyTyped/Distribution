package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsLayers.modelsMod.ModelAndWeightsConfig
import typings.tensorflowTfjsLayers.trainingMod.LayersModel
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportsModelsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  @scala.inline
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  @scala.inline
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  @scala.inline
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
}
