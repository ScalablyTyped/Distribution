package typings.textMaskCore.mod

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTextMaskConfig extends js.Object {
  var guide: js.UndefOr[String] = js.undefined
  var inputElement: HTMLInputElement
  var keepCharPositions: js.UndefOr[Boolean] = js.undefined
  var mask: Mask
  var pipe: js.UndefOr[Pipe] = js.undefined
  var placeholderChar: js.UndefOr[String] = js.undefined
  var showMask: js.UndefOr[Boolean] = js.undefined
}

object CreateTextMaskConfig {
  @scala.inline
  def apply(
    inputElement: HTMLInputElement,
    mask: Mask,
    guide: String = null,
    keepCharPositions: js.UndefOr[Boolean] = js.undefined,
    pipe: (/* conformedValue */ String, /* config */ js.Any) => PipeResult = null,
    placeholderChar: String = null,
    showMask: js.UndefOr[Boolean] = js.undefined
  ): CreateTextMaskConfig = {
    val __obj = js.Dynamic.literal(inputElement = inputElement.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    if (guide != null) __obj.updateDynamic("guide")(guide.asInstanceOf[js.Any])
    if (!js.isUndefined(keepCharPositions)) __obj.updateDynamic("keepCharPositions")(keepCharPositions.get.asInstanceOf[js.Any])
    if (pipe != null) __obj.updateDynamic("pipe")(js.Any.fromFunction2(pipe))
    if (placeholderChar != null) __obj.updateDynamic("placeholderChar")(placeholderChar.asInstanceOf[js.Any])
    if (!js.isUndefined(showMask)) __obj.updateDynamic("showMask")(showMask.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTextMaskConfig]
  }
}

