package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraLeft extends js.Object {
  var extraLeft: Double
  var extraRight: Double
  var left: Double
  var right: Double
}

object ExtraLeft {
  @scala.inline
  def apply(extraLeft: Double, extraRight: Double, left: Double, right: Double): ExtraLeft = {
    val __obj = js.Dynamic.literal(extraLeft = extraLeft.asInstanceOf[js.Any], extraRight = extraRight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraLeft]
  }
}

