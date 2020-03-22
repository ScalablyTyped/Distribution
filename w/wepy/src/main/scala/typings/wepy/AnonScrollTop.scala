package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScrollTop extends js.Object {
  var duration: Double
  var scrollTop: Double
}

object AnonScrollTop {
  @scala.inline
  def apply(duration: Double, scrollTop: Double): AnonScrollTop = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScrollTop]
  }
}

