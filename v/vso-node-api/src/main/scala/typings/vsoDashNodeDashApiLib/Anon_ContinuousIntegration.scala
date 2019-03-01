package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContinuousIntegration extends js.Object {
  var continuousIntegration: scala.Double
  var manual: scala.Double
  var none: scala.Double
  var schedule: scala.Double
}

object Anon_ContinuousIntegration {
  @scala.inline
  def apply(
    continuousIntegration: scala.Double,
    manual: scala.Double,
    none: scala.Double,
    schedule: scala.Double
  ): Anon_ContinuousIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("continuousIntegration")(continuousIntegration)
    __obj.updateDynamic("manual")(manual)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("schedule")(schedule)
    __obj.asInstanceOf[Anon_ContinuousIntegration]
  }
}

