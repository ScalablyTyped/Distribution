package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHourly extends js.Object {
  var daily: Double
  var hourly: Double
}

object AnonHourly {
  @scala.inline
  def apply(daily: Double, hourly: Double): AnonHourly = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any], hourly = hourly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHourly]
  }
}

