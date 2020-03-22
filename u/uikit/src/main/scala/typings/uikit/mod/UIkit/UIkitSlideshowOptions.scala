package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitSlideshowOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var `autoplay-interval`: js.UndefOr[Double] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var finite: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var `max-height`: js.UndefOr[Boolean | Double] = js.undefined
  var `min-height`: js.UndefOr[Boolean | Double] = js.undefined
  var `pause-on-hover`: js.UndefOr[Boolean] = js.undefined
  var ratio: js.UndefOr[String | Double] = js.undefined
  var velocity: js.UndefOr[Double] = js.undefined
}

object UIkitSlideshowOptions {
  @scala.inline
  def apply(
    animation: String = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    `autoplay-interval`: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    finite: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    `max-height`: Boolean | Double = null,
    `min-height`: Boolean | Double = null,
    `pause-on-hover`: js.UndefOr[Boolean] = js.undefined,
    ratio: String | Double = null,
    velocity: Int | Double = null
  ): UIkitSlideshowOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (`autoplay-interval` != null) __obj.updateDynamic("autoplay-interval")(`autoplay-interval`.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(finite)) __obj.updateDynamic("finite")(finite.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (`max-height` != null) __obj.updateDynamic("max-height")(`max-height`.asInstanceOf[js.Any])
    if (`min-height` != null) __obj.updateDynamic("min-height")(`min-height`.asInstanceOf[js.Any])
    if (!js.isUndefined(`pause-on-hover`)) __obj.updateDynamic("pause-on-hover")(`pause-on-hover`.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSlideshowOptions]
  }
}

