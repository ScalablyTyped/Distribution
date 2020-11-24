package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import typings.tensorflowTfjsLayers.baseCallbacksMod.BaseCallbackConstructor
import typings.tensorflowTfjsLayers.containerMod.ContainerArgs
import typings.tensorflowTfjsLayers.inputLayerMod.InputConfig
import typings.tensorflowTfjsLayers.modelsMod.Sequential
import typings.tensorflowTfjsLayers.modelsMod.SequentialArgs
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import typings.tensorflowTfjsLayers.trainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/exports", JSImport.Namespace)
@js.native
object exportsMod extends js.Object {
  
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
