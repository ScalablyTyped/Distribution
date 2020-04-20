package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsOverlapping extends js.Object {
  var isOverlapping: Double
  var oK: Double
}

object AnonIsOverlapping {
  @scala.inline
  def apply(isOverlapping: Double, oK: Double): AnonIsOverlapping = {
    val __obj = js.Dynamic.literal(isOverlapping = isOverlapping.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsOverlapping]
  }
}

