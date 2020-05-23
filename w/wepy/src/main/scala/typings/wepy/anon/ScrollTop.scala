package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollTop extends js.Object {
  var duration: Double
  var scrollTop: Double
}

object ScrollTop {
  @scala.inline
  def apply(duration: Double, scrollTop: Double): ScrollTop = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollTop]
  }
}

