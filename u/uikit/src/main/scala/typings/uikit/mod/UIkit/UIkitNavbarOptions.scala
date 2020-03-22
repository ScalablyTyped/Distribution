package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitNavbarOptions extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var boundary: js.UndefOr[String] = js.undefined
  var `boundary-align`: js.UndefOr[Boolean] = js.undefined
  var `delay-hide`: js.UndefOr[Double] = js.undefined
  var `delay-show`: js.UndefOr[Double] = js.undefined
  var dropbar: js.UndefOr[Boolean] = js.undefined
  var `dropbar-mode`: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
}

object UIkitNavbarOptions {
  @scala.inline
  def apply(
    align: String = null,
    boundary: String = null,
    `boundary-align`: js.UndefOr[Boolean] = js.undefined,
    `delay-hide`: Int | Double = null,
    `delay-show`: Int | Double = null,
    dropbar: js.UndefOr[Boolean] = js.undefined,
    `dropbar-mode`: String = null,
    duration: Int | Double = null,
    mode: String = null,
    offset: Int | Double = null
  ): UIkitNavbarOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (!js.isUndefined(`boundary-align`)) __obj.updateDynamic("boundary-align")(`boundary-align`.asInstanceOf[js.Any])
    if (`delay-hide` != null) __obj.updateDynamic("delay-hide")(`delay-hide`.asInstanceOf[js.Any])
    if (`delay-show` != null) __obj.updateDynamic("delay-show")(`delay-show`.asInstanceOf[js.Any])
    if (!js.isUndefined(dropbar)) __obj.updateDynamic("dropbar")(dropbar.asInstanceOf[js.Any])
    if (`dropbar-mode` != null) __obj.updateDynamic("dropbar-mode")(`dropbar-mode`.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitNavbarOptions]
  }
}

