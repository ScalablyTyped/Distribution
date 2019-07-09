package typings
package atTensorflowTfjsDashLayersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports", JSImport.Namespace)
@js.native
object distExportsMod extends js.Object {
  def input(config: atTensorflowTfjsDashLayersLib.distEngineInputUnderscoreLayerMod.InputConfig): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor = js.native
  def loadLayersModel(pathOrIOHandler: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModel(
    pathOrIOHandler: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler,
    options: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions
  ): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: java.lang.String): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: java.lang.String, options: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions): js.Promise[atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel] = js.native
  def model(args: atTensorflowTfjsDashLayersLib.distEngineContainerMod.ContainerArgs): atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel = js.native
  def registerCallbackConstructor(
    verbosityLevel: scala.Double,
    callbackConstructor: atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.BaseCallbackConstructor
  ): scala.Unit = js.native
  def sequential(): atTensorflowTfjsDashLayersLib.distModelsMod.Sequential = js.native
  def sequential(config: atTensorflowTfjsDashLayersLib.distModelsMod.SequentialArgs): atTensorflowTfjsDashLayersLib.distModelsMod.Sequential = js.native
}

