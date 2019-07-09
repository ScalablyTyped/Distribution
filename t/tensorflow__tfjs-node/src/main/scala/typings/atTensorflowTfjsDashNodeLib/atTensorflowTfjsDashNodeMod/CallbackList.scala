package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "CallbackList")
@js.native
/**
  * Constructor of CallbackList.
  * @param callbacks Array of `Callback` instances.
  * @param queueLength Queue length for keeping running statistics over
  *   callback execution time.
  */
class CallbackList ()
  extends atTensorflowTfjsLib.atTensorflowTfjsMod.CallbackList {
  def this(callbacks: js.Array[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.BaseCallback]) = this()
  def this(callbacks: js.Array[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.BaseCallback], queueLength: scala.Double) = this()
}

