package typings.atTensorflowTfjsDashCore.distBackendsWebglBackendUnderscoreWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUTimerQuery extends js.Object {
  var endMs: js.UndefOr[Double] = js.undefined
  var startMs: Double
}

object CPUTimerQuery {
  @scala.inline
  def apply(startMs: Double, endMs: Int | Double = null): CPUTimerQuery = {
    val __obj = js.Dynamic.literal(startMs = startMs.asInstanceOf[js.Any])
    if (endMs != null) __obj.updateDynamic("endMs")(endMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUTimerQuery]
  }
}

