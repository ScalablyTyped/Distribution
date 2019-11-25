package typings.swiper.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var onlyInViewport: js.UndefOr[Boolean] = js.undefined
}

object KeyboardOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, onlyInViewport: js.UndefOr[Boolean] = js.undefined): KeyboardOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyInViewport)) __obj.updateDynamic("onlyInViewport")(onlyInViewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardOptions]
  }
}

