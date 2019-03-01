package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CubeEffectOptions extends js.Object {
  var shadow: js.UndefOr[scala.Boolean] = js.undefined
  var shadowOffset: js.UndefOr[scala.Double] = js.undefined
  var shadowScale: js.UndefOr[scala.Double] = js.undefined
  var slideShadows: js.UndefOr[scala.Boolean] = js.undefined
}

object CubeEffectOptions {
  @scala.inline
  def apply(
    shadow: js.UndefOr[scala.Boolean] = js.undefined,
    shadowOffset: scala.Int | scala.Double = null,
    shadowScale: scala.Int | scala.Double = null,
    slideShadows: js.UndefOr[scala.Boolean] = js.undefined
  ): CubeEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (shadowScale != null) __obj.updateDynamic("shadowScale")(shadowScale.asInstanceOf[js.Any])
    if (!js.isUndefined(slideShadows)) __obj.updateDynamic("slideShadows")(slideShadows)
    __obj.asInstanceOf[CubeEffectOptions]
  }
}

