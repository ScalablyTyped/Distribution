package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverflowEffectOptions extends js.Object {
  var depth: js.UndefOr[scala.Double] = js.undefined
  var modifier: js.UndefOr[scala.Double] = js.undefined
  var rotate: js.UndefOr[scala.Double] = js.undefined
  var slideShadows: js.UndefOr[scala.Boolean] = js.undefined
  var stretch: js.UndefOr[scala.Double] = js.undefined
}

object CoverflowEffectOptions {
  @scala.inline
  def apply(
    depth: scala.Int | scala.Double = null,
    modifier: scala.Int | scala.Double = null,
    rotate: scala.Int | scala.Double = null,
    slideShadows: js.UndefOr[scala.Boolean] = js.undefined,
    stretch: scala.Int | scala.Double = null
  ): CoverflowEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(slideShadows)) __obj.updateDynamic("slideShadows")(slideShadows)
    if (stretch != null) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverflowEffectOptions]
  }
}

