package typings.tooltipster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scroll extends js.Object {
  var scroll: Left
  var size: Height
}

object Scroll {
  @scala.inline
  def apply(scroll: Left, size: Height): Scroll = {
    val __obj = js.Dynamic.literal(scroll = scroll.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scroll]
  }
}

