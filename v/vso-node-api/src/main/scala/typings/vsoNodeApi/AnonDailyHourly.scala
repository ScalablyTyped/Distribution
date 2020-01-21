package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDailyHourly extends js.Object {
  var daily: Double
  var hourly: Double
}

object AnonDailyHourly {
  @scala.inline
  def apply(daily: Double, hourly: Double): AnonDailyHourly = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any], hourly = hourly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDailyHourly]
  }
}

