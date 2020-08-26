package typings.tensorflowTfjsLayers.modelsMod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import typings.tensorflowTfjsLayers.trainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelFromIOHandler")
@js.native
object loadLayersModelFromIOHandler extends js.Object {
  def apply(handler: IOHandler): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: js.UndefOr[scala.Nothing], options: LoadOptions): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: ConfigDict, options: LoadOptions): js.Promise[LayersModel] = js.native
}

