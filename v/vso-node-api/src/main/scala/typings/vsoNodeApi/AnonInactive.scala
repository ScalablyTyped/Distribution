package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInactive extends js.Object {
  var active: Double
  var inactive: Double
}

object AnonInactive {
  @scala.inline
  def apply(active: Double, inactive: Double): AnonInactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInactive]
  }
}

