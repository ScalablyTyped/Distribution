package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsLayers.baseCallbacksMod.BaseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "CallbackList")
@js.native
/**
  * Constructor of CallbackList.
  * @param callbacks Array of `Callback` instances.
  * @param queueLength Queue length for keeping running statistics over
  *   callback execution time.
  */
class CallbackList ()
  extends typings.tensorflowTfjsLayers.mod.CallbackList {
  def this(callbacks: js.Array[BaseCallback]) = this()
  def this(callbacks: js.UndefOr[scala.Nothing], queueLength: Double) = this()
  def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
}
