package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualOptions extends js.Object {
  var addSlidesAfter: js.UndefOr[Double] = js.native
  var addSlidesBefore: js.UndefOr[Double] = js.native
  var cache: js.UndefOr[Boolean] = js.native
  var renderExternal: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var renderSlide: js.UndefOr[js.Function2[/* slide */ js.Any, /* index */ js.Any, _]] = js.native
  var slides: js.UndefOr[js.Array[_]] = js.native
}

object VirtualOptions {
  @scala.inline
  def apply(): VirtualOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualOptions]
  }
  @scala.inline
  implicit class VirtualOptionsOps[Self <: VirtualOptions] (val x: Self) extends AnyVal {
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
    def setAddSlidesAfter(value: Double): Self = this.set("addSlidesAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSlidesAfter: Self = this.set("addSlidesAfter", js.undefined)
    @scala.inline
    def setAddSlidesBefore(value: Double): Self = this.set("addSlidesBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSlidesBefore: Self = this.set("addSlidesBefore", js.undefined)
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setRenderExternal(value: /* data */ js.Any => _): Self = this.set("renderExternal", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderExternal: Self = this.set("renderExternal", js.undefined)
    @scala.inline
    def setRenderSlide(value: (/* slide */ js.Any, /* index */ js.Any) => _): Self = this.set("renderSlide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderSlide: Self = this.set("renderSlide", js.undefined)
    @scala.inline
    def setSlidesVarargs(value: js.Any*): Self = this.set("slides", js.Array(value :_*))
    @scala.inline
    def setSlides(value: js.Array[_]): Self = this.set("slides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlides: Self = this.set("slides", js.undefined)
  }
  
}

