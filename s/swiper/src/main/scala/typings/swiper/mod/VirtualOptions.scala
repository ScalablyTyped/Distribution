package typings.swiper.mod

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
    addSlidesAfter: js.UndefOr[Double] = js.undefined,
    addSlidesBefore: js.UndefOr[Double] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    renderExternal: /* data */ js.Any => _ = null,
    renderSlide: (/* slide */ js.Any, /* index */ js.Any) => _ = null,
    slides: js.Array[_] = null
  ): VirtualOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSlidesAfter)) __obj.updateDynamic("addSlidesAfter")(addSlidesAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addSlidesBefore)) __obj.updateDynamic("addSlidesBefore")(addSlidesBefore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (renderExternal != null) __obj.updateDynamic("renderExternal")(js.Any.fromFunction1(renderExternal))
    if (renderSlide != null) __obj.updateDynamic("renderSlide")(js.Any.fromFunction2(renderSlide))
    if (slides != null) __obj.updateDynamic("slides")(slides.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualOptions]
  }
}

