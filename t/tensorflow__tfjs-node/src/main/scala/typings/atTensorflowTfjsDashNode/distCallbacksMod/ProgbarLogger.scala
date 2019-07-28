package typings.atTensorflowTfjsDashNode.distCallbacksMod

import typings.atTensorflowTfjs.atTensorflowTfjsMod.CustomCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/callbacks", "ProgbarLogger")
@js.native
/**
  * Construtor of LoggingCallback.
  */
class ProgbarLogger () extends CustomCallback {
  val RENDER_THROTTLE_MS: js.Any = js.native
  var batchesInLatestEpoch: js.Any = js.native
  var currentEpochBegin: js.Any = js.native
  var epochDurationMillis: js.Any = js.native
  var formatLogsAsMetricsContent: js.Any = js.native
  var isFieldRelevant: js.Any = js.native
  var numTrainBatchesPerEpoch: js.Any = js.native
  var progressBar: js.Any = js.native
  var terminalWidth: js.Any = js.native
  var usPerStep: js.Any = js.native
}

