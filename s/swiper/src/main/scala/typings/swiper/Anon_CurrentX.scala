package typings.swiper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentX extends js.Object {
  var currentX: Double
  var currentY: Double
  var diff: Double
  var startX: Double
  var startY: Double
}

object Anon_CurrentX {
  @scala.inline
  def apply(currentX: Double, currentY: Double, diff: Double, startX: Double, startY: Double): Anon_CurrentX = {
    val __obj = js.Dynamic.literal(currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CurrentX]
  }
}

