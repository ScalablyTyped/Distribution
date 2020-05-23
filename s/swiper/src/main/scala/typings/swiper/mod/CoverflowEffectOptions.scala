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
    depth: js.UndefOr[Double] = js.undefined,
    modifier: js.UndefOr[Double] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined,
    slideShadows: js.UndefOr[Boolean] = js.undefined,
    stretch: js.UndefOr[Double] = js.undefined
  ): CoverflowEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifier)) __obj.updateDynamic("modifier")(modifier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slideShadows)) __obj.updateDynamic("slideShadows")(slideShadows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stretch)) __obj.updateDynamic("stretch")(stretch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverflowEffectOptions]
  }
}

