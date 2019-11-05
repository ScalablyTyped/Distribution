package typings.vanillaDashSwipe.libTypesMod

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
    val __obj = js.Dynamic.literal(isSwiping = isSwiping, start = start, x = x, y = y)
  
    __obj.asInstanceOf[State]
  }
}

