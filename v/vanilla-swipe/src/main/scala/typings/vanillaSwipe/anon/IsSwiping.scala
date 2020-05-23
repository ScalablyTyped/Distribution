package typings.vanillaSwipe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsSwiping extends js.Object {
  var isSwiping: Boolean
  var start: Double
  var x: Double
  var y: Double
}

object IsSwiping {
  @scala.inline
  def apply(isSwiping: Boolean, start: Double, x: Double, y: Double): IsSwiping = {
    val __obj = js.Dynamic.literal(isSwiping = isSwiping.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSwiping]
  }
}

