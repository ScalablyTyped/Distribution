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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def input(config: InputConfig): SymbolicTensor = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(config.asInstanceOf[js.Any]).asInstanceOf[SymbolicTensor]
  
  @scala.inline
  def loadLayersModel(pathOrIOHandler: String): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  @scala.inline
  def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  @scala.inline
  def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  @scala.inline
  def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  
  @scala.inline
  def model(args: ContainerArgs): LayersModel = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(args.asInstanceOf[js.Any]).asInstanceOf[LayersModel]
  
  @scala.inline
  def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCallbackConstructor")(verbosityLevel.asInstanceOf[js.Any], callbackConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def sequential(): Sequential = ^.asInstanceOf[js.Dynamic].applyDynamic("sequential")().asInstanceOf[Sequential]
  @scala.inline
  def sequential(config: SequentialArgs): Sequential = ^.asInstanceOf[js.Dynamic].applyDynamic("sequential")(config.asInstanceOf[js.Any]).asInstanceOf[Sequential]
}
