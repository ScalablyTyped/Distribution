package typings.vanillaDashSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsSwiping extends js.Object {
  var isSwiping: Boolean
  var start: Double
  var x: Double
  var y: Double
}

object Anon_IsSwiping {
  @scala.inline
  def apply(isSwiping: Boolean, start: Double, x: Double, y: Double): Anon_IsSwiping = {
    val __obj = js.Dynamic.literal(isSwiping = isSwiping.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IsSwiping]
  }
}

