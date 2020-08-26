package typings.tooltipster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scroll extends js.Object {
  var scroll: Left = js.native
  var size: Height = js.native
}

object Scroll {
  @scala.inline
  def apply(scroll: Left, size: Height): Scroll = {
    val __obj = js.Dynamic.literal(scroll = scroll.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scroll]
  }
  @scala.inline
  implicit class ScrollOps[Self <: Scroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScroll(value: Left): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Height): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

