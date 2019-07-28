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
    val __obj = js.Dynamic.literal(continuousIntegration = continuousIntegration, manual = manual, none = none, schedule = schedule)
  
    __obj.asInstanceOf[Anon_ContinuousIntegration]
  }
}

