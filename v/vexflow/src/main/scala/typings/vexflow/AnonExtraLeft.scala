package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtraLeft extends js.Object {
  var extraLeft: Double
  var extraRight: Double
  var left: Double
  var right: Double
}

object AnonExtraLeft {
  @scala.inline
  def apply(extraLeft: Double, extraRight: Double, left: Double, right: Double): AnonExtraLeft = {
    val __obj = js.Dynamic.literal(extraLeft = extraLeft.asInstanceOf[js.Any], extraRight = extraRight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtraLeft]
  }
}

