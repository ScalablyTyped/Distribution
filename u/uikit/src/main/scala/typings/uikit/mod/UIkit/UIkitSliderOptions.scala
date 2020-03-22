package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitSliderOptions extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var `autoplay-interval`: js.UndefOr[Double] = js.undefined
  var center: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var finite: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var `pause-on-hover`: js.UndefOr[Boolean] = js.undefined
  var sets: js.UndefOr[Boolean] = js.undefined
  var velocity: js.UndefOr[Double] = js.undefined
}

object UIkitSliderOptions {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    `autoplay-interval`: Int | Double = null,
    center: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    finite: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    `pause-on-hover`: js.UndefOr[Boolean] = js.undefined,
    sets: js.UndefOr[Boolean] = js.undefined,
    velocity: Int | Double = null
  ): UIkitSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (`autoplay-interval` != null) __obj.updateDynamic("autoplay-interval")(`autoplay-interval`.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(finite)) __obj.updateDynamic("finite")(finite.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(`pause-on-hover`)) __obj.updateDynamic("pause-on-hover")(`pause-on-hover`.asInstanceOf[js.Any])
    if (!js.isUndefined(sets)) __obj.updateDynamic("sets")(sets.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSliderOptions]
  }
}

