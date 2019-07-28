package typings.swiper.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FadeEffectOptions extends js.Object {
  var crossfade: js.UndefOr[Boolean] = js.undefined
}

object FadeEffectOptions {
  @scala.inline
  def apply(crossfade: js.UndefOr[Boolean] = js.undefined): FadeEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crossfade)) __obj.updateDynamic("crossfade")(crossfade)
    __obj.asInstanceOf[FadeEffectOptions]
  }
}

