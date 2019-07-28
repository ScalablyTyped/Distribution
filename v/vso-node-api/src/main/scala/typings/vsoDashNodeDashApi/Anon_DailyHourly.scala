package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DailyHourly extends js.Object {
  var daily: Double
  var hourly: Double
}

object Anon_DailyHourly {
  @scala.inline
  def apply(daily: Double, hourly: Double): Anon_DailyHourly = {
    val __obj = js.Dynamic.literal(daily = daily, hourly = hourly)
  
    __obj.asInstanceOf[Anon_DailyHourly]
  }
}

