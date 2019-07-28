package typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.`1DOT2DOT5`
import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.BaseCallbackConstructor
import typings.atTensorflowTfjsDashLayers.distEngineContainerMod.ContainerArgs
import typings.atTensorflowTfjsDashLayers.distEngineInputUnderscoreLayerMod.InputConfig
import typings.atTensorflowTfjsDashLayers.distModelsMod.SequentialArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version_layers: `1DOT2DOT5` = js.native
  def input(config: InputConfig): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor = js.native
  def loadLayersModel(pathOrIOHandler: String): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def model(args: ContainerArgs): typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel = js.native
  def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = js.native
  def sequential(): typings.atTensorflowTfjsDashLayers.distModelsMod.Sequential = js.native
  def sequential(config: SequentialArgs): typings.atTensorflowTfjsDashLayers.distModelsMod.Sequential = js.native
}

