package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousIntegration extends js.Object {
  var continuousIntegration: scala.Double
  var manual: scala.Double
  var none: scala.Double
  var schedule: scala.Double
}

object ContinuousIntegration {
  @scala.inline
  def apply(
    continuousIntegration: scala.Double,
    manual: scala.Double,
    none: scala.Double,
    schedule: scala.Double
  ): ContinuousIntegration = {
    val __obj = js.Dynamic.literal(continuousIntegration = continuousIntegration.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousIntegration]
  }
}

