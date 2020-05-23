package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitLightboxPanelOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var `autoplay-interval`: js.UndefOr[Double] = js.undefined
  var `delay-controls`: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `pause-on-hover`: js.UndefOr[Boolean] = js.undefined
  var preload: js.UndefOr[Double] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var velocity: js.UndefOr[Double] = js.undefined
  var `video-autoplay`: js.UndefOr[Boolean] = js.undefined
}

object UIkitLightboxPanelOptions {
  @scala.inline
  def apply(
    animation: String = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    `autoplay-interval`: js.UndefOr[Double] = js.undefined,
    `delay-controls`: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    items: js.Array[js.Object] = null,
    `pause-on-hover`: js.UndefOr[Boolean] = js.undefined,
    preload: js.UndefOr[Double] = js.undefined,
    template: String = null,
    velocity: js.UndefOr[Double] = js.undefined,
    `video-autoplay`: js.UndefOr[Boolean] = js.undefined
  ): UIkitLightboxPanelOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`autoplay-interval`)) __obj.updateDynamic("autoplay-interval")(`autoplay-interval`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`delay-controls`)) __obj.updateDynamic("delay-controls")(`delay-controls`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(`pause-on-hover`)) __obj.updateDynamic("pause-on-hover")(`pause-on-hover`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`video-autoplay`)) __obj.updateDynamic("video-autoplay")(`video-autoplay`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitLightboxPanelOptions]
  }
}

