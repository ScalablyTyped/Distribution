package typings
package atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "CallbackList")
@js.native
/**
  * Constructor of CallbackList.
  * @param callbacks Array of `Callback` instances.
  * @param queueLength Queue length for keeping running statistics over
  *   callback execution time.
  */
class CallbackList ()
  extends atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.CallbackList {
  def this(callbacks: js.Array[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.BaseCallback]) = this()
  def this(callbacks: js.Array[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.BaseCallback], queueLength: scala.Double) = this()
}

