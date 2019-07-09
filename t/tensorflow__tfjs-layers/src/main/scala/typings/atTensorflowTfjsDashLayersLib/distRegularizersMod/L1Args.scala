package typings
package atTensorflowTfjsDashLayersLib.distRegularizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait L1Args extends js.Object {
  /** L1 regularization rate. Defaults to 0.01. */
  var l1: scala.Double
}

object L1Args {
  @scala.inline
  def apply(l1: scala.Double): L1Args = {
    val __obj = js.Dynamic.literal(l1 = l1)
  
    __obj.asInstanceOf[L1Args]
  }
}

