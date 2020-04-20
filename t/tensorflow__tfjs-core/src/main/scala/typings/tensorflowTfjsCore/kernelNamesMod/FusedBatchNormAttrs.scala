package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusedBatchNormAttrs extends js.Object {
  var varianceEpsilon: Double
}

object FusedBatchNormAttrs {
  @scala.inline
  def apply(varianceEpsilon: Double): FusedBatchNormAttrs = {
    val __obj = js.Dynamic.literal(varianceEpsilon = varianceEpsilon.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedBatchNormAttrs]
  }
}

