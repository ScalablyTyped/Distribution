package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "loadLayersModel")
@js.native
object loadLayersModel extends js.Object {
  def apply(pathOrIOHandler: String): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: String, options: LoadOptions): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
}

