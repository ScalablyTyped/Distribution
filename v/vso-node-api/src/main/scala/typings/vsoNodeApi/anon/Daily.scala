package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Daily extends js.Object {
  var daily: scala.Double
}

object Daily {
  @scala.inline
  def apply(daily: scala.Double): Daily = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Daily]
  }
}

