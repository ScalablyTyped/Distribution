package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverflowEffectOptions extends js.Object {
  var depth: js.UndefOr[Double] = js.undefined
  var modifier: js.UndefOr[Double] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var slideShadows: js.UndefOr[Boolean] = js.undefined
  var stretch: js.UndefOr[Double] = js.undefined
}

object CoverflowEffectOptions {
  @scala.inline
  def apply(
    depth: Int | Double = null,
    modifier: Int | Double = null,
    rotate: Int | Double = null,
    slideShadows: js.UndefOr[Boolean] = js.undefined,
    stretch: Int | Double = null
  ): CoverflowEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(slideShadows)) __obj.updateDynamic("slideShadows")(slideShadows.asInstanceOf[js.Any])
    if (stretch != null) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverflowEffectOptions]
  }
}

