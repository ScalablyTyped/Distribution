package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglBackendUnderscoreWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUTimerQuery extends js.Object {
  var endMs: js.UndefOr[scala.Double] = js.undefined
  var startMs: scala.Double
}

object CPUTimerQuery {
  @scala.inline
  def apply(startMs: scala.Double, endMs: scala.Int | scala.Double = null): CPUTimerQuery = {
    val __obj = js.Dynamic.literal(startMs = startMs)
    if (endMs != null) __obj.updateDynamic("endMs")(endMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUTimerQuery]
  }
}

