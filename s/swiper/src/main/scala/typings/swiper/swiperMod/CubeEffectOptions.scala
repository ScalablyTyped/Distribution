package typings.swiper.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CubeEffectOptions extends js.Object {
  var shadow: js.UndefOr[Boolean] = js.undefined
  var shadowOffset: js.UndefOr[Double] = js.undefined
  var shadowScale: js.UndefOr[Double] = js.undefined
  var slideShadows: js.UndefOr[Boolean] = js.undefined
}

object CubeEffectOptions {
  @scala.inline
  def apply(
    shadow: js.UndefOr[Boolean] = js.undefined,
    shadowOffset: Int | Double = null,
    shadowScale: Int | Double = null,
    slideShadows: js.UndefOr[Boolean] = js.undefined
  ): CubeEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (shadowScale != null) __obj.updateDynamic("shadowScale")(shadowScale.asInstanceOf[js.Any])
    if (!js.isUndefined(slideShadows)) __obj.updateDynamic("slideShadows")(slideShadows)
    __obj.asInstanceOf[CubeEffectOptions]
  }
}

