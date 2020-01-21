package typings.tooltipster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScroll extends js.Object {
  var scroll: AnonLeft
  var size: AnonHeight
}

object AnonScroll {
  @scala.inline
  def apply(scroll: AnonLeft, size: AnonHeight): AnonScroll = {
    val __obj = js.Dynamic.literal(scroll = scroll.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScroll]
  }
}

