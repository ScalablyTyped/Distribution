package typings.atTensorflowTfjsDashLayers.distCallbacksMod

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.auto
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.max
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/callbacks", "EarlyStopping")
@js.native
class EarlyStopping () extends Callback {
  def this(args: EarlyStoppingCallbackArgs) = this()
  val baseline: Double = js.native
  var best: js.Any = js.native
  var getMonitorValue: js.Any = js.native
  val minDelta: Double = js.native
  val mode: auto | min | max = js.native
  val monitor: String = js.native
  val patience: Double = js.native
  var stoppedEpoch: js.Any = js.native
  val verbose: Double = js.native
  @JSName("wait")
  var wait_FEarlyStopping: js.Any = js.native
  /* protected */ def monitorFunc(currVal: Double, prevVal: Double): Boolean = js.native
}

@JSImport("@tensorflow/tfjs-layers/dist/callbacks", "earlyStopping")
@js.native
object earlyStopping extends js.Object {
  def apply(): EarlyStopping = js.native
  def apply(args: EarlyStoppingCallbackArgs): EarlyStopping = js.native
}

