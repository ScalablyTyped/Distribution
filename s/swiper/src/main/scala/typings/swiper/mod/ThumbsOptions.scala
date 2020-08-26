package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThumbsOptions extends js.Object {
  var autoScrollOffset: js.UndefOr[Double] = js.native
  var multipleActiveThumbs: js.UndefOr[Boolean] = js.native
  var slideThumbActiveClass: js.UndefOr[String] = js.native
  var swiper: js.UndefOr[Swiper] = js.native
  var thumbsContainerClass: js.UndefOr[String] = js.native
}

object ThumbsOptions {
  @scala.inline
  def apply(): ThumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbsOptions]
  }
  @scala.inline
  implicit class ThumbsOptionsOps[Self <: ThumbsOptions] (val x: Self) extends AnyVal {
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
    def setAutoScrollOffset(value: Double): Self = this.set("autoScrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScrollOffset: Self = this.set("autoScrollOffset", js.undefined)
    @scala.inline
    def setMultipleActiveThumbs(value: Boolean): Self = this.set("multipleActiveThumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleActiveThumbs: Self = this.set("multipleActiveThumbs", js.undefined)
    @scala.inline
    def setSlideThumbActiveClass(value: String): Self = this.set("slideThumbActiveClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideThumbActiveClass: Self = this.set("slideThumbActiveClass", js.undefined)
    @scala.inline
    def setSwiper(value: Swiper): Self = this.set("swiper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwiper: Self = this.set("swiper", js.undefined)
    @scala.inline
    def setThumbsContainerClass(value: String): Self = this.set("thumbsContainerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbsContainerClass: Self = this.set("thumbsContainerClass", js.undefined)
  }
  
}

