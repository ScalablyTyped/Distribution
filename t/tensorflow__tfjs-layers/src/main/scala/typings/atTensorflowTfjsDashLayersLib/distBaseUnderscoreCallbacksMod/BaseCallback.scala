package typings
package atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "BaseCallback")
@js.native
abstract class BaseCallback () extends js.Object {
  /**
    * Training parameters (eg. verbosity, batch size, number of epochs...).
    */
  var params: Params = js.native
  var validationData: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def onBatchBegin(batch: scala.Double): js.Promise[scala.Unit] = js.native
  def onBatchBegin(batch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  def onBatchEnd(batch: scala.Double): js.Promise[scala.Unit] = js.native
  def onBatchEnd(batch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  def onEpochBegin(epoch: scala.Double): js.Promise[scala.Unit] = js.native
  def onEpochBegin(epoch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  def onEpochEnd(epoch: scala.Double): js.Promise[scala.Unit] = js.native
  def onEpochEnd(epoch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  def onTrainBegin(): js.Promise[scala.Unit] = js.native
  def onTrainBegin(logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  def onTrainEnd(): js.Promise[scala.Unit] = js.native
  def onTrainEnd(logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs): js.Promise[scala.Unit] = js.native
  def setModel(model: atTensorflowTfjsDashLayersLib.distEngineContainerMod.Container): scala.Unit = js.native
  def setParams(params: Params): scala.Unit = js.native
}

