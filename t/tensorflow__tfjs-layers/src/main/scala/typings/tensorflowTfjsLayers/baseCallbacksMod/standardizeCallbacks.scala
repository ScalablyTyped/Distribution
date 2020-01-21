package typings.tensorflowTfjsLayers.baseCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "standardizeCallbacks")
@js.native
object standardizeCallbacks extends js.Object {
  def apply(callbacks: js.Array[BaseCallback | CustomCallbackArgs], yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
  def apply(callbacks: BaseCallback, yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
  def apply(callbacks: CustomCallbackArgs, yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
}

