package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DailyHourly extends js.Object {
  var daily: scala.Double
  var hourly: scala.Double
}

object Anon_DailyHourly {
  @scala.inline
  def apply(daily: scala.Double, hourly: scala.Double): Anon_DailyHourly = {
    val __obj = js.Dynamic.literal(daily = daily, hourly = hourly)
  
    __obj.asInstanceOf[Anon_DailyHourly]
  }
}

