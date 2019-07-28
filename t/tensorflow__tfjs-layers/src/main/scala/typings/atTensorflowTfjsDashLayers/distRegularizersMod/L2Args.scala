package typings.atTensorflowTfjsDashLayers.distRegularizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait L2Args extends js.Object {
  /** L2 regularization rate. Defaults to 0.01. */
  var l2: Double
}

object L2Args {
  @scala.inline
  def apply(l2: Double): L2Args = {
    val __obj = js.Dynamic.literal(l2 = l2)
  
    __obj.asInstanceOf[L2Args]
  }
}

