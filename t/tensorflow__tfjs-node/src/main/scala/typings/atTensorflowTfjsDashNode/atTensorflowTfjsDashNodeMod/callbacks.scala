package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashLayers.distCallbacksMod.EarlyStoppingCallbackArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "callbacks")
@js.native
object callbacks extends js.Object {
  @JSName("earlyStopping")
  var earlyStopping_Original: js.Function1[
    /* args */ js.UndefOr[EarlyStoppingCallbackArgs], 
    typings.atTensorflowTfjsDashLayers.distCallbacksMod.EarlyStopping
  ] = js.native
  def earlyStopping(): typings.atTensorflowTfjsDashLayers.distCallbacksMod.EarlyStopping = js.native
  def earlyStopping(args: EarlyStoppingCallbackArgs): typings.atTensorflowTfjsDashLayers.distCallbacksMod.EarlyStopping = js.native
}

