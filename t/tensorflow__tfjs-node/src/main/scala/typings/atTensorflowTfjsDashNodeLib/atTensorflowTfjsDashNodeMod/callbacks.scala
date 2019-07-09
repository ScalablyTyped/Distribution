package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "callbacks")
@js.native
object callbacks extends js.Object {
  @JSName("earlyStopping")
  var earlyStopping_Original: js.Function1[
    /* args */ js.UndefOr[atTensorflowTfjsDashLayersLib.distCallbacksMod.EarlyStoppingCallbackArgs], 
    atTensorflowTfjsDashLayersLib.distCallbacksMod.EarlyStopping
  ] = js.native
  def earlyStopping(): atTensorflowTfjsDashLayersLib.distCallbacksMod.EarlyStopping = js.native
  def earlyStopping(args: atTensorflowTfjsDashLayersLib.distCallbacksMod.EarlyStoppingCallbackArgs): atTensorflowTfjsDashLayersLib.distCallbacksMod.EarlyStopping = js.native
}

