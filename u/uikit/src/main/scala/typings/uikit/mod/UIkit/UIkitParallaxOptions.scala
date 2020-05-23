package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitParallaxOptions extends js.Object {
  var easing: js.UndefOr[Double] = js.undefined
  var media: js.UndefOr[Double | String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var viewport: js.UndefOr[Double] = js.undefined
}

object UIkitParallaxOptions {
  @scala.inline
  def apply(
    easing: js.UndefOr[Double] = js.undefined,
    media: Double | String = null,
    target: String = null,
    viewport: js.UndefOr[Double] = js.undefined
  ): UIkitParallaxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(easing)) __obj.updateDynamic("easing")(easing.get.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(viewport)) __obj.updateDynamic("viewport")(viewport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitParallaxOptions]
  }
}

