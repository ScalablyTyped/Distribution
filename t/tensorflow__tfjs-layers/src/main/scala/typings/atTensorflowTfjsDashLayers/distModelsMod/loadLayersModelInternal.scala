package typings.atTensorflowTfjsDashLayers.distModelsMod

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelInternal")
@js.native
object loadLayersModelInternal extends js.Object {
  def apply(pathOrIOHandler: String): js.Promise[LayersModel] = js.native
  def apply(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = js.native
}

