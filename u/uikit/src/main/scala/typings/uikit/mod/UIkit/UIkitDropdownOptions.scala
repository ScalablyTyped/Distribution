package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitDropdownOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var boundary: js.UndefOr[String] = js.native
  var `boundary-align`: js.UndefOr[Boolean] = js.native
  var `delay-hide`: js.UndefOr[Double] = js.native
  var `delay-show`: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var flip: js.UndefOr[Boolean | String] = js.native
  var mode: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Double] = js.native
  var pos: js.UndefOr[String] = js.native
  var toggle: js.UndefOr[String | Boolean] = js.native
}

object UIkitDropdownOptions {
  @scala.inline
  def apply(): UIkitDropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitDropdownOptions]
  }
  @scala.inline
  implicit class UIkitDropdownOptionsOps[Self <: UIkitDropdownOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setBoundary(value: String): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def `setBoundary-align`(value: Boolean): Self = this.set("boundary-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBoundary-align`: Self = this.set("boundary-align", js.undefined)
    @scala.inline
    def `setDelay-hide`(value: Double): Self = this.set("delay-hide", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDelay-hide`: Self = this.set("delay-hide", js.undefined)
    @scala.inline
    def `setDelay-show`(value: Double): Self = this.set("delay-show", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDelay-show`: Self = this.set("delay-show", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFlip(value: Boolean | String): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePos: Self = this.set("pos", js.undefined)
    @scala.inline
    def setToggle(value: String | Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
  
}

