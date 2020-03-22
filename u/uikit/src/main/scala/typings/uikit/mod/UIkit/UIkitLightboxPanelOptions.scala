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
    `autoplay-interval`: Int | Double = null,
    `delay-controls`: Int | Double = null,
    index: Int | Double = null,
    items: js.Array[js.Object] = null,
    `pause-on-hover`: js.UndefOr[Boolean] = js.undefined,
    preload: Int | Double = null,
    template: String = null,
    velocity: Int | Double = null,
    `video-autoplay`: js.UndefOr[Boolean] = js.undefined
  ): UIkitLightboxPanelOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (`autoplay-interval` != null) __obj.updateDynamic("autoplay-interval")(`autoplay-interval`.asInstanceOf[js.Any])
    if (`delay-controls` != null) __obj.updateDynamic("delay-controls")(`delay-controls`.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(`pause-on-hover`)) __obj.updateDynamic("pause-on-hover")(`pause-on-hover`.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    if (!js.isUndefined(`video-autoplay`)) __obj.updateDynamic("video-autoplay")(`video-autoplay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitLightboxPanelOptions]
  }
}

