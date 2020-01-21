package typings.tensorflowTfjsLayers.mod

import typings.tensorflowTfjsLayers.callbacksMod.EarlyStoppingCallbackArgs
import typings.tensorflowTfjsLayers.callbacksMod.EarlyStopping_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "callbacks")
@js.native
object callbacks extends js.Object {
  @JSName("earlyStopping")
  var earlyStopping_Original: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_] = js.native
  def earlyStopping(): EarlyStopping_ = js.native
  def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = js.native
}

