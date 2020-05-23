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
    `delay-hide`: js.UndefOr[Double] = js.undefined,
    `delay-show`: js.UndefOr[Double] = js.undefined,
    dropbar: js.UndefOr[Boolean] = js.undefined,
    `dropbar-mode`: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    offset: js.UndefOr[Double] = js.undefined
  ): UIkitNavbarOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (!js.isUndefined(`boundary-align`)) __obj.updateDynamic("boundary-align")(`boundary-align`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`delay-hide`)) __obj.updateDynamic("delay-hide")(`delay-hide`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`delay-show`)) __obj.updateDynamic("delay-show")(`delay-show`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropbar)) __obj.updateDynamic("dropbar")(dropbar.get.asInstanceOf[js.Any])
    if (`dropbar-mode` != null) __obj.updateDynamic("dropbar-mode")(`dropbar-mode`.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitNavbarOptions]
  }
}

