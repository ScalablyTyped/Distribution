package typings.tensorflowTfjsLayers.baseCallbacksMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.containerMod.Container
import typings.tensorflowTfjsLayers.logsMod.UnresolvedLogs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "BaseCallback")
@js.native
abstract class BaseCallback () extends js.Object {
  
  def onBatchBegin(batch: Double): js.Promise[Unit] = js.native
  def onBatchBegin(batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  def onBatchEnd(batch: Double): js.Promise[Unit] = js.native
  def onBatchEnd(batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  def onEpochBegin(epoch: Double): js.Promise[Unit] = js.native
  def onEpochBegin(epoch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  def onEpochEnd(epoch: Double): js.Promise[Unit] = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  def onTrainBegin(): js.Promise[Unit] = js.native
  def onTrainBegin(logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  def onTrainEnd(): js.Promise[Unit] = js.native
  def onTrainEnd(logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  /**
    * Training parameters (eg. verbosity, batch size, number of epochs...).
    */
  var params: Params = js.native
  
  def setModel(model: Container): Unit = js.native
  
  def setParams(params: Params): Unit = js.native
  
  var validationData: Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
}
