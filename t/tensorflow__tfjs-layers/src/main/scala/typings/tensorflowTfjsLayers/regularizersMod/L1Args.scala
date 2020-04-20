package typings.tensorflowTfjsLayers.regularizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait L1Args extends js.Object {
  /** L1 regularization rate. Defaults to 0.01. */
  var l1: Double
}

object L1Args {
  @scala.inline
  def apply(l1: Double): L1Args = {
    val __obj = js.Dynamic.literal(l1 = l1.asInstanceOf[js.Any])
    __obj.asInstanceOf[L1Args]
  }
}

