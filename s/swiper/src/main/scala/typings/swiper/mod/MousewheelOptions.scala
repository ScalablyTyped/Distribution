package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousewheelOptions extends js.Object {
  var eventsTarged: js.UndefOr[SelectableElement] = js.native
  var forceToAxis: js.UndefOr[Boolean] = js.native
  var invert: js.UndefOr[Boolean] = js.native
  var releaseOnEdges: js.UndefOr[Boolean] = js.native
  var sensitivity: js.UndefOr[Double] = js.native
}

object MousewheelOptions {
  @scala.inline
  def apply(): MousewheelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousewheelOptions]
  }
  @scala.inline
  implicit class MousewheelOptionsOps[Self <: MousewheelOptions] (val x: Self) extends AnyVal {
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
    def setEventsTarged(value: SelectableElement): Self = this.set("eventsTarged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventsTarged: Self = this.set("eventsTarged", js.undefined)
    @scala.inline
    def setForceToAxis(value: Boolean): Self = this.set("forceToAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceToAxis: Self = this.set("forceToAxis", js.undefined)
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    @scala.inline
    def setReleaseOnEdges(value: Boolean): Self = this.set("releaseOnEdges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseOnEdges: Self = this.set("releaseOnEdges", js.undefined)
    @scala.inline
    def setSensitivity(value: Double): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitivity: Self = this.set("sensitivity", js.undefined)
  }
  
}

