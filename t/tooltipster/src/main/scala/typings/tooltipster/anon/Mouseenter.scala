package typings.tooltipster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mouseenter extends js.Object {
  /**
    * When the origin is clicked by a mouse.
    */
  var click: js.UndefOr[Boolean] = js.native
  /**
    * When a mouse comes over the origin. The delay option is taken into account as the delay before 
    * opening.
    */
  var mouseenter: js.UndefOr[Boolean] = js.native
  /**
    * When the origin is tapped (ie pressed and then released) on a touch screen.
    */
  var tap: js.UndefOr[Boolean] = js.native
  /**
    * When the origin is pressed on a touch screen. The delayTouch option is taken into account as the 
    * delay before opening.
    */
  var touchstart: js.UndefOr[Boolean] = js.native
}

object Mouseenter {
  @scala.inline
  def apply(): Mouseenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mouseenter]
  }
  @scala.inline
  implicit class MouseenterOps[Self <: Mouseenter] (val x: Self) extends AnyVal {
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
    def setClick(value: Boolean): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setMouseenter(value: Boolean): Self = this.set("mouseenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseenter: Self = this.set("mouseenter", js.undefined)
    @scala.inline
    def setTap(value: Boolean): Self = this.set("tap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTap: Self = this.set("tap", js.undefined)
    @scala.inline
    def setTouchstart(value: Boolean): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchstart: Self = this.set("touchstart", js.undefined)
  }
  
}

