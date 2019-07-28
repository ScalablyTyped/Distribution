package typings.atTensorflowTfjsDashLayers.distModelsMod

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def loadLayersModelFromIOHandler(handler: IOHandler): js.Promise[LayersModel] = js.native
  def loadLayersModelFromIOHandler(handler: IOHandler, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def loadLayersModelFromIOHandler(handler: IOHandler, customObjects: ConfigDict, options: LoadOptions): js.Promise[LayersModel] = js.native
  def loadLayersModelInternal(pathOrIOHandler: String): js.Promise[LayersModel] = js.native
  def loadLayersModelInternal(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = js.native
  def loadLayersModelInternal(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = js.native
  def loadLayersModelInternal(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
}

