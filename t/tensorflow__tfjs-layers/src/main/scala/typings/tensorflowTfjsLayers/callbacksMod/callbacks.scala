package typings.tensorflowTfjsLayers.callbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/callbacks", "callbacks")
@js.native
object callbacks extends js.Object {
  
  def earlyStopping(): EarlyStopping_ = js.native
  def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = js.native
  @JSName("earlyStopping")
  var earlyStopping_Original: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_] = js.native
}
