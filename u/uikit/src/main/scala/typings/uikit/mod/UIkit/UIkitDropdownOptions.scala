package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitDropdownOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var boundary: js.UndefOr[String] = js.undefined
  var `boundary-align`: js.UndefOr[Boolean] = js.undefined
  var `delay-hide`: js.UndefOr[Double] = js.undefined
  var `delay-show`: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var flip: js.UndefOr[Boolean | String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var pos: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[String | Boolean] = js.undefined
}

object UIkitDropdownOptions {
  @scala.inline
  def apply(
    animation: String = null,
    boundary: String = null,
    `boundary-align`: js.UndefOr[Boolean] = js.undefined,
    `delay-hide`: Int | Double = null,
    `delay-show`: Int | Double = null,
    duration: Int | Double = null,
    flip: Boolean | String = null,
    mode: String = null,
    offset: Int | Double = null,
    pos: String = null,
    toggle: String | Boolean = null
  ): UIkitDropdownOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (!js.isUndefined(`boundary-align`)) __obj.updateDynamic("boundary-align")(`boundary-align`.asInstanceOf[js.Any])
    if (`delay-hide` != null) __obj.updateDynamic("delay-hide")(`delay-hide`.asInstanceOf[js.Any])
    if (`delay-show` != null) __obj.updateDynamic("delay-show")(`delay-show`.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitDropdownOptions]
  }
}

