package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsOverlapping extends js.Object {
  var isOverlapping: scala.Double
  var oK: scala.Double
}

object IsOverlapping {
  @scala.inline
  def apply(isOverlapping: scala.Double, oK: scala.Double): IsOverlapping = {
    val __obj = js.Dynamic.literal(isOverlapping = isOverlapping.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOverlapping]
  }
}

