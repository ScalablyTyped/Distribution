package typings.tensorflowTfjsCore.backendWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUTimerQuery extends js.Object {
  var endMs: js.UndefOr[Double] = js.undefined
  var startMs: Double
}

object CPUTimerQuery {
  @scala.inline
  def apply(startMs: Double, endMs: js.UndefOr[Double] = js.undefined): CPUTimerQuery = {
    val __obj = js.Dynamic.literal(startMs = startMs.asInstanceOf[js.Any])
    if (!js.isUndefined(endMs)) __obj.updateDynamic("endMs")(endMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUTimerQuery]
  }
}

