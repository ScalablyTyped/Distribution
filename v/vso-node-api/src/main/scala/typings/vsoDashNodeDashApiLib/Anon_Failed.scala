package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Failed extends js.Object {
  var failed: scala.Double
  var succeeded: scala.Double
  var unknown: scala.Double
}

object Anon_Failed {
  @scala.inline
  def apply(failed: scala.Double, succeeded: scala.Double, unknown: scala.Double): Anon_Failed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[Anon_Failed]
  }
}

