package typings
package atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CustomCallback")
@js.native
class CustomCallback protected () extends BaseCallback {
  def this(args: CustomCallbackArgs) = this()
  def this(args: CustomCallbackArgs, yieldEvery: YieldEveryOptions) = this()
  var currentEpoch: js.Any = js.native
  var yieldEvery: js.Any = js.native
  /* protected */ def batchBegin(batch: scala.Double): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def batchBegin(batch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.Logs): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def batchEnd(batch: scala.Double): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def batchEnd(batch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.Logs): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def epochBegin(epoch: scala.Double): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def epochBegin(epoch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.Logs): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def epochEnd(epoch: scala.Double): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def epochEnd(epoch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.Logs): scala.Unit | js.Promise[scala.Unit] = js.native
  def maybeWait(
    epoch: scala.Double,
    batch: scala.Double,
    logs: atTensorflowTfjsDashLayersLib.distLogsMod.UnresolvedLogs
  ): js.Promise[scala.Unit] = js.native
  /* protected */ def trainBegin(): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def trainBegin(logs: atTensorflowTfjsDashLayersLib.distLogsMod.Logs): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def trainEnd(): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def trainEnd(logs: atTensorflowTfjsDashLayersLib.distLogsMod.Logs): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def `yield`(epoch: scala.Double, batch: scala.Double, logs: atTensorflowTfjsDashLayersLib.distLogsMod.Logs): scala.Unit | js.Promise[scala.Unit] = js.native
}

