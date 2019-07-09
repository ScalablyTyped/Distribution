package typings
package atTensorflowTfjsDashLayersLib.distEngineTopologyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisposeResult extends js.Object {
  /**
    * Number of variables dispose in this dispose call.
    */
  var numDisposedVariables: scala.Double
  /**
    * Reference count after the dispose call.
    */
  var refCountAfterDispose: scala.Double
}

object DisposeResult {
  @scala.inline
  def apply(numDisposedVariables: scala.Double, refCountAfterDispose: scala.Double): DisposeResult = {
    val __obj = js.Dynamic.literal(numDisposedVariables = numDisposedVariables, refCountAfterDispose = refCountAfterDispose)
  
    __obj.asInstanceOf[DisposeResult]
  }
}

