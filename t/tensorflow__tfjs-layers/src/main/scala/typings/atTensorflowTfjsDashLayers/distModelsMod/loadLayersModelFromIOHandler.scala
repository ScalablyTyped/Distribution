package typings.atTensorflowTfjsDashLayers.distModelsMod

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelFromIOHandler")
@js.native
object loadLayersModelFromIOHandler extends js.Object {
  def apply(handler: IOHandler): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: ConfigDict, options: LoadOptions): js.Promise[LayersModel] = js.native
}

