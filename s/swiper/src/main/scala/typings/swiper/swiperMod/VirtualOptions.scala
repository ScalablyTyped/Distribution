package typings.swiper.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualOptions extends js.Object {
  var addSlidesAfter: js.UndefOr[Double] = js.undefined
  var addSlidesBefore: js.UndefOr[Double] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var renderExternal: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var renderSlide: js.UndefOr[js.Function2[/* slide */ js.Any, /* index */ js.Any, _]] = js.undefined
  var slides: js.UndefOr[js.Array[_]] = js.undefined
}

object VirtualOptions {
  @scala.inline
  def apply(
    addSlidesAfter: Int | Double = null,
    addSlidesBefore: Int | Double = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    renderExternal: /* data */ js.Any => _ = null,
    renderSlide: (/* slide */ js.Any, /* index */ js.Any) => _ = null,
    slides: js.Array[_] = null
  ): VirtualOptions = {
    val __obj = js.Dynamic.literal()
    if (addSlidesAfter != null) __obj.updateDynamic("addSlidesAfter")(addSlidesAfter.asInstanceOf[js.Any])
    if (addSlidesBefore != null) __obj.updateDynamic("addSlidesBefore")(addSlidesBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (renderExternal != null) __obj.updateDynamic("renderExternal")(js.Any.fromFunction1(renderExternal))
    if (renderSlide != null) __obj.updateDynamic("renderSlide")(js.Any.fromFunction2(renderSlide))
    if (slides != null) __obj.updateDynamic("slides")(slides.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualOptions]
  }
}

