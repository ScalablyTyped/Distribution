package typings
package atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackList")
@js.native
/**
  * Constructor of CallbackList.
  * @param callbacks Array of `Callback` instances.
  * @param queueLength Queue length for keeping running statistics over
  *   callback execution time.
  */
class CallbackList () extends js.Object {
  def this(callbacks: js.Array[BaseCallback]) = this()
  def this(callbacks: js.Array[BaseCallback], queueLength: scala.Double) = this()
  var callbacks: js.Array[BaseCallback] = js.native
  var queueLength: scala.Double = js.native
  def append(callback: BaseCallback): scala.Unit = js.native
  /**
    * Called  right before processing a batch.
    * @param batch Index of batch within the current epoch.
    * @param logs Dictionary of logs.
    */
  def onBatchBegin(batch: scala.Double): js.Promise[scala.Unit] = js.native
  def onBatchBegin(batch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  /**
    * Called at the end of a batch.
    * @param batch Index of batch within the current epoch.
    * @param logs Dictionary of logs.
    */
  def onBatchEnd(batch: scala.Double): js.Promise[scala.Unit] = js.native
  def onBatchEnd(batch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  /**
    * Called at the start of an epoch.
    * @param epoch Index of epoch.
    * @param logs Dictionary of logs.
    */
  def onEpochBegin(epoch: scala.Double): js.Promise[scala.Unit] = js.native
  def onEpochBegin(epoch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  /**
    * Called at the end of an epoch.
    * @param epoch Index of epoch.
    * @param logs Dictionary of logs.
    */
  def onEpochEnd(epoch: scala.Double): js.Promise[scala.Unit] = js.native
  def onEpochEnd(epoch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  /**
    * Called at the beginning of training.
    * @param logs Dictionary of logs.
    */
  def onTrainBegin(): js.Promise[scala.Unit] = js.native
  def onTrainBegin(logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  /**
    * Called at the end of training.
    * @param logs Dictionary of logs.
    */
  def onTrainEnd(): js.Promise[scala.Unit] = js.native
  def onTrainEnd(logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  def setModel(model: atTensorflowTfjsDashLayersLib.distEngineContainerMod.Container): scala.Unit = js.native
  def setParams(params: Params): scala.Unit = js.native
}

