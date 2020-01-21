package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveInactive extends js.Object {
  var active: Double
  var inactive: Double
}

object AnonActiveInactive {
  @scala.inline
  def apply(active: Double, inactive: Double): AnonActiveInactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveInactive]
  }
}

