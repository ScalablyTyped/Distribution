package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollTop extends js.Object {
  var duration: Double = js.native
  var scrollTop: Double = js.native
}

object ScrollTop {
  @scala.inline
  def apply(duration: Double, scrollTop: Double): ScrollTop = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollTop]
  }
  @scala.inline
  implicit class ScrollTopOps[Self <: ScrollTop] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
  }
  
}

