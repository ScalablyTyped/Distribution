package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitLightboxOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var autoplay: js.UndefOr[Double] = js.undefined
  var `autoplay-interval`: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var `pause-on-hover`: js.UndefOr[Boolean] = js.undefined
  var toggle: js.UndefOr[String] = js.undefined
  var `video-autoplay`: js.UndefOr[Boolean] = js.undefined
}

object UIkitLightboxOptions {
  @scala.inline
  def apply(
    animation: String = null,
    autoplay: js.UndefOr[Double] = js.undefined,
    `autoplay-interval`: js.UndefOr[Double] = js.undefined,
    index: String = null,
    `pause-on-hover`: js.UndefOr[Boolean] = js.undefined,
    toggle: String = null,
    `video-autoplay`: js.UndefOr[Boolean] = js.undefined
  ): UIkitLightboxOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`autoplay-interval`)) __obj.updateDynamic("autoplay-interval")(`autoplay-interval`.get.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(`pause-on-hover`)) __obj.updateDynamic("pause-on-hover")(`pause-on-hover`.get.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (!js.isUndefined(`video-autoplay`)) __obj.updateDynamic("video-autoplay")(`video-autoplay`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitLightboxOptions]
  }
}

