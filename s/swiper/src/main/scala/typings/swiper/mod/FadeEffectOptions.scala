package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FadeEffectOptions extends js.Object {
  var crossFade: js.UndefOr[Boolean] = js.undefined
}

object FadeEffectOptions {
  @scala.inline
  def apply(crossFade: js.UndefOr[Boolean] = js.undefined): FadeEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crossFade)) __obj.updateDynamic("crossFade")(crossFade.asInstanceOf[js.Any])
    __obj.asInstanceOf[FadeEffectOptions]
  }
}

