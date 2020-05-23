package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hourly extends js.Object {
  var daily: scala.Double
  var hourly: scala.Double
}

object Hourly {
  @scala.inline
  def apply(daily: scala.Double, hourly: scala.Double): Hourly = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any], hourly = hourly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hourly]
  }
}

