package typings.swiper.mod

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
    shadowOffset: js.UndefOr[Double] = js.undefined,
    shadowScale: js.UndefOr[Double] = js.undefined,
    slideShadows: js.UndefOr[Boolean] = js.undefined
  ): CubeEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffset)) __obj.updateDynamic("shadowOffset")(shadowOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowScale)) __obj.updateDynamic("shadowScale")(shadowScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slideShadows)) __obj.updateDynamic("slideShadows")(slideShadows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubeEffectOptions]
  }
}

