package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var renderExternal: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var renderSlide: js.UndefOr[js.Function2[/* slide */ js.Any, /* index */ js.Any, _]] = js.undefined
  var slides: js.UndefOr[js.Array[_]] = js.undefined
}

object VirtualOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    renderExternal: js.Function1[/* data */ js.Any, _] = null,
    renderSlide: js.Function2[/* slide */ js.Any, /* index */ js.Any, _] = null,
    slides: js.Array[_] = null
  ): VirtualOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (renderExternal != null) __obj.updateDynamic("renderExternal")(renderExternal)
    if (renderSlide != null) __obj.updateDynamic("renderSlide")(renderSlide)
    if (slides != null) __obj.updateDynamic("slides")(slides)
    __obj.asInstanceOf[VirtualOptions]
  }
}

