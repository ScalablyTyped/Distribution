package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContinuousIntegration extends js.Object {
  var continuousIntegration: Double
  var manual: Double
  var none: Double
  var schedule: Double
}

object AnonContinuousIntegration {
  @scala.inline
  def apply(continuousIntegration: Double, manual: Double, none: Double, schedule: Double): AnonContinuousIntegration = {
    val __obj = js.Dynamic.literal(continuousIntegration = continuousIntegration.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContinuousIntegration]
  }
}

