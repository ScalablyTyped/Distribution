package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.BaseCallbackConstructor
import typings.atTensorflowTfjsDashLayers.distEngineContainerMod.ContainerArgs
import typings.atTensorflowTfjsDashLayers.distEngineInputUnderscoreLayerMod.InputConfig
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import typings.atTensorflowTfjsDashLayers.distModelsMod.Sequential
import typings.atTensorflowTfjsDashLayers.distModelsMod.SequentialArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports", JSImport.Namespace)
@js.native
object distExportsMod extends js.Object {
  def input(config: InputConfig): SymbolicTensor = js.native
  def loadLayersModel(pathOrIOHandler: String): js.Promise[LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = js.native
  def model(args: ContainerArgs): LayersModel = js.native
  def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = js.native
  def sequential(): Sequential = js.native
  def sequential(config: SequentialArgs): Sequential = js.native
}

