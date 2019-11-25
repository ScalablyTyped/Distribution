package typings.atTensorflowTfjsDashLayers.distEngineTopologyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisposeResult extends js.Object {
  /**
    * Number of variables dispose in this dispose call.
    */
  var numDisposedVariables: Double
  /**
    * Reference count after the dispose call.
    */
  var refCountAfterDispose: Double
}

object DisposeResult {
  @scala.inline
  def apply(numDisposedVariables: Double, refCountAfterDispose: Double): DisposeResult = {
    val __obj = js.Dynamic.literal(numDisposedVariables = numDisposedVariables.asInstanceOf[js.Any], refCountAfterDispose = refCountAfterDispose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisposeResult]
  }
}

