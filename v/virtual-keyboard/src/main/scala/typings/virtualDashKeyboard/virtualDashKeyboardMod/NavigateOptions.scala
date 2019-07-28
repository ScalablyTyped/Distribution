package typings.virtualDashKeyboard.virtualDashKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateOptions extends js.Object {
  var focusClass: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[js.Array[Double]] = js.undefined
  var rowLooping: js.UndefOr[Boolean] = js.undefined
  var toggleMode: js.UndefOr[Boolean] = js.undefined
}

object NavigateOptions {
  @scala.inline
  def apply(
    focusClass: String = null,
    position: js.Array[Double] = null,
    rowLooping: js.UndefOr[Boolean] = js.undefined,
    toggleMode: js.UndefOr[Boolean] = js.undefined
  ): NavigateOptions = {
    val __obj = js.Dynamic.literal()
    if (focusClass != null) __obj.updateDynamic("focusClass")(focusClass)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(rowLooping)) __obj.updateDynamic("rowLooping")(rowLooping)
    if (!js.isUndefined(toggleMode)) __obj.updateDynamic("toggleMode")(toggleMode)
    __obj.asInstanceOf[NavigateOptions]
  }
}

