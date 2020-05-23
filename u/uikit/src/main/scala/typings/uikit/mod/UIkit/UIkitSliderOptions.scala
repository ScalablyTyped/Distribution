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
    `autoplay-interval`: js.UndefOr[Double] = js.undefined,
    center: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    finite: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    `pause-on-hover`: js.UndefOr[Boolean] = js.undefined,
    sets: js.UndefOr[Boolean] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): UIkitSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`autoplay-interval`)) __obj.updateDynamic("autoplay-interval")(`autoplay-interval`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(finite)) __obj.updateDynamic("finite")(finite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`pause-on-hover`)) __obj.updateDynamic("pause-on-hover")(`pause-on-hover`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sets)) __obj.updateDynamic("sets")(sets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSliderOptions]
  }
}

