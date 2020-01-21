package typings.vanillaSwipe.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var isSwiping: Boolean
  var start: Double
  var x: Double
  var y: Double
}

object State {
  @scala.inline
  def apply(isSwiping: Boolean, start: Double, x: Double, y: Double): State = {
    val __obj = js.Dynamic.literal(isSwiping = isSwiping.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

