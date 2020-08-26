package typings.tensorflowTfjsNode.callbacksMod

import typings.tensorflowTfjs.mod.CustomCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/callbacks", "TensorBoardCallback")
@js.native
class TensorBoardCallback () extends CustomCallback {
  def this(logdir: String) = this()
  def this(logdir: js.UndefOr[scala.Nothing], args: TensorBoardCallbackArgs) = this()
  def this(logdir: String, args: TensorBoardCallbackArgs) = this()
  val args: js.Any = js.native
  var batchesSeen: js.Any = js.native
  var ensureTrainWriterCreated: js.Any = js.native
  var ensureValWriterCreated: js.Any = js.native
  var epochsSeen: js.Any = js.native
  var logMetrics: js.Any = js.native
  val logdir: String = js.native
  var trainWriter: js.Any = js.native
  var valWriter: js.Any = js.native
}

