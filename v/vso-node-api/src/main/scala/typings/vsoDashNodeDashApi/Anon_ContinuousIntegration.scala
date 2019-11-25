package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContinuousIntegration extends js.Object {
  var continuousIntegration: Double
  var manual: Double
  var none: Double
  var schedule: Double
}

object Anon_ContinuousIntegration {
  @scala.inline
  def apply(continuousIntegration: Double, manual: Double, none: Double, schedule: Double): Anon_ContinuousIntegration = {
    val __obj = js.Dynamic.literal(continuousIntegration = continuousIntegration.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContinuousIntegration]
  }
}

