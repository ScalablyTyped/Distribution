package typings
package atTensorflowTfjsDashLayersLib.distCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/callbacks", "EarlyStopping")
@js.native
class EarlyStopping () extends Callback {
  def this(args: EarlyStoppingCallbackArgs) = this()
  val baseline: scala.Double = js.native
  var best: js.Any = js.native
  var getMonitorValue: js.Any = js.native
  val minDelta: scala.Double = js.native
  val mode: atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.auto | atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.min | atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.max = js.native
  val monitor: java.lang.String = js.native
  val patience: scala.Double = js.native
  var stoppedEpoch: js.Any = js.native
  val verbose: scala.Double = js.native
  @JSName("wait")
  var wait_FEarlyStopping: js.Any = js.native
  /* protected */ def monitorFunc(currVal: scala.Double, prevVal: scala.Double): scala.Boolean = js.native
}

