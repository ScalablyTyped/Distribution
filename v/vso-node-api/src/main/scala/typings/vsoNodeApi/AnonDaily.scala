package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDaily extends js.Object {
  var daily: Double
}

object AnonDaily {
  @scala.inline
  def apply(daily: Double): AnonDaily = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDaily]
  }
}

