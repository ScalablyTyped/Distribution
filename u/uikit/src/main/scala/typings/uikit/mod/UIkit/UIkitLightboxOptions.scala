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
    autoplay: Int | Double = null,
    `autoplay-interval`: Int | Double = null,
    index: String = null,
    `pause-on-hover`: js.UndefOr[Boolean] = js.undefined,
    toggle: String = null,
    `video-autoplay`: js.UndefOr[Boolean] = js.undefined
  ): UIkitLightboxOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (`autoplay-interval` != null) __obj.updateDynamic("autoplay-interval")(`autoplay-interval`.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(`pause-on-hover`)) __obj.updateDynamic("pause-on-hover")(`pause-on-hover`.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (!js.isUndefined(`video-autoplay`)) __obj.updateDynamic("video-autoplay")(`video-autoplay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitLightboxOptions]
  }
}

