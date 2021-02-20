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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports", "input")
  @js.native
  def input(config: InputConfig): SymbolicTensor = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: String): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/exports", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/exports", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/exports", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports", "model")
  @js.native
  def model(args: ContainerArgs): LayersModel = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports", "registerCallbackConstructor")
  @js.native
  def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports", "sequential")
  @js.native
  def sequential(): Sequential = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/exports", "sequential")
  @js.native
  def sequential(config: SequentialArgs): Sequential = js.native
}
