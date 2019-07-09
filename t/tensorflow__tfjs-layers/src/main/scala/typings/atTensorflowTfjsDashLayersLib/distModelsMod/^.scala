package typings
package atTensorflowTfjsDashLayersLib.distModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def loadLayersModelFromIOHandler(handler: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModelFromIOHandler(
    handler: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModelFromIOHandler(
    handler: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict,
    options: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions
  ): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModelInternal(pathOrIOHandler: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModelInternal(
    pathOrIOHandler: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler,
    options: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions
  ): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModelInternal(pathOrIOHandler: java.lang.String): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModelInternal(pathOrIOHandler: java.lang.String, options: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.PyJsonDict): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(
    modelAndWeightsConfig: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.PyJsonDict,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def modelFromJSON(
    modelAndWeightsConfig: ModelAndWeightsConfig,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
}

