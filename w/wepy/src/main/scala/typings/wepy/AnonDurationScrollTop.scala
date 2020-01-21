package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationScrollTop extends js.Object {
  var duration: Double
  var scrollTop: Double
}

object AnonDurationScrollTop {
  @scala.inline
  def apply(duration: Double, scrollTop: Double): AnonDurationScrollTop = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDurationScrollTop]
  }
}

