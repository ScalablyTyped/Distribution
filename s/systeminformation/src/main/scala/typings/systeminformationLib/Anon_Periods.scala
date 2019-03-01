package typings
package systeminformationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Periods extends js.Object {
  var periods: scala.Double
  var throttled_periods: scala.Double
  var throttled_time: scala.Double
}

object Anon_Periods {
  @scala.inline
  def apply(periods: scala.Double, throttled_periods: scala.Double, throttled_time: scala.Double): Anon_Periods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("periods")(periods)
    __obj.updateDynamic("throttled_periods")(throttled_periods)
    __obj.updateDynamic("throttled_time")(throttled_time)
    __obj.asInstanceOf[Anon_Periods]
  }
}

