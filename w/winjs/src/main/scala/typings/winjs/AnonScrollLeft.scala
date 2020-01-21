package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScrollLeft extends js.Object {
  var scrollLeft: Double
  var scrollTop: Double
}

object AnonScrollLeft {
  @scala.inline
  def apply(scrollLeft: Double, scrollTop: Double): AnonScrollLeft = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScrollLeft]
  }
}

