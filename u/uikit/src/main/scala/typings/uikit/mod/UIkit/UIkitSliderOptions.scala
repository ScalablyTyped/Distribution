package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitSliderOptions extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.native
  var `autoplay-interval`: js.UndefOr[Double] = js.native
  var center: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var easing: js.UndefOr[String] = js.native
  var finite: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var `pause-on-hover`: js.UndefOr[Boolean] = js.native
  var sets: js.UndefOr[Boolean] = js.native
  var velocity: js.UndefOr[Double] = js.native
}

object UIkitSliderOptions {
  @scala.inline
  def apply(): UIkitSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitSliderOptions]
  }
  @scala.inline
  implicit class UIkitSliderOptionsOps[Self <: UIkitSliderOptions] (val x: Self) extends AnyVal {
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
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def `setAutoplay-interval`(value: Double): Self = this.set("autoplay-interval", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAutoplay-interval`: Self = this.set("autoplay-interval", js.undefined)
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setFinite(value: Boolean): Self = this.set("finite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinite: Self = this.set("finite", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def `setPause-on-hover`(value: Boolean): Self = this.set("pause-on-hover", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePause-on-hover`: Self = this.set("pause-on-hover", js.undefined)
    @scala.inline
    def setSets(value: Boolean): Self = this.set("sets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSets: Self = this.set("sets", js.undefined)
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
  
}

